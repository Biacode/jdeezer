package org.biacode.jdeezer.client

import org.apache.commons.io.IOUtils
import org.apache.http.client.fluent.Request
import org.biacode.jdeezer.client.common.AbstractJDeezerClient
import org.biacode.jdeezer.model.authentication.AuthenticationResponseModel
import org.biacode.jdeezer.model.authentication.request.AuthenticationRequest
import org.biacode.jdeezer.model.authentication.response.AuthenticationResponse
import org.biacode.jdeezer.model.common.response.ErrorResponseModel
import org.biacode.jdeezer.model.common.response.ErrorTypeModel
import org.biacode.jdeezer.util.AuthenticationUtils.buildAuthenticationUrl
import org.slf4j.LoggerFactory
import java.nio.charset.Charset
import java.util.*

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 8:47 PM
 *
 * Provides authentication API client functionality
 */
class AuthenticationClient : AbstractJDeezerClient() {

    /**
     * Authenticates and gets access token for given request
     *
     * @param request Authentication request
     * @return AuthenticationResponse which contains needed access_token
     */
    fun authenticate(request: AuthenticationRequest): AuthenticationResponse {
        LOGGER.debug("Processing authentication for request - {}", request)
        val authenticationUrl = buildAuthenticationUrl(request.appId, request.secret, request.code, request.output)
        LOGGER.debug("Successfully got authenticationUrl - {}", authenticationUrl)
        return Request.Get(authenticationUrl).execute().handleResponse { httpResponse ->
            LOGGER.debug("Successfully got httpResponse - {}", httpResponse)
            Optional.of(httpResponse).filter { it.statusLine.statusCode == 200 }
                    .map {
                        val authorizationToken = IOUtils.toString(it.entity.content, Charset.defaultCharset())
                        if (authorizationToken == "wrong code") {
                            LOGGER.error("Got wrong code - {}", request.code)
                            val errorTypeModel = ErrorTypeModel.getByCode(it.statusLine.statusCode)
                            val authenticationResponse = AuthenticationResponse()
                            authenticationResponse.error = ErrorResponseModel(errorTypeModel.errorType, "wrong code", errorTypeModel.code)
                            authenticationResponse
                        } else {
                            AuthenticationResponse(objectMapper.readValue(authorizationToken, AuthenticationResponseModel::class.java))
                        }
                    }
                    .orElseGet {
                        val errorTypeModel = ErrorTypeModel.getByCode(httpResponse.statusLine.statusCode)
                        val authenticationResponse = AuthenticationResponse()
                        authenticationResponse.error = ErrorResponseModel(errorTypeModel.errorType, "wrong code", errorTypeModel.code)
                        authenticationResponse
                    }
        }
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(AuthenticationClient::class.java)
    }

}
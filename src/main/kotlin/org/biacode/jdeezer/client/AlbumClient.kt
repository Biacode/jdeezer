package org.biacode.jdeezer.client

import com.fasterxml.jackson.module.kotlin.readValue
import org.apache.http.client.fluent.Request
import org.apache.http.client.utils.URIBuilder
import org.biacode.jdeezer.client.common.AbstractJDeezerClient
import org.biacode.jdeezer.model.album.AlbumResponseModel
import org.biacode.jdeezer.model.album.request.AlbumRequest
import org.biacode.jdeezer.model.album.response.AlbumResponse
import org.biacode.jdeezer.util.JDeezerGlobals
import org.slf4j.LoggerFactory

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 11:12 PM
 *
 * Provides album API client functionality
 *
 * Example: [https://api.deezer.com/album/302127]
 */
class AlbumClient : AbstractJDeezerClient() {

    /**
     * Fetch album data with some pagination defaults to index = 0 and limit = 10
     *
     * @param request The album request
     * @return Album response or error
     */
    fun album(request: AlbumRequest): AlbumResponse {
        LOGGER.debug("Processing fetch album request - {}", request)
        val uriBuilder = URIBuilder("${JDeezerGlobals.API_BASE_URL}album/${request.albumId}")
                .addParameter("index", request.index.toString())
                .addParameter("limit", request.limit.toString())
        val response = Request.Get(uriBuilder.build()).execute()
        return response.handleResponse { httpResponse ->
            val responseAsMap: Map<String, Any> = objectMapper.readValue(httpResponse.entity.content)
            if (responseAsMap.containsKey("error")) {
                objectMapper.convertValue(responseAsMap, AlbumResponse::class.java)
            } else {
                AlbumResponse(objectMapper.convertValue(responseAsMap, AlbumResponseModel::class.java))
            }
        }
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(AlbumClient::class.java)
    }
}
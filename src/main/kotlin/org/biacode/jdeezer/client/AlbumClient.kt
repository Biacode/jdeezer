package org.biacode.jdeezer.client

import com.fasterxml.jackson.module.kotlin.readValue
import org.apache.http.client.fluent.Request
import org.apache.http.client.utils.URIBuilder
import org.biacode.jdeezer.client.common.AbstractJDeezerClient
import org.biacode.jdeezer.model.album.AlbumResponseModel
import org.biacode.jdeezer.model.album.comment.AlbumCommentsResponseModel
import org.biacode.jdeezer.model.album.comment.request.AlbumCommentRequest
import org.biacode.jdeezer.model.album.comment.response.AlbumCommentResponse
import org.biacode.jdeezer.model.album.fan.AlbumFansResponseModel
import org.biacode.jdeezer.model.album.fan.request.AlbumFansRequest
import org.biacode.jdeezer.model.album.fan.response.AlbumFansResponse
import org.biacode.jdeezer.model.album.request.AlbumRequest
import org.biacode.jdeezer.model.album.response.AlbumResponse
import org.biacode.jdeezer.model.album.track.AlbumTracksResponseModel
import org.biacode.jdeezer.model.album.track.request.AlbumTracksRequest
import org.biacode.jdeezer.model.album.track.response.AlbumTracksResponse
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
            LOGGER.debug("Successfully got httpResponse - {}", httpResponse)
            val responseAsMap: Map<String, Any> = objectMapper.readValue(httpResponse.entity.content)
            if (responseAsMap.containsKey("error")) {
                LOGGER.error("Error - {} occurs while processing request - {}", responseAsMap, request)
                objectMapper.convertValue(responseAsMap, AlbumResponse::class.java)
            } else {
                LOGGER.debug("Successfully fetch album data - {}", responseAsMap)
                AlbumResponse(objectMapper.convertValue(responseAsMap, AlbumResponseModel::class.java))
            }
        }
    }

    /**
     * Fetch album comments data with some pagination defaults to index = 0 and limit = 10
     *
     * @param request The album comments request
     * @return Album comments response or error
     */
    fun comments(request: AlbumCommentRequest): AlbumCommentResponse {
        LOGGER.debug("Processing fetch album comments request - {}", request)
        val uriBuilder = URIBuilder("${JDeezerGlobals.API_BASE_URL}album/${request.albumId}/comments")
                .addParameter("index", request.index.toString())
                .addParameter("limit", request.limit.toString())
        val response = Request.Get(uriBuilder.build()).execute()
        return response.handleResponse { httpResponse ->
            LOGGER.debug("Successfully got httpResponse - {}", httpResponse)
            val responseAsMap: Map<String, Any> = objectMapper.readValue(httpResponse.entity.content)
            if (responseAsMap.containsKey("error")) {
                LOGGER.error("Error - {} occurs while processing request - {}", responseAsMap, request)
                objectMapper.convertValue(responseAsMap, AlbumCommentResponse::class.java)
            } else {
                LOGGER.debug("Successfully fetch album comments data - {}", responseAsMap)
                AlbumCommentResponse(objectMapper.convertValue(responseAsMap, AlbumCommentsResponseModel::class.java))
            }
        }
    }

    /**
     * Fetch album fans data with some pagination defaults to index = 0 and limit = 10
     *
     * @param request The album fans request
     * @return Album fans response or error
     */
    fun fans(request: AlbumFansRequest): AlbumFansResponse {
        LOGGER.debug("Processing fetch album fans request - {}", request)
        val uriBuilder = URIBuilder("${JDeezerGlobals.API_BASE_URL}album/${request.albumId}/fans")
                .addParameter("index", request.index.toString())
                .addParameter("limit", request.limit.toString())
        val response = Request.Get(uriBuilder.build()).execute()
        return response.handleResponse { httpResponse ->
            LOGGER.debug("Successfully got httpResponse - {}", httpResponse)
            val responseAsMap: Map<String, Any> = objectMapper.readValue(httpResponse.entity.content)
            if (responseAsMap.containsKey("error")) {
                LOGGER.error("Error - {} occurs while processing request - {}", responseAsMap, request)
                objectMapper.convertValue(responseAsMap, AlbumFansResponse::class.java)
            } else {
                LOGGER.debug("Successfully fetch album fans data - {}", responseAsMap)
                AlbumFansResponse(objectMapper.convertValue(responseAsMap, AlbumFansResponseModel::class.java))
            }
        }
    }

    /**
     * Fetch album tracks data with some pagination defaults to index = 0 and limit = 10
     *
     * @param request The album tracks request
     * @return Album tracks response or error
     */
    fun tracks(request: AlbumTracksRequest): AlbumTracksResponse {
        LOGGER.debug("Processing fetch album tracks request - {}", request)
        val uriBuilder = URIBuilder("${JDeezerGlobals.API_BASE_URL}album/${request.albumId}/tracks")
                .addParameter("index", request.index.toString())
                .addParameter("limit", request.limit.toString())
        val response = Request.Get(uriBuilder.build()).execute()
        return response.handleResponse { httpResponse ->
            LOGGER.debug("Successfully got httpResponse - {}", httpResponse)
            val responseAsMap: Map<String, Any> = objectMapper.readValue(httpResponse.entity.content)
            if (responseAsMap.containsKey("error")) {
                LOGGER.error("Error - {} occurs while processing request - {}", responseAsMap, request)
                objectMapper.convertValue(responseAsMap, AlbumTracksResponse::class.java)
            } else {
                LOGGER.debug("Successfully fetch album tracks data - {}", responseAsMap)
                AlbumTracksResponse(objectMapper.convertValue(responseAsMap, AlbumTracksResponseModel::class.java))
            }
        }
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(AlbumClient::class.java)
    }
}
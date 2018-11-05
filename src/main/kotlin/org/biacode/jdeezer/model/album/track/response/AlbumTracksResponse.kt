package org.biacode.jdeezer.model.album.track.response

import org.biacode.jdeezer.model.album.track.AlbumTracksResponseModel
import org.biacode.jdeezer.model.common.response.ErrorResponseModel
import org.biacode.jdeezer.model.common.response.ResultResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 12:27 AM
 */
data class AlbumTracksResponse(
        override val response: AlbumTracksResponseModel? = null,
        override var error: ErrorResponseModel? = null
) : ResultResponseModel<AlbumTracksResponseModel>(response, error)
package org.biacode.jdeezer.model.album.response

import org.biacode.jdeezer.model.album.AlbumResponseModel
import org.biacode.jdeezer.model.common.response.ErrorResponseModel
import org.biacode.jdeezer.model.common.response.ResultResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 12:27 AM
 */
data class AlbumResponse(
        override val response: AlbumResponseModel? = null,
        override var error: ErrorResponseModel? = null
) : ResultResponseModel<AlbumResponseModel>(response, error)
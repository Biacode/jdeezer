package org.biacode.jdeezer.model.album.fan.response

import org.biacode.jdeezer.model.album.fan.AlbumFansResponseModel
import org.biacode.jdeezer.model.common.response.ErrorResponseModel
import org.biacode.jdeezer.model.common.response.ResultResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 12:27 AM
 */
data class AlbumFansResponse(
        override val response: AlbumFansResponseModel? = null,
        override var error: ErrorResponseModel? = null
) : ResultResponseModel<AlbumFansResponseModel>(response, error)
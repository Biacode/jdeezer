package org.biacode.jdeezer.model.album.comment.response

import org.biacode.jdeezer.model.album.comment.AlbumCommentsResponseModel
import org.biacode.jdeezer.model.common.response.ErrorResponseModel
import org.biacode.jdeezer.model.common.response.ResultResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:35 AM
 */
data class AlbumCommentResponse(
        override val response: AlbumCommentsResponseModel? = null,
        override var error: ErrorResponseModel? = null
) : ResultResponseModel<AlbumCommentsResponseModel>(response, error)
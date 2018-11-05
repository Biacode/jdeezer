package org.biacode.jdeezer.model.comment

import org.biacode.jdeezer.model.common.response.ResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:41 AM
 */
data class AlbumCommentsResponseModel(
        val data: List<AlbumCommentModel>,
        val total: Int,
        val next: String
) : ResponseModel
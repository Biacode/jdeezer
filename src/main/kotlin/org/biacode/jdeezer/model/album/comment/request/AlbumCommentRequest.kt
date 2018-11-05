package org.biacode.jdeezer.model.album.comment.request

import org.biacode.jdeezer.model.common.request.AbstractJDeezerPaginationAwareRequest

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:35 AM
 */
data class AlbumCommentRequest(
        val albumId: Int,
        override val index: Int = 0,
        override val limit: Int = 10
) : AbstractJDeezerPaginationAwareRequest(index, limit)
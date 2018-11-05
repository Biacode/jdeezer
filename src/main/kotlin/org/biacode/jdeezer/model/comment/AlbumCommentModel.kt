package org.biacode.jdeezer.model.comment

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:42 AM
 */
data class AlbumCommentModel(
        val id: Long,
        val text: String,
        val date: Int,
        val author: AlbumCommentAuthorModel,
        val type: String
)
package org.biacode.jdeezer.model.album

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:42 AM
 */
data class AlbumCommentModel(
        val id: Long? = null,
        val text: String? = null,
        val date: Int? = null,
        val author: AlbumCommentAuthorModel? = null,
        val type: String? = null
)
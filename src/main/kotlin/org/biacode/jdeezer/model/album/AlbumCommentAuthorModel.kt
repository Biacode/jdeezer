package org.biacode.jdeezer.model.album

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:44 AM
 */
data class AlbumCommentAuthorModel(
        val id: Int? = null,
        val name: String? = null,
        val link: String? = null,
        val picture: String? = null,
        @JsonProperty("picture_small")
        val pictureSmall: String? = null,
        @JsonProperty("picture_medium")
        val pictureMedium: String? = null,
        @JsonProperty("picture_big")
        val pictureBig: String? = null,
        @JsonProperty("picture_xl")
        val pictureXl: String? = null,
        @JsonProperty("tracklist")
        val trackList: String? = null,
        val type: String? = null
)
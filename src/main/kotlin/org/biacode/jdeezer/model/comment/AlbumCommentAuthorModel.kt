package org.biacode.jdeezer.model.comment

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:44 AM
 */
data class AlbumCommentAuthorModel(
        val id: Long,
        val name: String,
        val link: String,
        val picture: String,
        @JsonProperty("picture_small")
        val pictureSmall: String,
        @JsonProperty("picture_medium")
        val pictureMedium: String,
        @JsonProperty("picture_big")
        val pictureBig: String,
        @JsonProperty("picture_xl")
        val pictureXl: String,
        @JsonProperty("tracklist")
        val trackList: String,
        val type: String
)
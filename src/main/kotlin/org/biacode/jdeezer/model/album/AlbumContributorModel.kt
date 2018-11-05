package org.biacode.jdeezer.model.album

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by Arthur Asatryan.
 * Date: 11/6/18
 * Time: 1:46 AM
 */
data class AlbumContributorModel(
        val id: Long,
        val name: String,
        val link: String,
        val share: String,
        val picture: String,
        @JsonProperty("picture_small")
        val pictureSmall: String,
        @JsonProperty("picture_medium")
        val pictureMedium: String,
        @JsonProperty("picture_big")
        val pictureBig: String,
        @JsonProperty("picture_xl")
        val pictureXl: String,
        val radio: Boolean,
        @JsonProperty("tracklist")
        val trackList: String,
        val type: String,
        val role: String
)
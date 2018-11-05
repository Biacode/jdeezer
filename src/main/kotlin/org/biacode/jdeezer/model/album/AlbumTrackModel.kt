package org.biacode.jdeezer.model.album

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by Arthur Asatryan.
 * Date: 11/6/18
 * Time: 1:53 AM
 */
data class AlbumTrackModel(
        val id: Long,
        val readable: Boolean,
        val title: String,
        @JsonProperty("title_short")
        val titleShort: String,
        @JsonProperty("title_version")
        val titleVersion: String,
        val link: String,
        val duration: Int,
        val rank: Int,
        @JsonProperty("explicit_lyrics")
        val explicitLyrics: Boolean,
        val preview: String,
        val artist: AlbumTrackArtistModel,
        val type: String
)
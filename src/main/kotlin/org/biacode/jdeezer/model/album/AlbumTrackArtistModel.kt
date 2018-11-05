package org.biacode.jdeezer.model.album

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by Arthur Asatryan.
 * Date: 11/6/18
 * Time: 1:57 AM
 */
data class AlbumTrackArtistModel(
        val id: Long,
        val name: String,
        @JsonProperty("tracklist")
        val trackList: String,
        val type: String
)
package org.biacode.jdeezer.model.album.track

import com.fasterxml.jackson.annotation.JsonProperty
import org.biacode.jdeezer.model.album.AlbumTrackArtistModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/6/18
 * Time: 2:31 AM
 */
data class AlbumTrackDataModel(
        val id: Long,
        val readable: Boolean,
        val title: String,
        @JsonProperty("title_short")
        val titleShort: String,
        @JsonProperty("title_version")
        val titleVersion: String,
        val isrc: String,
        val link: String,
        val duration: Int,
        @JsonProperty("track_position")
        val trackPosition: Int,
        @JsonProperty("disk_number")
        val diskNumber: Int,
        val rank: Int,
        @JsonProperty("explicit_lyrics")
        val explicitLyrics: Boolean,
        val preview: String,
        val artist: AlbumTrackArtistModel,
        val type: String
)
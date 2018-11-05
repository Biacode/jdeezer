package org.biacode.jdeezer.model.album

import com.fasterxml.jackson.annotation.JsonProperty
import org.biacode.jdeezer.model.common.response.ResponseModel
import java.time.LocalDate

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 12:27 AM
 */
data class AlbumResponseModel(
        val id: Int? = null,
        val title: String? = null,
        val upc: String? = null,
        val link: String? = null,
        val share: String? = null,
        val cover: String? = null,
        @JsonProperty("cover_small")
        val coverSmall: String? = null,
        @JsonProperty("cover_medium")
        val coverMedium: String? = null,
        @JsonProperty("cover_big")
        val coverBig: String? = null,
        @JsonProperty("cover_xl")
        val coverXl: String? = null,
        @JsonProperty("genre_id")
        val genreId: Int? = null,
        val genres: Any? = null, //todo,
        val label: String? = null,
        @JsonProperty("nb_tracks")
        val nbTracks: Int? = null,
        val duration: Int? = null,
        val fans: Int? = null,
        val rating: Int? = null,
        @JsonProperty("release_date")
        val releaseDate: LocalDate? = null,
        @JsonProperty("record_type")
        val recordType: String? = null,
        val available: Boolean? = null,
        val alternative: Any? = null, //todo
        @JsonProperty("tracklist")
        val trackList: String? = null,
        @JsonProperty("explicit_lyrics")
        val explicitLyrics: Boolean? = null,
        val contributors: List<Any>? = null, //todo
        val artist: Any? = null, //todo
        val type: String? = null,
        val tracks: Any? = null //todo
) : ResponseModel
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
        val id: Long,
        val title: String,
        val upc: String,
        val link: String,
        val share: String,
        val cover: String,
        @JsonProperty("cover_small")
        val coverSmall: String,
        @JsonProperty("cover_medium")
        val coverMedium: String,
        @JsonProperty("cover_big")
        val coverBig: String,
        @JsonProperty("cover_xl")
        val coverXl: String,
        @JsonProperty("genre_id")
        val genreId: Int,
        val genres: AlbumGenreDataModel,
        val label: String,
        @JsonProperty("nb_tracks")
        val nbTracks: Int,
        val duration: Int,
        val fans: Int,
        val rating: Int,
        @JsonProperty("release_date")
        val releaseDate: LocalDate,
        @JsonProperty("record_type")
        val recordType: String,
        val available: Boolean,
        val alternative: Any? = null, //todo There is no documentation about this property
        @JsonProperty("tracklist")
        val trackList: String,
        @JsonProperty("explicit_lyrics")
        val explicitLyrics: Boolean,
        val contributors: List<AlbumContributorModel>,
        val artist: AlbumArtistModel,
        val type: String,
        val tracks: AlbumTrackDataModel
) : ResponseModel
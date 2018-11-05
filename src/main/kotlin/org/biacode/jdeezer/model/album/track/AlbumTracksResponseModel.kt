package org.biacode.jdeezer.model.album.track

import org.biacode.jdeezer.model.common.response.ResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/6/18
 * Time: 2:29 AM
 */
data class AlbumTracksResponseModel(val data: List<AlbumTrackDataModel>, val total: Int, val next: String) : ResponseModel
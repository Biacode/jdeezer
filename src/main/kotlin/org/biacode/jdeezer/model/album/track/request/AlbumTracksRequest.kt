package org.biacode.jdeezer.model.album.track.request

import org.biacode.jdeezer.model.common.request.AbstractJDeezerPaginationAwareRequest

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:23 AM
 */
data class AlbumTracksRequest(
        val albumId: Int,
        override val index: Int = 0,
        override val limit: Int = 10
) : AbstractJDeezerPaginationAwareRequest(index, limit)
package org.biacode.jdeezer.model.fan

import org.biacode.jdeezer.model.common.response.ResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/6/18
 * Time: 2:14 AM
 */
data class AlbumFansResponseModel(val data: List<AlbumFanDataModel>, val total: Int, val next: String) : ResponseModel
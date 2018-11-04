package org.biacode.jdeezer.model.common.response

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:07 AM
 */
data class ErrorResponseModel(
        val type: String,
        val message: String,
        val code: Int
)
package org.biacode.jdeezer.model.common.response

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 9:12 PM
 */
abstract class ResultResponseModel<T : ResponseModel>(
        open val response: T? = null,
        open var error: ErrorResponseModel? = null
) {
    fun hasError(): Boolean = error != null
}
package org.biacode.jdeezer.model.common.response

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 9:12 PM
 */
abstract class ResultResponseModel<T : ResponseModel, E : ErrorModel>(
        open val response: T,
        open val errors: Set<E> = emptySet()
) {
    fun hasErrors(): Boolean = errors.isNotEmpty()
}
package org.biacode.jdeezer.model

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 6:12 PM
 */
enum class ErrorTypeModel(errorType: String, code: Int) {
    QUOTA("Exception", 4),
    ITEMS_LIMIT_EXCEEDED("Exception", 100),
    PERMISSION("OAuthException", 200),
    TOKEN_INVALID("OAuthException", 300),
    PARAMETER("ParameterException", 500),
    PARAMETER_MISSING("MissingParameterException", 501),
    QUERY_INVALID("InvalidQueryException", 600),
    SERVICE_BUSY("Exception", 700),
    DATA_NOT_FOUND("DataException", 800);

    companion object {
        /**
         * Gets error type by provided code.
         *
         * **Example**
         * ```kotlin
         * ErrorTypeModel.getByCode(300) == ErrorTypeModel.TOKEN_INVALID
         * ```
         */
        fun getByCode(code: Int): ErrorTypeModel {
            return when (code) {
                1 -> QUOTA
                100 -> QUOTA
                200 -> QUOTA
                300 -> QUOTA
                500 -> QUOTA
                501 -> QUOTA
                600 -> QUOTA
                700 -> QUOTA
                800 -> QUOTA
                else -> {
                    throw IllegalArgumentException("Can not find ErrorTypeModel for code - $code")
                }
            }
        }
    }
}
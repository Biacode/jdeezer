package org.biacode.jdeezer.model

import org.slf4j.LoggerFactory

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 6:12 PM
 *
 * Contains Deezer specific error messages
 */
enum class ErrorTypeModel(errorType: String, code: Int) : ErrorModel {

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

        private val LOGGER = LoggerFactory.getLogger(ErrorTypeModel::class.java)

        /**
         * Gets error type by provided code.
         *
         * **Example**
         * ```kotlin
         * ErrorTypeModel.getByCode(300) == ErrorTypeModel.TOKEN_INVALID
         * ```
         */
        fun getByCode(code: Int): ErrorTypeModel {
            LOGGER.debug("Getting ErrorTypeModel for code - {}", code)
            return when (code) {
                4 -> QUOTA
                100 -> ITEMS_LIMIT_EXCEEDED
                200 -> PERMISSION
                300 -> TOKEN_INVALID
                500 -> PARAMETER
                501 -> PARAMETER_MISSING
                600 -> QUERY_INVALID
                700 -> SERVICE_BUSY
                800 -> DATA_NOT_FOUND
                else -> {
                    LOGGER.error("Can not find ErrorTypeModel for code - {}", code)
                    throw IllegalArgumentException("Can not find ErrorTypeModel for code - $code")
                }
            }
        }
    }
}
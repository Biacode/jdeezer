package org.biacode.jdeezer.model.authentication.response

import org.biacode.jdeezer.model.authentication.AuthenticationResponseModel
import org.biacode.jdeezer.model.common.response.ErrorResponseModel
import org.biacode.jdeezer.model.common.response.ResultResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 9:04 PM
 */
data class AuthenticationResponse(
        override val response: AuthenticationResponseModel? = null,
        override var error: ErrorResponseModel? = null
) : ResultResponseModel<AuthenticationResponseModel>(response, error)
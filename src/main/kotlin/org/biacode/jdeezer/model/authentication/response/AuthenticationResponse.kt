package org.biacode.jdeezer.model.authentication.response

import org.biacode.jdeezer.model.common.response.ErrorTypeModel
import org.biacode.jdeezer.model.common.response.ResultResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 9:04 PM
 */
data class AuthenticationResponse(
    override val response: AuthenticationResponseModel = AuthenticationResponseModel(
        null
    ),
    override val errors: Set<ErrorTypeModel> = emptySet()
) : ResultResponseModel<AuthenticationResponseModel, ErrorTypeModel>(response, errors)
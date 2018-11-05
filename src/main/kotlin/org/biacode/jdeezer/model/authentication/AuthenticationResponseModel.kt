package org.biacode.jdeezer.model.authentication

import com.fasterxml.jackson.annotation.JsonProperty
import org.biacode.jdeezer.model.common.response.ResponseModel

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 9:04 PM
 */
data class AuthenticationResponseModel(
        @JsonProperty("access_token")
        val accessToken: String,
        @JsonProperty("expires")
        val expires: Int
) : ResponseModel
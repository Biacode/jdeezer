package org.biacode.jdeezer.model.authentication.request

import org.biacode.jdeezer.model.common.request.AbstractJDeezerRequest

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 10:37 PM
 */
data class AuthenticationRequest(
    val appId: Int,
    val secret: String,
    val code: String,
    val output: String = "json"
) : AbstractJDeezerRequest()
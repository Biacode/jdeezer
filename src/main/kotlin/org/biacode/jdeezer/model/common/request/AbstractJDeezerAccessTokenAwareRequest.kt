package org.biacode.jdeezer.model.common.request

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 10:37 PM
 */
abstract class AbstractJDeezerAccessTokenAwareRequest(
        @JsonProperty("access_token")
        open val accessToken: String
)
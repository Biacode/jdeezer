package org.biacode.jdeezer.client

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jdeezer.model.authentication.AuthenticationRequest
import org.biacode.jdeezer.model.common.response.ErrorTypeModel
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 10:43 PM
 */
class AuthenticationClientTest {

    //region Test methods
    @Test
    fun `test authenticate`() {
        val authenticationResponse = AuthenticationClient()
            .authenticate(
                AuthenticationRequest(
                    7,
                    "secret",
                    "code",
                    "json"
                )
            )
        assertThat(authenticationResponse.errors).contains(ErrorTypeModel.PERMISSION)
    }
    //endregion
}
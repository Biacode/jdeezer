package org.biacode.jdeezer.client

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jdeezer.model.authentication.request.AuthenticationRequest
import org.biacode.jdeezer.model.common.response.ErrorTypeModel
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 10:43 PM
 */
class AuthenticationClientTest {

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
        assertThat(authenticationResponse.error!!.code).isEqualTo(ErrorTypeModel.PERMISSION.code)
    }
}
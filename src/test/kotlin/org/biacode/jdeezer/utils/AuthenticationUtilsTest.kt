package org.biacode.jdeezer.utils

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jdeezer.util.AuthenticationUtils
import org.biacode.jdeezer.util.JDeezerGlobals
import org.junit.Test
import java.util.*

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 8:24 PM
 */
class AuthenticationUtilsTest {

    @Test
    fun `test buildOauthUrl`() {
        val appId = 7
        val redirectUri = "http://umooder.com/auth/deezer"
        assertThat(AuthenticationUtils.buildOauthUrl(appId, redirectUri)).contains(
                JDeezerGlobals.CONNECT_BASE_URL,
                appId.toString(),
                redirectUri,
                "basic_access"
        )
    }

    @Test
    fun `test buildAuthenticationUrl`() {
        val appId = 7
        val secret = UUID.randomUUID().toString()
        val code = UUID.randomUUID().toString()
        assertThat(
                AuthenticationUtils.buildAuthenticationUrl(
                        appId,
                        secret,
                        code
                )
        ).contains(JDeezerGlobals.CONNECT_BASE_URL, appId.toString(), secret, code)
    }
}
package org.biacode.jdeezer.util

import org.biacode.jdeezer.model.PermissionTypeModel
import org.biacode.jdeezer.util.JDeezerGlobals.CONNECT_BASE_URL

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 8:13 PM
 *
 * Authentication client provides utilities to authenticate/authorize in Deezer
 */
object AuthenticationUtils {

    /**
     * Builds Deezer OAuth URL
     *
     * *Example:* [https://connect.deezer.com/oauth/auth.php?app_id=YOUR_APP_ID&redirect_uri=YOUR_REDIRECT_URI&perms=basic_access,email]
     *
     * @param appId The application ID provided by deezer developer portal
     * @param redirectUri The URI that deezer will redirect you after authentication processing completed
     * @param perms The set of permissions that you are asking from User. Defaults to `PermissionTypeModel.BASIC_ACCESS`
     * @return OAuth URL
     */
    @JvmOverloads
    fun buildOauthUrl(
        appId: Int,
        redirectUri: String,
        perms: Set<PermissionTypeModel> = setOf(PermissionTypeModel.BASIC_ACCESS)
    ): String =
        "${CONNECT_BASE_URL}oauth/auth.php?app_id=$appId&redirect_uri=$redirectUri&perms=${perms.joinToString(",") { it.permissionName }}"

    /**
     * Builds Deezer authentication URL
     *
     * *Example*: [https://connect.deezer.com/oauth/access_token.php?app_id=YOU_APP_ID&secret=YOU_APP_SECRET&code=THE_CODE_FROM_ABOVE]
     *
     * @param appId The application ID provided by deezer developer portal
     * @param secret The secret provided by deezer developer portal
     * @param code The code that you got from *redirectUri*
     * @param output Specify the format of output - json or xml. Defaults to json
     * @return Authentication URL
     */
    @JvmOverloads
    fun buildAuthenticateUrl(
        appId: Int,
        secret: String,
        code: String,
        output: String = "json"
    ): String = "${CONNECT_BASE_URL}oauth/access_token.php?app_id=$appId&secret=$secret&code=$code&output=$output"

}
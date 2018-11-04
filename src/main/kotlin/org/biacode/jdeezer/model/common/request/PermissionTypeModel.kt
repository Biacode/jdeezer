package org.biacode.jdeezer.model.common.request

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 8:47 PM
 *
 * Contains Deezer permission types
 */
enum class PermissionTypeModel(val permissionName: String) {
    BASIC_ACCESS("basic_access"),
    EMAIL("email"),
    OFFLINE_ACCESS("offline_access"),
    MANAGE_LIBRARY("manage_library"),
    MANAGE_COMMUNITY("manage_community"),
    DELETE_LIBRARY("delete_library"),
    LISTENING_HISTORY("listening_history");
}

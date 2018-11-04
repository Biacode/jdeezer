package org.biacode.jdeezer.model.common.request

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 1:22 AM
 */
abstract class AbstractJDeezerPaginationAwareRequest(open val index: Int = 0, open val limit: Int = 10)
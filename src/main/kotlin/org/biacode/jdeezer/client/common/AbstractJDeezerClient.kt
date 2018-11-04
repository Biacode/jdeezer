package org.biacode.jdeezer.client.common

import com.fasterxml.jackson.databind.ObjectMapper
import org.biacode.jdeezer.util.JDeezerClientUtils

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 10:27 PM
 */
abstract class AbstractJDeezerClient(open val objectMapper: ObjectMapper = JDeezerClientUtils.objectMapper())
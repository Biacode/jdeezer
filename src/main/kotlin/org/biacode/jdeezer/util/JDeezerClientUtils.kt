package org.biacode.jdeezer.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 10:34 PM
 *
 * Provides client utils
 */
object JDeezerClientUtils {

    /**
     * Default object mapper implementation with enabled java 8 date time and kotlin modules
     */
    fun objectMapper(): ObjectMapper = ObjectMapper()
            .registerModule(KotlinModule())
            .registerModule(JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
}
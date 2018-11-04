package org.biacode.jdeezer

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.readValue
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients
import org.assertj.core.api.Assertions.assertThat
import org.biacode.jdeezer.model.common.response.ErrorTypeModel
import org.junit.Test
import org.slf4j.LoggerFactory
import java.time.LocalDateTime


/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 5:55 PM
 */
class ClientApplicationTest {

    @Test
    fun `test logging`() {
        LOGGER.debug("Error message - {}", ErrorTypeModel.getByCode(4))
    }

    @Test
    fun `test http client`() {
        val httpclient = HttpClients.createDefault();
        val httpGet = HttpGet("http://google.com");
        val response = httpclient.execute(httpGet);
        response.use {
            LOGGER.debug("Got response - {}", it)
        }
    }

    @Test
    fun `test serialize deserialize java8 date through jackson`() {
        val date = LocalDateTime.of(2014, 12, 20, 2, 30)
        val mapper = ObjectMapper()
        mapper.registerModule(JavaTimeModule())
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        val result = mapper.writeValueAsString(date)
        val readValue: Map<String, LocalDateTime> = mapper.readValue("""{"date":"$date"}""")
        assertThat(result).contains("2014-12-20T02:30")
        assertThat(mapOf("date" to date)).isEqualTo(readValue)
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(ClientApplicationTest::class.java)
    }

}
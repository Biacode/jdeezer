package org.biacode.jdeezer

import org.biacode.jdeezer.model.ErrorTypeModel
import org.junit.Test
import org.slf4j.LoggerFactory

/**
 * Created by Arthur Asatryan.
 * Date: 11/4/18
 * Time: 5:55 PM
 */
class ClientApplicationTest {

    @Test
    fun `test initialize`() {
        LOGGER.debug("Error message - {}", ErrorTypeModel.getByCode(4))
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(ClientApplicationTest::class.java)
    }

}
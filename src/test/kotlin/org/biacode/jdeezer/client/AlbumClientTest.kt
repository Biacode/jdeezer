package org.biacode.jdeezer.client

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jdeezer.model.album.request.AlbumCommentRequest
import org.biacode.jdeezer.model.album.request.AlbumRequest
import org.junit.Test

/**
 * Created by Arthur Asatryan.
 * Date: 11/5/18
 * Time: 12:08 AM
 */
class AlbumClientTest {

    @Test
    fun `test album`() {
        val albumResponse = AlbumClient().album(AlbumRequest(302127))
        assertThat(albumResponse.hasError()).isFalse()
    }

    @Test
    fun `test album comments`() {
        val albumCommentsResponse = AlbumClient().albumComments(AlbumCommentRequest(302127))
        assertThat(albumCommentsResponse.hasError()).isFalse()
    }
}
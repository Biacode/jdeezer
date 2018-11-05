package org.biacode.jdeezer.client

import org.assertj.core.api.Assertions.assertThat
import org.biacode.jdeezer.model.album.request.AlbumRequest
import org.biacode.jdeezer.model.comment.request.AlbumCommentRequest
import org.biacode.jdeezer.model.fan.request.AlbumFansRequest
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
        val albumCommentsResponse = AlbumClient().comments(AlbumCommentRequest(302127))
        assertThat(albumCommentsResponse.hasError()).isFalse()
    }

    @Test
    fun `test album fans`() {
        val albumFansResponse = AlbumClient().fans(AlbumFansRequest(302127))
        assertThat(albumFansResponse.hasError()).isFalse()
    }
}
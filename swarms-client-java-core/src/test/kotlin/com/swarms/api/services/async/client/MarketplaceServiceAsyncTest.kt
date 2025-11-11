// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MarketplaceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listAgents() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val marketplaceServiceAsync = client.client().marketplace()

        val responseFuture = marketplaceServiceAsync.listAgents()

        val response = responseFuture.get()
        response.validate()
    }
}

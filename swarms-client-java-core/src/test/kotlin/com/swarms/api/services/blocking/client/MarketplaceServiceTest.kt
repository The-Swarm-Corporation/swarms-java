// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.models.client.marketplace.MarketplaceCreateAgentParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MarketplaceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createAgent() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val marketplaceService = client.client().marketplace()

        val response =
            marketplaceService.createAgent(
                MarketplaceCreateAgentParams.builder().numberOfItems(0L).build()
            )

        response.validate()
    }
}

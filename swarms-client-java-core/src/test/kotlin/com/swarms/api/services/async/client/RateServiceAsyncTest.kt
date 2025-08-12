// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getLimits() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rateServiceAsync = client.client().rate()

        val responseFuture = rateServiceAsync.getLimits()

        val response = responseFuture.get()
        response.validate()
    }
}

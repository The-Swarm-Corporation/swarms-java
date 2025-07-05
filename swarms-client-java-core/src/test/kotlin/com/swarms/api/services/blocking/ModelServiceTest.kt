// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listAvailable() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelService = client.models()

        val response = modelService.listAvailable()

        response.validate()
    }
}

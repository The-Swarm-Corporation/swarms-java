// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import com.swarms.api.core.JsonValue
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutoSwarmBuilderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCompletion() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autoSwarmBuilderServiceAsync = client.client().autoSwarmBuilder()

        val responseFuture =
            autoSwarmBuilderServiceAsync.createCompletion(
                AutoSwarmBuilderCreateCompletionParams.builder()
                    .description("description")
                    .addExecutionType(JsonValue.from(mapOf<String, Any>()))
                    .maxLoops(0L)
                    .maxTokens(0L)
                    .modelName("model_name")
                    .name("name")
                    .task("task")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listExecutionTypes() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autoSwarmBuilderServiceAsync = client.client().autoSwarmBuilder()

        val responseFuture = autoSwarmBuilderServiceAsync.listExecutionTypes()

        val response = responseFuture.get()
    }
}

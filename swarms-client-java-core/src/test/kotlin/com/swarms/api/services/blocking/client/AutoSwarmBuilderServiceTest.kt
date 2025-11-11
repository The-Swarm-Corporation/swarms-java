// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.core.JsonValue
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutoSwarmBuilderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCompletion() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autoSwarmBuilderService = client.client().autoSwarmBuilder()

        val response =
            autoSwarmBuilderService.createCompletion(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listExecutionTypes() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autoSwarmBuilderService = client.client().autoSwarmBuilder()

        autoSwarmBuilderService.listExecutionTypes()
    }
}

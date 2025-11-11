// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client.advancedresearch

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.models.client.advancedresearch.batch.BatchCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCompletion() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.client().advancedResearch().batch()

        val response =
            batchService.createCompletion(
                BatchCreateCompletionParams.builder()
                    .addInputSchema(
                        BatchCreateCompletionParams.InputSchema.builder()
                            .config(
                                BatchCreateCompletionParams.InputSchema.Config.builder()
                                    .description("description")
                                    .directorAgentName("director_agent_name")
                                    .directorMaxLoops(0L)
                                    .directorMaxTokens(0L)
                                    .directorModelName("director_model_name")
                                    .exaSearchMaxCharacters(0L)
                                    .exaSearchNumResults(0L)
                                    .maxLoops(0L)
                                    .name("name")
                                    .workerModelName("worker_model_name")
                                    .build()
                            )
                            .task("task")
                            .img("img")
                            .build()
                    )
                    .build()
            )

        response.forEach { it.validate() }
    }
}

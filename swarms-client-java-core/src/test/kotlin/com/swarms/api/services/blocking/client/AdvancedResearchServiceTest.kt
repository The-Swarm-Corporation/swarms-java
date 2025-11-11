// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.models.client.advancedresearch.AdvancedResearchCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdvancedResearchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCompletion() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedResearchService = client.client().advancedResearch()

        val response =
            advancedResearchService.createCompletion(
                AdvancedResearchCreateCompletionParams.builder()
                    .config(
                        AdvancedResearchCreateCompletionParams.Config.builder()
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

        response.validate()
    }
}

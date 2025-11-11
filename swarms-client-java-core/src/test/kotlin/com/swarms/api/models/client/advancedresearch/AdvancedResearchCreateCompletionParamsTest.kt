// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.advancedresearch

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedResearchCreateCompletionParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.config())
            .contains(
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
        assertThat(body.task()).contains("task")
        assertThat(body.img()).contains("img")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AdvancedResearchCreateCompletionParams.builder()
                .config(AdvancedResearchCreateCompletionParams.Config.builder().build())
                .task("task")
                .build()

        val body = params._body()

        assertThat(body.config())
            .contains(AdvancedResearchCreateCompletionParams.Config.builder().build())
        assertThat(body.task()).contains("task")
    }
}

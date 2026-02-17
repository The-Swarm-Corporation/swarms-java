// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.advancedresearch.batch

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateCompletionParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.inputSchemas().getOrNull())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateCompletionParams.builder()
                .addInputSchema(
                    BatchCreateCompletionParams.InputSchema.builder()
                        .config(BatchCreateCompletionParams.InputSchema.Config.builder().build())
                        .task("task")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.inputSchemas().getOrNull())
            .containsExactly(
                BatchCreateCompletionParams.InputSchema.builder()
                    .config(BatchCreateCompletionParams.InputSchema.Config.builder().build())
                    .task("task")
                    .build()
            )
    }
}

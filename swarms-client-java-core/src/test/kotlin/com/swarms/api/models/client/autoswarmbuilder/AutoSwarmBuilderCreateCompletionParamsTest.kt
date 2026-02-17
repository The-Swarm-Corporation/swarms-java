// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.autoswarmbuilder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoSwarmBuilderCreateCompletionParamsTest {

    @Test
    fun create() {
        AutoSwarmBuilderCreateCompletionParams.builder()
            .description("description")
            .executionType(AutoSwarmBuilderCreateCompletionParams.ExecutionType.RETURN_AGENTS)
            .maxLoops(0L)
            .maxTokens(0L)
            .modelName("model_name")
            .name("name")
            .task("task")
            .build()
    }

    @Test
    fun body() {
        val params =
            AutoSwarmBuilderCreateCompletionParams.builder()
                .description("description")
                .executionType(AutoSwarmBuilderCreateCompletionParams.ExecutionType.RETURN_AGENTS)
                .maxLoops(0L)
                .maxTokens(0L)
                .modelName("model_name")
                .name("name")
                .task("task")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.executionType())
            .contains(AutoSwarmBuilderCreateCompletionParams.ExecutionType.RETURN_AGENTS)
        assertThat(body.maxLoops()).contains(0L)
        assertThat(body.maxTokens()).contains(0L)
        assertThat(body.modelName()).contains("model_name")
        assertThat(body.name()).contains("name")
        assertThat(body.task()).contains("task")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AutoSwarmBuilderCreateCompletionParams.builder().build()

        val body = params._body()
    }
}

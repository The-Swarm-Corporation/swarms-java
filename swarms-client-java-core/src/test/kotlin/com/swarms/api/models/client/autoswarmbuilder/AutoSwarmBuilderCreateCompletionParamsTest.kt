// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.autoswarmbuilder

import com.swarms.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoSwarmBuilderCreateCompletionParamsTest {

    @Test
    fun create() {
        AutoSwarmBuilderCreateCompletionParams.builder()
            .description("description")
            .addExecutionType(JsonValue.from(mapOf<String, Any>()))
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
                .addExecutionType(JsonValue.from(mapOf<String, Any>()))
                .maxLoops(0L)
                .maxTokens(0L)
                .modelName("model_name")
                .name("name")
                .task("task")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.executionType().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
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

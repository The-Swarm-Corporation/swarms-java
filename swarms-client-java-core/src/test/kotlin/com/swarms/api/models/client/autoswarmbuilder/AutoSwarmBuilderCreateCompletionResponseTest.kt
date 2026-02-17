// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.autoswarmbuilder

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoSwarmBuilderCreateCompletionResponseTest {

    @Test
    fun create() {
        val autoSwarmBuilderCreateCompletionResponse =
            AutoSwarmBuilderCreateCompletionResponse.builder()
                .success(true)
                .jobId("job_id")
                .outputs(
                    AutoSwarmBuilderCreateCompletionResponse.Outputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timestamp("timestamp")
                .type("type")
                .usage(
                    AutoSwarmBuilderCreateCompletionResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(autoSwarmBuilderCreateCompletionResponse.success()).isEqualTo(true)
        assertThat(autoSwarmBuilderCreateCompletionResponse.jobId()).contains("job_id")
        assertThat(autoSwarmBuilderCreateCompletionResponse.outputs())
            .contains(
                AutoSwarmBuilderCreateCompletionResponse.Outputs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(autoSwarmBuilderCreateCompletionResponse.timestamp()).contains("timestamp")
        assertThat(autoSwarmBuilderCreateCompletionResponse.type()).contains("type")
        assertThat(autoSwarmBuilderCreateCompletionResponse.usage())
            .contains(
                AutoSwarmBuilderCreateCompletionResponse.Usage.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoSwarmBuilderCreateCompletionResponse =
            AutoSwarmBuilderCreateCompletionResponse.builder()
                .success(true)
                .jobId("job_id")
                .outputs(
                    AutoSwarmBuilderCreateCompletionResponse.Outputs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timestamp("timestamp")
                .type("type")
                .usage(
                    AutoSwarmBuilderCreateCompletionResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAutoSwarmBuilderCreateCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoSwarmBuilderCreateCompletionResponse),
                jacksonTypeRef<AutoSwarmBuilderCreateCompletionResponse>(),
            )

        assertThat(roundtrippedAutoSwarmBuilderCreateCompletionResponse)
            .isEqualTo(autoSwarmBuilderCreateCompletionResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.graphworkflow

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GraphWorkflowExecuteWorkflowResponseTest {

    @Test
    fun create() {
        val graphWorkflowExecuteWorkflowResponse =
            GraphWorkflowExecuteWorkflowResponse.builder()
                .jobId("job_id")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .timestamp("timestamp")
                .usage(
                    GraphWorkflowExecuteWorkflowResponse.Usage.builder()
                        .costPerAgent(0.0)
                        .inputTokens(0L)
                        .outputTokens(0L)
                        .tokenCost(0.0)
                        .totalTokens(0L)
                        .build()
                )
                .description("description")
                .name("name")
                .build()

        assertThat(graphWorkflowExecuteWorkflowResponse.jobId()).isEqualTo("job_id")
        assertThat(graphWorkflowExecuteWorkflowResponse._outputs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(graphWorkflowExecuteWorkflowResponse.status()).isEqualTo("status")
        assertThat(graphWorkflowExecuteWorkflowResponse.timestamp()).isEqualTo("timestamp")
        assertThat(graphWorkflowExecuteWorkflowResponse.usage())
            .isEqualTo(
                GraphWorkflowExecuteWorkflowResponse.Usage.builder()
                    .costPerAgent(0.0)
                    .inputTokens(0L)
                    .outputTokens(0L)
                    .tokenCost(0.0)
                    .totalTokens(0L)
                    .build()
            )
        assertThat(graphWorkflowExecuteWorkflowResponse.description()).contains("description")
        assertThat(graphWorkflowExecuteWorkflowResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val graphWorkflowExecuteWorkflowResponse =
            GraphWorkflowExecuteWorkflowResponse.builder()
                .jobId("job_id")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .timestamp("timestamp")
                .usage(
                    GraphWorkflowExecuteWorkflowResponse.Usage.builder()
                        .costPerAgent(0.0)
                        .inputTokens(0L)
                        .outputTokens(0L)
                        .tokenCost(0.0)
                        .totalTokens(0L)
                        .build()
                )
                .description("description")
                .name("name")
                .build()

        val roundtrippedGraphWorkflowExecuteWorkflowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(graphWorkflowExecuteWorkflowResponse),
                jacksonTypeRef<GraphWorkflowExecuteWorkflowResponse>(),
            )

        assertThat(roundtrippedGraphWorkflowExecuteWorkflowResponse)
            .isEqualTo(graphWorkflowExecuteWorkflowResponse)
    }
}

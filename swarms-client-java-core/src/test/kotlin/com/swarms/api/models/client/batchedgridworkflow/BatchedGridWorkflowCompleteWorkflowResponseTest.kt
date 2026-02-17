// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.batchedgridworkflow

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchedGridWorkflowCompleteWorkflowResponseTest {

    @Test
    fun create() {
        val batchedGridWorkflowCompleteWorkflowResponse =
            BatchedGridWorkflowCompleteWorkflowResponse.builder()
                .description("description")
                .jobId("job_id")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .timestamp("timestamp")
                .usage(
                    BatchedGridWorkflowCompleteWorkflowResponse.Usage.builder()
                        .costPerAgent(0.0)
                        .inputTokens(0L)
                        .outputTokens(0L)
                        .tokenCost(0.0)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        assertThat(batchedGridWorkflowCompleteWorkflowResponse.description())
            .isEqualTo("description")
        assertThat(batchedGridWorkflowCompleteWorkflowResponse.jobId()).isEqualTo("job_id")
        assertThat(batchedGridWorkflowCompleteWorkflowResponse.name()).isEqualTo("name")
        assertThat(batchedGridWorkflowCompleteWorkflowResponse._outputs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(batchedGridWorkflowCompleteWorkflowResponse.status()).isEqualTo("status")
        assertThat(batchedGridWorkflowCompleteWorkflowResponse.timestamp()).isEqualTo("timestamp")
        assertThat(batchedGridWorkflowCompleteWorkflowResponse.usage())
            .isEqualTo(
                BatchedGridWorkflowCompleteWorkflowResponse.Usage.builder()
                    .costPerAgent(0.0)
                    .inputTokens(0L)
                    .outputTokens(0L)
                    .tokenCost(0.0)
                    .totalTokens(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchedGridWorkflowCompleteWorkflowResponse =
            BatchedGridWorkflowCompleteWorkflowResponse.builder()
                .description("description")
                .jobId("job_id")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .timestamp("timestamp")
                .usage(
                    BatchedGridWorkflowCompleteWorkflowResponse.Usage.builder()
                        .costPerAgent(0.0)
                        .inputTokens(0L)
                        .outputTokens(0L)
                        .tokenCost(0.0)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        val roundtrippedBatchedGridWorkflowCompleteWorkflowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchedGridWorkflowCompleteWorkflowResponse),
                jacksonTypeRef<BatchedGridWorkflowCompleteWorkflowResponse>(),
            )

        assertThat(roundtrippedBatchedGridWorkflowCompleteWorkflowResponse)
            .isEqualTo(batchedGridWorkflowCompleteWorkflowResponse)
    }
}

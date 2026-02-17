// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchRunResponseTest {

    @Test
    fun create() {
        val batchRunResponse =
            BatchRunResponse.builder()
                .batchId("batch_id")
                .executionTime(0.0)
                .results(JsonValue.from(mapOf<String, Any>()))
                .timestamp("timestamp")
                .totalRequests(0L)
                .build()

        assertThat(batchRunResponse.batchId()).contains("batch_id")
        assertThat(batchRunResponse.executionTime()).contains(0.0)
        assertThat(batchRunResponse._results()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(batchRunResponse.timestamp()).contains("timestamp")
        assertThat(batchRunResponse.totalRequests()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchRunResponse =
            BatchRunResponse.builder()
                .batchId("batch_id")
                .executionTime(0.0)
                .results(JsonValue.from(mapOf<String, Any>()))
                .timestamp("timestamp")
                .totalRequests(0L)
                .build()

        val roundtrippedBatchRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchRunResponse),
                jacksonTypeRef<BatchRunResponse>(),
            )

        assertThat(roundtrippedBatchRunResponse).isEqualTo(batchRunResponse)
    }
}

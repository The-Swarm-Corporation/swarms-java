// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SwarmGetLogsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val swarmGetLogsResponse =
            SwarmGetLogsResponse.builder()
                .count(0L)
                .logs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .timestamp("timestamp")
                .build()

        assertThat(swarmGetLogsResponse.count()).contains(0L)
        assertThat(swarmGetLogsResponse._logs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(swarmGetLogsResponse.status()).contains("status")
        assertThat(swarmGetLogsResponse.timestamp()).contains("timestamp")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swarmGetLogsResponse =
            SwarmGetLogsResponse.builder()
                .count(0L)
                .logs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .timestamp("timestamp")
                .build()

        val roundtrippedSwarmGetLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swarmGetLogsResponse),
                jacksonTypeRef<SwarmGetLogsResponse>(),
            )

        assertThat(roundtrippedSwarmGetLogsResponse).isEqualTo(swarmGetLogsResponse)
    }
}

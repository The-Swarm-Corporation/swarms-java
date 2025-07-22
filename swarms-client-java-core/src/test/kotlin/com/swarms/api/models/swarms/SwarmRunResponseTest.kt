// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SwarmRunResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val swarmRunResponse =
            SwarmRunResponse.builder()
                .description("description")
                .executionTime(0.0)
                .jobId("job_id")
                .numberOfAgents(0L)
                .output(JsonValue.from(mapOf<String, Any>()))
                .serviceTier("service_tier")
                .status("status")
                .swarmName("swarm_name")
                .swarmType("swarm_type")
                .usage(
                    SwarmRunResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(swarmRunResponse.description()).contains("description")
        assertThat(swarmRunResponse.executionTime()).contains(0.0)
        assertThat(swarmRunResponse.jobId()).contains("job_id")
        assertThat(swarmRunResponse.numberOfAgents()).contains(0L)
        assertThat(swarmRunResponse._output()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(swarmRunResponse.serviceTier()).contains("service_tier")
        assertThat(swarmRunResponse.status()).contains("status")
        assertThat(swarmRunResponse.swarmName()).contains("swarm_name")
        assertThat(swarmRunResponse.swarmType()).contains("swarm_type")
        assertThat(swarmRunResponse.usage())
            .contains(
                SwarmRunResponse.Usage.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swarmRunResponse =
            SwarmRunResponse.builder()
                .description("description")
                .executionTime(0.0)
                .jobId("job_id")
                .numberOfAgents(0L)
                .output(JsonValue.from(mapOf<String, Any>()))
                .serviceTier("service_tier")
                .status("status")
                .swarmName("swarm_name")
                .swarmType("swarm_type")
                .usage(
                    SwarmRunResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedSwarmRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swarmRunResponse),
                jacksonTypeRef<SwarmRunResponse>(),
            )

        assertThat(roundtrippedSwarmRunResponse).isEqualTo(swarmRunResponse)
    }
}

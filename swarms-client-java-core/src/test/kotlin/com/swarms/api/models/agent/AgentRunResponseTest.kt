// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRunResponseTest {

    @Test
    fun create() {
        val agentRunResponse =
            AgentRunResponse.builder()
                .description("description")
                .jobId("job_id")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .success(true)
                .temperature(0.0)
                .timestamp("timestamp")
                .usage(
                    AgentRunResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(agentRunResponse.description()).contains("description")
        assertThat(agentRunResponse.jobId()).contains("job_id")
        assertThat(agentRunResponse.name()).contains("name")
        assertThat(agentRunResponse._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(agentRunResponse.success()).contains(true)
        assertThat(agentRunResponse.temperature()).contains(0.0)
        assertThat(agentRunResponse.timestamp()).contains("timestamp")
        assertThat(agentRunResponse.usage())
            .contains(
                AgentRunResponse.Usage.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentRunResponse =
            AgentRunResponse.builder()
                .description("description")
                .jobId("job_id")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .success(true)
                .temperature(0.0)
                .timestamp("timestamp")
                .usage(
                    AgentRunResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAgentRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentRunResponse),
                jacksonTypeRef<AgentRunResponse>(),
            )

        assertThat(roundtrippedAgentRunResponse).isEqualTo(agentRunResponse)
    }
}

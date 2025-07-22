// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentRunResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val agentRunResponse =
            AgentRunResponse.builder()
                .id("id")
                .description("description")
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

        assertThat(agentRunResponse.id()).contains("id")
        assertThat(agentRunResponse.description()).contains("description")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentRunResponse =
            AgentRunResponse.builder()
                .id("id")
                .description("description")
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

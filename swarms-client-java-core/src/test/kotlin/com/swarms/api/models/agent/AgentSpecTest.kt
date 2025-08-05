// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSpecTest {

    @Test
    fun create() {
        val agentSpec =
            AgentSpec.builder()
                .agentName("agent_name")
                .autoGeneratePrompt(true)
                .description("description")
                .dynamicTemperatureEnabled(true)
                .llmArgs(
                    AgentSpec.LlmArgs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxLoops(0L)
                .maxTokens(0L)
                .mcpUrl("mcp_url")
                .modelName("model_name")
                .role("role")
                .streamingOn(true)
                .systemPrompt("system_prompt")
                .temperature(0.0)
                .addToolsListDictionary(
                    AgentSpec.ToolsListDictionary.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(agentSpec.agentName()).contains("agent_name")
        assertThat(agentSpec.autoGeneratePrompt()).contains(true)
        assertThat(agentSpec.description()).contains("description")
        assertThat(agentSpec.dynamicTemperatureEnabled()).contains(true)
        assertThat(agentSpec.llmArgs())
            .contains(
                AgentSpec.LlmArgs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(agentSpec.maxLoops()).contains(0L)
        assertThat(agentSpec.maxTokens()).contains(0L)
        assertThat(agentSpec.mcpUrl()).contains("mcp_url")
        assertThat(agentSpec.modelName()).contains("model_name")
        assertThat(agentSpec.role()).contains("role")
        assertThat(agentSpec.streamingOn()).contains(true)
        assertThat(agentSpec.systemPrompt()).contains("system_prompt")
        assertThat(agentSpec.temperature()).contains(0.0)
        assertThat(agentSpec.toolsListDictionary().getOrNull())
            .containsExactly(
                AgentSpec.ToolsListDictionary.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentSpec =
            AgentSpec.builder()
                .agentName("agent_name")
                .autoGeneratePrompt(true)
                .description("description")
                .dynamicTemperatureEnabled(true)
                .llmArgs(
                    AgentSpec.LlmArgs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxLoops(0L)
                .maxTokens(0L)
                .mcpUrl("mcp_url")
                .modelName("model_name")
                .role("role")
                .streamingOn(true)
                .systemPrompt("system_prompt")
                .temperature(0.0)
                .addToolsListDictionary(
                    AgentSpec.ToolsListDictionary.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAgentSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentSpec),
                jacksonTypeRef<AgentSpec>(),
            )

        assertThat(roundtrippedAgentSpec).isEqualTo(agentSpec)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentCompletionTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val agentCompletion =
            AgentCompletion.builder()
                .agentConfig(
                    AgentSpec.builder()
                        .agentName("agent_name")
                        .autoGeneratePrompt(true)
                        .description("description")
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
                )
                .history(
                    AgentCompletion.History.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .img("img")
                .addImg("string")
                .task("task")
                .build()

        assertThat(agentCompletion.agentConfig())
            .contains(
                AgentSpec.builder()
                    .agentName("agent_name")
                    .autoGeneratePrompt(true)
                    .description("description")
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
            )
        assertThat(agentCompletion.history())
            .contains(
                AgentCompletion.History.ofUnionMember0(
                    AgentCompletion.History.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(agentCompletion.img()).contains("img")
        assertThat(agentCompletion.imgs().getOrNull()).containsExactly("string")
        assertThat(agentCompletion.task()).contains("task")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentCompletion =
            AgentCompletion.builder()
                .agentConfig(
                    AgentSpec.builder()
                        .agentName("agent_name")
                        .autoGeneratePrompt(true)
                        .description("description")
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
                )
                .history(
                    AgentCompletion.History.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .img("img")
                .addImg("string")
                .task("task")
                .build()

        val roundtrippedAgentCompletion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentCompletion),
                jacksonTypeRef<AgentCompletion>(),
            )

        assertThat(roundtrippedAgentCompletion).isEqualTo(agentCompletion)
    }
}

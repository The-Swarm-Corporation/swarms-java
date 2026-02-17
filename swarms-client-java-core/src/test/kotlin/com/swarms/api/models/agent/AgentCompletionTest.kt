// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCompletionTest {

    @Test
    fun create() {
        val agentCompletion =
            AgentCompletion.builder()
                .agentConfig(
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
                        .mcpConfig(
                            McpConnection.builder()
                                .authorizationToken("authorization_token")
                                .headers(
                                    McpConnection.Headers.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .timeout(0L)
                                .toolConfigurations(
                                    McpConnection.ToolConfigurations.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .transport("transport")
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .mcpConfigs(
                            AgentSpec.McpConfigs.builder()
                                .addConnection(
                                    McpConnection.builder()
                                        .authorizationToken("authorization_token")
                                        .headers(
                                            McpConnection.Headers.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .timeout(0L)
                                        .toolConfigurations(
                                            McpConnection.ToolConfigurations.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .transport("transport")
                                        .type("type")
                                        .url("url")
                                        .build()
                                )
                                .build()
                        )
                        .mcpUrl("mcp_url")
                        .modelName("model_name")
                        .reasoningEffort("reasoning_effort")
                        .reasoningEnabled(true)
                        .role("role")
                        .streamingOn(true)
                        .systemPrompt("system_prompt")
                        .temperature(0.0)
                        .thinkingTokens(0L)
                        .toolCallSummary(true)
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
                .addToolsEnabled("string")
                .build()

        assertThat(agentCompletion.agentConfig())
            .contains(
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
                    .mcpConfig(
                        McpConnection.builder()
                            .authorizationToken("authorization_token")
                            .headers(
                                McpConnection.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .timeout(0L)
                            .toolConfigurations(
                                McpConnection.ToolConfigurations.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .transport("transport")
                            .type("type")
                            .url("url")
                            .build()
                    )
                    .mcpConfigs(
                        AgentSpec.McpConfigs.builder()
                            .addConnection(
                                McpConnection.builder()
                                    .authorizationToken("authorization_token")
                                    .headers(
                                        McpConnection.Headers.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .timeout(0L)
                                    .toolConfigurations(
                                        McpConnection.ToolConfigurations.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .transport("transport")
                                    .type("type")
                                    .url("url")
                                    .build()
                            )
                            .build()
                    )
                    .mcpUrl("mcp_url")
                    .modelName("model_name")
                    .reasoningEffort("reasoning_effort")
                    .reasoningEnabled(true)
                    .role("role")
                    .streamingOn(true)
                    .systemPrompt("system_prompt")
                    .temperature(0.0)
                    .thinkingTokens(0L)
                    .toolCallSummary(true)
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
        assertThat(agentCompletion.toolsEnabled().getOrNull()).containsExactly("string")
    }

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
                        .dynamicTemperatureEnabled(true)
                        .llmArgs(
                            AgentSpec.LlmArgs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .maxLoops(0L)
                        .maxTokens(0L)
                        .mcpConfig(
                            McpConnection.builder()
                                .authorizationToken("authorization_token")
                                .headers(
                                    McpConnection.Headers.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .timeout(0L)
                                .toolConfigurations(
                                    McpConnection.ToolConfigurations.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .transport("transport")
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .mcpConfigs(
                            AgentSpec.McpConfigs.builder()
                                .addConnection(
                                    McpConnection.builder()
                                        .authorizationToken("authorization_token")
                                        .headers(
                                            McpConnection.Headers.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .timeout(0L)
                                        .toolConfigurations(
                                            McpConnection.ToolConfigurations.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .transport("transport")
                                        .type("type")
                                        .url("url")
                                        .build()
                                )
                                .build()
                        )
                        .mcpUrl("mcp_url")
                        .modelName("model_name")
                        .reasoningEffort("reasoning_effort")
                        .reasoningEnabled(true)
                        .role("role")
                        .streamingOn(true)
                        .systemPrompt("system_prompt")
                        .temperature(0.0)
                        .thinkingTokens(0L)
                        .toolCallSummary(true)
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
                .addToolsEnabled("string")
                .build()

        val roundtrippedAgentCompletion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentCompletion),
                jacksonTypeRef<AgentCompletion>(),
            )

        assertThat(roundtrippedAgentCompletion).isEqualTo(agentCompletion)
    }
}

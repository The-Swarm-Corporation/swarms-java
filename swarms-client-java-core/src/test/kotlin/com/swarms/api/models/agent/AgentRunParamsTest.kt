// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.swarms.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRunParamsTest {

    @Test
    fun create() {
        AgentRunParams.builder()
            .agentCompletion(
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
                    .stream(true)
                    .task("task")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentRunParams.builder()
                .agentCompletion(
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
                        .stream(true)
                        .task("task")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .stream(true)
                    .task("task")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentRunParams.builder().agentCompletion(AgentCompletion.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(AgentCompletion.builder().build())
    }
}

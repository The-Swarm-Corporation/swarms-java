// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.swarms.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentRunParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
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
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentRunParams.builder().agentCompletion(AgentCompletion.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(AgentCompletion.builder().build())
    }
}

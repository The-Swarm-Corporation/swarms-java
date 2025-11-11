// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.batchedgridworkflow

import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchedGridWorkflowCompleteWorkflowParamsTest {

    @Test
    fun create() {
        BatchedGridWorkflowCompleteWorkflowParams.builder()
            .addAgentCompletion(
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
                        AgentSpec.McpConfig.builder()
                            .authorizationToken("authorization_token")
                            .headers(
                                AgentSpec.McpConfig.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .timeout(0L)
                            .toolConfigurations(
                                AgentSpec.McpConfig.ToolConfigurations.builder()
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
                                AgentSpec.McpConfigs.Connection.builder()
                                    .authorizationToken("authorization_token")
                                    .headers(
                                        AgentSpec.McpConfigs.Connection.Headers.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .timeout(0L)
                                    .toolConfigurations(
                                        AgentSpec.McpConfigs.Connection.ToolConfigurations.builder()
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
            .description("description")
            .addImg("string")
            .maxLoops(0L)
            .name("name")
            .addTask("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchedGridWorkflowCompleteWorkflowParams.builder()
                .addAgentCompletion(
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
                            AgentSpec.McpConfig.builder()
                                .authorizationToken("authorization_token")
                                .headers(
                                    AgentSpec.McpConfig.Headers.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .timeout(0L)
                                .toolConfigurations(
                                    AgentSpec.McpConfig.ToolConfigurations.builder()
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
                                    AgentSpec.McpConfigs.Connection.builder()
                                        .authorizationToken("authorization_token")
                                        .headers(
                                            AgentSpec.McpConfigs.Connection.Headers.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string"),
                                                )
                                                .build()
                                        )
                                        .timeout(0L)
                                        .toolConfigurations(
                                            AgentSpec.McpConfigs.Connection.ToolConfigurations
                                                .builder()
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
                .description("description")
                .addImg("string")
                .maxLoops(0L)
                .name("name")
                .addTask("string")
                .build()

        val body = params._body()

        assertThat(body.agentCompletions().getOrNull())
            .containsExactly(
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
                        AgentSpec.McpConfig.builder()
                            .authorizationToken("authorization_token")
                            .headers(
                                AgentSpec.McpConfig.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .timeout(0L)
                            .toolConfigurations(
                                AgentSpec.McpConfig.ToolConfigurations.builder()
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
                                AgentSpec.McpConfigs.Connection.builder()
                                    .authorizationToken("authorization_token")
                                    .headers(
                                        AgentSpec.McpConfigs.Connection.Headers.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .timeout(0L)
                                    .toolConfigurations(
                                        AgentSpec.McpConfigs.Connection.ToolConfigurations.builder()
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
        assertThat(body.description()).contains("description")
        assertThat(body.imgs().getOrNull()).containsExactly("string")
        assertThat(body.maxLoops()).contains(0L)
        assertThat(body.name()).contains("name")
        assertThat(body.tasks().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BatchedGridWorkflowCompleteWorkflowParams.builder().build()

        val body = params._body()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.graphworkflow

import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.agent.McpConnection
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GraphWorkflowExecuteWorkflowParamsTest {

    @Test
    fun create() {
        GraphWorkflowExecuteWorkflowParams.builder()
            .addAgent(
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
            .autoCompile(true)
            .description("description")
            .addEdge(
                GraphWorkflowExecuteWorkflowParams.Edge.EdgeSpec.builder()
                    .source("source")
                    .target("target")
                    .metadata(
                        GraphWorkflowExecuteWorkflowParams.Edge.EdgeSpec.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .addEndPoint("string")
            .addEntryPoint("string")
            .img("img")
            .maxLoops(0L)
            .name("name")
            .task("task")
            .verbose(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            GraphWorkflowExecuteWorkflowParams.builder()
                .addAgent(
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
                .autoCompile(true)
                .description("description")
                .addEdge(
                    GraphWorkflowExecuteWorkflowParams.Edge.EdgeSpec.builder()
                        .source("source")
                        .target("target")
                        .metadata(
                            GraphWorkflowExecuteWorkflowParams.Edge.EdgeSpec.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addEndPoint("string")
                .addEntryPoint("string")
                .img("img")
                .maxLoops(0L)
                .name("name")
                .task("task")
                .verbose(true)
                .build()

        val body = params._body()

        assertThat(body.agents().getOrNull())
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
        assertThat(body.autoCompile()).contains(true)
        assertThat(body.description()).contains("description")
        assertThat(body.edges().getOrNull())
            .containsExactly(
                GraphWorkflowExecuteWorkflowParams.Edge.ofSpec(
                    GraphWorkflowExecuteWorkflowParams.Edge.EdgeSpec.builder()
                        .source("source")
                        .target("target")
                        .metadata(
                            GraphWorkflowExecuteWorkflowParams.Edge.EdgeSpec.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.endPoints().getOrNull()).containsExactly("string")
        assertThat(body.entryPoints().getOrNull()).containsExactly("string")
        assertThat(body.img()).contains("img")
        assertThat(body.maxLoops()).contains(0L)
        assertThat(body.name()).contains("name")
        assertThat(body.task()).contains("task")
        assertThat(body.verbose()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GraphWorkflowExecuteWorkflowParams.builder().build()

        val body = params._body()
    }
}

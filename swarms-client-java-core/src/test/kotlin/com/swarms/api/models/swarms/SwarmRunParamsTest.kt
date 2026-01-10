// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.agent.McpConnection
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwarmRunParamsTest {

    @Test
    fun create() {
        SwarmRunParams.builder()
            .swarmSpec(
                SwarmSpec.builder()
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
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
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
                    .heavySwarmLoopsPerAgent(0L)
                    .heavySwarmQuestionAgentModelName("heavy_swarm_question_agent_model_name")
                    .heavySwarmWorkerModelName("heavy_swarm_worker_model_name")
                    .img("img")
                    .maxLoops(0L)
                    .messagesOfUnnamedSchemaWithArrayParent1s(
                        listOf(
                            SwarmSpec.Messages.UnnamedSchemaWithArrayParent1.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                    )
                    .name("name")
                    .rearrangeFlow("rearrange_flow")
                    .rules("rules")
                    .serviceTier("service_tier")
                    .stream(true)
                    .swarmType(SwarmSpec.SwarmType.AGENT_REARRANGE)
                    .task("task")
                    .addTask("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SwarmRunParams.builder()
                .swarmSpec(
                    SwarmSpec.builder()
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
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("bar"),
                                                        )
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
                        .heavySwarmLoopsPerAgent(0L)
                        .heavySwarmQuestionAgentModelName("heavy_swarm_question_agent_model_name")
                        .heavySwarmWorkerModelName("heavy_swarm_worker_model_name")
                        .img("img")
                        .maxLoops(0L)
                        .messagesOfUnnamedSchemaWithArrayParent1s(
                            listOf(
                                SwarmSpec.Messages.UnnamedSchemaWithArrayParent1.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                        )
                        .name("name")
                        .rearrangeFlow("rearrange_flow")
                        .rules("rules")
                        .serviceTier("service_tier")
                        .stream(true)
                        .swarmType(SwarmSpec.SwarmType.AGENT_REARRANGE)
                        .task("task")
                        .addTask("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SwarmSpec.builder()
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
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
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
                    .heavySwarmLoopsPerAgent(0L)
                    .heavySwarmQuestionAgentModelName("heavy_swarm_question_agent_model_name")
                    .heavySwarmWorkerModelName("heavy_swarm_worker_model_name")
                    .img("img")
                    .maxLoops(0L)
                    .messagesOfUnnamedSchemaWithArrayParent1s(
                        listOf(
                            SwarmSpec.Messages.UnnamedSchemaWithArrayParent1.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                    )
                    .name("name")
                    .rearrangeFlow("rearrange_flow")
                    .rules("rules")
                    .serviceTier("service_tier")
                    .stream(true)
                    .swarmType(SwarmSpec.SwarmType.AGENT_REARRANGE)
                    .task("task")
                    .addTask("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SwarmRunParams.builder().swarmSpec(SwarmSpec.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(SwarmSpec.builder().build())
    }
}

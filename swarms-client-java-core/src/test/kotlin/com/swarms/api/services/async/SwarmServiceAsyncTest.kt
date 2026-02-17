// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.agent.McpConnection
import com.swarms.api.models.swarms.SwarmSpec
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SwarmServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun checkAvailable() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val swarmServiceAsync = client.swarms()

        val responseFuture = swarmServiceAsync.checkAvailable()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLogs() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val swarmServiceAsync = client.swarms()

        val responseFuture = swarmServiceAsync.getLogs()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun run() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val swarmServiceAsync = client.swarms()

        val responseFuture =
            swarmServiceAsync.run(
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

        val response = responseFuture.get()
        response.validate()
    }
}

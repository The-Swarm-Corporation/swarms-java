// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.agent

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentCompletion
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.agent.McpConnection
import com.swarms.api.models.agent.batch.BatchRunParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun run() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.agent().batch()

        val response =
            batchService.run(
                BatchRunParams.builder()
                    .addBody(
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
                    )
                    .build()
            )

        response.validate()
    }
}

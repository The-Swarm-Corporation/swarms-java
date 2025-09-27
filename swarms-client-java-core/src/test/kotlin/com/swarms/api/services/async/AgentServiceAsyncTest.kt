// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentCompletion
import com.swarms.api.models.agent.AgentSpec
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun run() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.agent()

        val responseFuture =
            agentServiceAsync.run(
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

        val response = responseFuture.get()
        response.validate()
    }
}

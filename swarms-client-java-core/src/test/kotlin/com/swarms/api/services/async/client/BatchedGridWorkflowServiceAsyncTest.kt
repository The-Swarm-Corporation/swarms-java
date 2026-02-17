// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.agent.McpConnection
import com.swarms.api.models.client.batchedgridworkflow.BatchedGridWorkflowCompleteWorkflowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchedGridWorkflowServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun completeWorkflow() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchedGridWorkflowServiceAsync = client.client().batchedGridWorkflow()

        val responseFuture =
            batchedGridWorkflowServiceAsync.completeWorkflow(
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
                    .addImg("string")
                    .maxLoops(0L)
                    .name("name")
                    .addTask("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

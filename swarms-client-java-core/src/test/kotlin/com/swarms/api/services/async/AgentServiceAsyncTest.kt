// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentCompletion
import com.swarms.api.models.agent.AgentRunParams
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}

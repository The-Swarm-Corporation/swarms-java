// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.swarms

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.swarms.SwarmSpec
import com.swarms.api.models.swarms.batch.BatchRunParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun run() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.swarms().batch()

        val responseFuture =
            batchServiceAsync.run(
                BatchRunParams.builder()
                    .addBody(
                        SwarmSpec.builder()
                            .addAgent(
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
                            .description("description")
                            .img("img")
                            .addImg("string")
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
                            .returnHistory(true)
                            .rules("rules")
                            .serviceTier("service_tier")
                            .stream(true)
                            .swarmType(SwarmSpec.SwarmType.AGENT_REARRANGE)
                            .task("task")
                            .addTask("string")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}

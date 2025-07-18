// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.agent

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentCompletion
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.agent.batch.BatchRunParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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

        response.validate()
    }
}

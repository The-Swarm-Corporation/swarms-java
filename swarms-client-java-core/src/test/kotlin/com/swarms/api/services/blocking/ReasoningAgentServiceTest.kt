// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReasoningAgentServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createCompletion() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reasoningAgentService = client.reasoningAgents()

        val response =
            reasoningAgentService.createCompletion(
                ReasoningAgentCreateCompletionParams.builder()
                    .agentName("agent_name")
                    .description("description")
                    .maxLoops(0L)
                    .memoryCapacity(0L)
                    .modelName("model_name")
                    .numKnowledgeItems(0L)
                    .numSamples(0L)
                    .outputType(ReasoningAgentCreateCompletionParams.OutputType.LIST)
                    .swarmType(ReasoningAgentCreateCompletionParams.SwarmType.REASONING_DUO)
                    .systemPrompt("system_prompt")
                    .task("task")
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listTypes() {
        val client =
            SwarmsClientOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reasoningAgentService = client.reasoningAgents()

        val response = reasoningAgentService.listTypes()

        response.validate()
    }
}

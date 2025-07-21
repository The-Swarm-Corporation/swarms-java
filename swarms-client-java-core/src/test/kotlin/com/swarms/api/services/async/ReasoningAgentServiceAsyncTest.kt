// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.TestServerExtension
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReasoningAgentServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createCompletion() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reasoningAgentServiceAsync = client.reasoningAgents()

        val responseFuture =
            reasoningAgentServiceAsync.createCompletion(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listTypes() {
        val client =
            SwarmsClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reasoningAgentServiceAsync = client.reasoningAgents()

        val responseFuture = reasoningAgentServiceAsync.listTypes()

        val response = responseFuture.get()
        response.validate()
    }
}

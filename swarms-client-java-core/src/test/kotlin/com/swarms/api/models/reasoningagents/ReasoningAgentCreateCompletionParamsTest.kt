// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.reasoningagents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReasoningAgentCreateCompletionParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.agentName()).contains("agent_name")
        assertThat(body.description()).contains("description")
        assertThat(body.maxLoops()).contains(0L)
        assertThat(body.memoryCapacity()).contains(0L)
        assertThat(body.modelName()).contains("model_name")
        assertThat(body.numKnowledgeItems()).contains(0L)
        assertThat(body.numSamples()).contains(0L)
        assertThat(body.outputType()).contains(ReasoningAgentCreateCompletionParams.OutputType.LIST)
        assertThat(body.swarmType())
            .contains(ReasoningAgentCreateCompletionParams.SwarmType.REASONING_DUO)
        assertThat(body.systemPrompt()).contains("system_prompt")
        assertThat(body.task()).contains("task")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = ReasoningAgentCreateCompletionParams.builder().build()

        val body = params._body()
    }
}

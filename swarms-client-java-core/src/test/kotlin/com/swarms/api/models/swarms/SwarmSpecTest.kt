// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import com.swarms.api.models.agent.AgentSpec
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SwarmSpecTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val swarmSpec =
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
                .returnHistory(true)
                .rules("rules")
                .serviceTier("service_tier")
                .stream(true)
                .swarmType(SwarmSpec.SwarmType.AGENT_REARRANGE)
                .task("task")
                .addTask("string")
                .build()

        assertThat(swarmSpec.agents().getOrNull())
            .containsExactly(
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
        assertThat(swarmSpec.description()).contains("description")
        assertThat(swarmSpec.heavySwarmLoopsPerAgent()).contains(0L)
        assertThat(swarmSpec.heavySwarmQuestionAgentModelName())
            .contains("heavy_swarm_question_agent_model_name")
        assertThat(swarmSpec.heavySwarmWorkerModelName()).contains("heavy_swarm_worker_model_name")
        assertThat(swarmSpec.img()).contains("img")
        assertThat(swarmSpec.maxLoops()).contains(0L)
        assertThat(swarmSpec.messages())
            .contains(
                SwarmSpec.Messages.ofUnnamedSchemaWithArrayParent1s(
                    listOf(
                        SwarmSpec.Messages.UnnamedSchemaWithArrayParent1.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                )
            )
        assertThat(swarmSpec.name()).contains("name")
        assertThat(swarmSpec.rearrangeFlow()).contains("rearrange_flow")
        assertThat(swarmSpec.returnHistory()).contains(true)
        assertThat(swarmSpec.rules()).contains("rules")
        assertThat(swarmSpec.serviceTier()).contains("service_tier")
        assertThat(swarmSpec.stream()).contains(true)
        assertThat(swarmSpec.swarmType()).contains(SwarmSpec.SwarmType.AGENT_REARRANGE)
        assertThat(swarmSpec.task()).contains("task")
        assertThat(swarmSpec.tasks().getOrNull()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swarmSpec =
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
                .returnHistory(true)
                .rules("rules")
                .serviceTier("service_tier")
                .stream(true)
                .swarmType(SwarmSpec.SwarmType.AGENT_REARRANGE)
                .task("task")
                .addTask("string")
                .build()

        val roundtrippedSwarmSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swarmSpec),
                jacksonTypeRef<SwarmSpec>(),
            )

        assertThat(roundtrippedSwarmSpec).isEqualTo(swarmSpec)
    }
}

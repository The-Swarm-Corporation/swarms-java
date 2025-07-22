// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SwarmRunParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SwarmRunParams.builder()
            .swarmSpec(
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
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            SwarmRunParams.builder()
                .swarmSpec(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = SwarmRunParams.builder().swarmSpec(SwarmSpec.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(SwarmSpec.builder().build())
    }
}

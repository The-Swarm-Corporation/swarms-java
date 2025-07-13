// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms.batch

import com.swarms.api.core.JsonValue
import com.swarms.api.models.agent.AgentSpec
import com.swarms.api.models.swarms.SwarmSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchRunParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = BatchRunParams.builder().addBody(SwarmSpec.builder().build()).build()

        val body = params._body()

        assertThat(body).containsExactly(SwarmSpec.builder().build())
    }
}

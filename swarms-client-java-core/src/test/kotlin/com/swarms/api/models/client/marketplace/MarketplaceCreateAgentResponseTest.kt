// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.marketplace

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketplaceCreateAgentResponseTest {

    @Test
    fun create() {
        val marketplaceCreateAgentResponse =
            MarketplaceCreateAgentResponse.builder()
                .addPrompt(
                    MarketplaceCreateAgentResponse.Prompt.builder()
                        .id("id")
                        .createdAt("created_at")
                        .userId("user_id")
                        .category("string")
                        .description("description")
                        .linksOfUnnamedSchemaWithArrayParent2s(
                            listOf(
                                MarketplaceCreateAgentResponse.Prompt.Links
                                    .UnnamedSchemaWithArrayParent2
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                        )
                        .name("name")
                        .prompt("prompt")
                        .status("status")
                        .tags("tags")
                        .useCases(
                            MarketplaceCreateAgentResponse.Prompt.UseCases.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .status("status")
                .timestamp("timestamp")
                .build()

        assertThat(marketplaceCreateAgentResponse.prompts())
            .containsExactly(
                MarketplaceCreateAgentResponse.Prompt.builder()
                    .id("id")
                    .createdAt("created_at")
                    .userId("user_id")
                    .category("string")
                    .description("description")
                    .linksOfUnnamedSchemaWithArrayParent2s(
                        listOf(
                            MarketplaceCreateAgentResponse.Prompt.Links
                                .UnnamedSchemaWithArrayParent2
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                    )
                    .name("name")
                    .prompt("prompt")
                    .status("status")
                    .tags("tags")
                    .useCases(
                        MarketplaceCreateAgentResponse.Prompt.UseCases.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(marketplaceCreateAgentResponse.totalCount()).isEqualTo(0L)
        assertThat(marketplaceCreateAgentResponse.status()).contains("status")
        assertThat(marketplaceCreateAgentResponse.timestamp()).contains("timestamp")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketplaceCreateAgentResponse =
            MarketplaceCreateAgentResponse.builder()
                .addPrompt(
                    MarketplaceCreateAgentResponse.Prompt.builder()
                        .id("id")
                        .createdAt("created_at")
                        .userId("user_id")
                        .category("string")
                        .description("description")
                        .linksOfUnnamedSchemaWithArrayParent2s(
                            listOf(
                                MarketplaceCreateAgentResponse.Prompt.Links
                                    .UnnamedSchemaWithArrayParent2
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                        )
                        .name("name")
                        .prompt("prompt")
                        .status("status")
                        .tags("tags")
                        .useCases(
                            MarketplaceCreateAgentResponse.Prompt.UseCases.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .status("status")
                .timestamp("timestamp")
                .build()

        val roundtrippedMarketplaceCreateAgentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketplaceCreateAgentResponse),
                jacksonTypeRef<MarketplaceCreateAgentResponse>(),
            )

        assertThat(roundtrippedMarketplaceCreateAgentResponse)
            .isEqualTo(marketplaceCreateAgentResponse)
    }
}

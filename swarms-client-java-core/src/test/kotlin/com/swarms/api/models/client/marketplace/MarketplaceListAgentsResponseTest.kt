// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.marketplace

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketplaceListAgentsResponseTest {

    @Test
    fun create() {
        val marketplaceListAgentsResponse =
            MarketplaceListAgentsResponse.builder()
                .addPrompt(
                    MarketplaceListAgentsResponse.Prompt.builder()
                        .id("id")
                        .createdAt("created_at")
                        .userId("user_id")
                        .category("string")
                        .description("description")
                        .linksOfUnnamedSchemaWithArrayParent2s(
                            listOf(
                                MarketplaceListAgentsResponse.Prompt.Links
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
                            MarketplaceListAgentsResponse.Prompt.UseCases.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .status("status")
                .timestamp("timestamp")
                .build()

        assertThat(marketplaceListAgentsResponse.prompts())
            .containsExactly(
                MarketplaceListAgentsResponse.Prompt.builder()
                    .id("id")
                    .createdAt("created_at")
                    .userId("user_id")
                    .category("string")
                    .description("description")
                    .linksOfUnnamedSchemaWithArrayParent2s(
                        listOf(
                            MarketplaceListAgentsResponse.Prompt.Links.UnnamedSchemaWithArrayParent2
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
                        MarketplaceListAgentsResponse.Prompt.UseCases.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(marketplaceListAgentsResponse.totalCount()).isEqualTo(0L)
        assertThat(marketplaceListAgentsResponse.status()).contains("status")
        assertThat(marketplaceListAgentsResponse.timestamp()).contains("timestamp")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketplaceListAgentsResponse =
            MarketplaceListAgentsResponse.builder()
                .addPrompt(
                    MarketplaceListAgentsResponse.Prompt.builder()
                        .id("id")
                        .createdAt("created_at")
                        .userId("user_id")
                        .category("string")
                        .description("description")
                        .linksOfUnnamedSchemaWithArrayParent2s(
                            listOf(
                                MarketplaceListAgentsResponse.Prompt.Links
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
                            MarketplaceListAgentsResponse.Prompt.UseCases.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .status("status")
                .timestamp("timestamp")
                .build()

        val roundtrippedMarketplaceListAgentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketplaceListAgentsResponse),
                jacksonTypeRef<MarketplaceListAgentsResponse>(),
            )

        assertThat(roundtrippedMarketplaceListAgentsResponse)
            .isEqualTo(marketplaceListAgentsResponse)
    }
}

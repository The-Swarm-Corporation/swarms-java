// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.advancedresearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedResearchCreateCompletionResponseTest {

    @Test
    fun create() {
        val advancedResearchCreateCompletionResponse =
            AdvancedResearchCreateCompletionResponse.builder()
                .id("id")
                .charactersPerSource(0L)
                .description("description")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sources(0L)
                .timestamp("timestamp")
                .usage(
                    AdvancedResearchCreateCompletionResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(advancedResearchCreateCompletionResponse.id()).contains("id")
        assertThat(advancedResearchCreateCompletionResponse.charactersPerSource()).contains(0L)
        assertThat(advancedResearchCreateCompletionResponse.description()).contains("description")
        assertThat(advancedResearchCreateCompletionResponse.name()).contains("name")
        assertThat(advancedResearchCreateCompletionResponse._outputs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(advancedResearchCreateCompletionResponse.sources()).contains(0L)
        assertThat(advancedResearchCreateCompletionResponse.timestamp()).contains("timestamp")
        assertThat(advancedResearchCreateCompletionResponse.usage())
            .contains(
                AdvancedResearchCreateCompletionResponse.Usage.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedResearchCreateCompletionResponse =
            AdvancedResearchCreateCompletionResponse.builder()
                .id("id")
                .charactersPerSource(0L)
                .description("description")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sources(0L)
                .timestamp("timestamp")
                .usage(
                    AdvancedResearchCreateCompletionResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAdvancedResearchCreateCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedResearchCreateCompletionResponse),
                jacksonTypeRef<AdvancedResearchCreateCompletionResponse>(),
            )

        assertThat(roundtrippedAdvancedResearchCreateCompletionResponse)
            .isEqualTo(advancedResearchCreateCompletionResponse)
    }
}

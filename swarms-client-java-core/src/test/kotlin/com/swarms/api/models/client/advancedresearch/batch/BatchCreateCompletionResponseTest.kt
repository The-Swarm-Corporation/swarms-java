// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.advancedresearch.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateCompletionResponseTest {

    @Test
    fun create() {
        val batchCreateCompletionResponse =
            BatchCreateCompletionResponse.builder()
                .id("id")
                .charactersPerSource(0L)
                .description("description")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sources(0L)
                .timestamp("timestamp")
                .usage(
                    BatchCreateCompletionResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(batchCreateCompletionResponse.id()).contains("id")
        assertThat(batchCreateCompletionResponse.charactersPerSource()).contains(0L)
        assertThat(batchCreateCompletionResponse.description()).contains("description")
        assertThat(batchCreateCompletionResponse.name()).contains("name")
        assertThat(batchCreateCompletionResponse._outputs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(batchCreateCompletionResponse.sources()).contains(0L)
        assertThat(batchCreateCompletionResponse.timestamp()).contains("timestamp")
        assertThat(batchCreateCompletionResponse.usage())
            .contains(
                BatchCreateCompletionResponse.Usage.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCreateCompletionResponse =
            BatchCreateCompletionResponse.builder()
                .id("id")
                .charactersPerSource(0L)
                .description("description")
                .name("name")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .sources(0L)
                .timestamp("timestamp")
                .usage(
                    BatchCreateCompletionResponse.Usage.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedBatchCreateCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCreateCompletionResponse),
                jacksonTypeRef<BatchCreateCompletionResponse>(),
            )

        assertThat(roundtrippedBatchCreateCompletionResponse)
            .isEqualTo(batchCreateCompletionResponse)
    }
}

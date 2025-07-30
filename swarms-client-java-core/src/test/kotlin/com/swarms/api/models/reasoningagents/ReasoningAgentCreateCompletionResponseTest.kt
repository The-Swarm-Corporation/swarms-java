// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.reasoningagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReasoningAgentCreateCompletionResponseTest {

    @Test
    fun create() {
        val reasoningAgentCreateCompletionResponse =
            ReasoningAgentCreateCompletionResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reasoningAgentCreateCompletionResponse =
            ReasoningAgentCreateCompletionResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedReasoningAgentCreateCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reasoningAgentCreateCompletionResponse),
                jacksonTypeRef<ReasoningAgentCreateCompletionResponse>(),
            )

        assertThat(roundtrippedReasoningAgentCreateCompletionResponse)
            .isEqualTo(reasoningAgentCreateCompletionResponse)
    }
}

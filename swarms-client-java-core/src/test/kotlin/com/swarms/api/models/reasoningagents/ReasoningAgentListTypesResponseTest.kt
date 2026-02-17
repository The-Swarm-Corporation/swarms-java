// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.reasoningagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReasoningAgentListTypesResponseTest {

    @Test
    fun create() {
        val reasoningAgentListTypesResponse =
            ReasoningAgentListTypesResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reasoningAgentListTypesResponse =
            ReasoningAgentListTypesResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedReasoningAgentListTypesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reasoningAgentListTypesResponse),
                jacksonTypeRef<ReasoningAgentListTypesResponse>(),
            )

        assertThat(roundtrippedReasoningAgentListTypesResponse)
            .isEqualTo(reasoningAgentListTypesResponse)
    }
}

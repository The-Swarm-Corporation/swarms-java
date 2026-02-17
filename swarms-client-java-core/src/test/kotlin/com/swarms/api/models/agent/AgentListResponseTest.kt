// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListResponseTest {

    @Test
    fun create() {
        val agentListResponse =
            AgentListResponse.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentListResponse =
            AgentListResponse.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()

        val roundtrippedAgentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentListResponse),
                jacksonTypeRef<AgentListResponse>(),
            )

        assertThat(roundtrippedAgentListResponse).isEqualTo(agentListResponse)
    }
}

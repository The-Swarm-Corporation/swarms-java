// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SwarmCheckAvailableResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val swarmCheckAvailableResponse =
            SwarmCheckAvailableResponse.builder()
                .success(true)
                .swarmTypes(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(swarmCheckAvailableResponse.success()).contains(true)
        assertThat(swarmCheckAvailableResponse._swarmTypes())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swarmCheckAvailableResponse =
            SwarmCheckAvailableResponse.builder()
                .success(true)
                .swarmTypes(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedSwarmCheckAvailableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swarmCheckAvailableResponse),
                jacksonTypeRef<SwarmCheckAvailableResponse>(),
            )

        assertThat(roundtrippedSwarmCheckAvailableResponse).isEqualTo(swarmCheckAvailableResponse)
    }
}

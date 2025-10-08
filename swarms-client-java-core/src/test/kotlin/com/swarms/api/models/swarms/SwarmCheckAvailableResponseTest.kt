// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwarmCheckAvailableResponseTest {

    @Test
    fun create() {
        val swarmCheckAvailableResponse =
            SwarmCheckAvailableResponse.builder().success(true).swarmTypes(null).build()

        assertThat(swarmCheckAvailableResponse.success()).contains(true)
        assertThat(swarmCheckAvailableResponse.swarmTypes()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swarmCheckAvailableResponse =
            SwarmCheckAvailableResponse.builder().success(true).swarmTypes(null).build()

        val roundtrippedSwarmCheckAvailableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swarmCheckAvailableResponse),
                jacksonTypeRef<SwarmCheckAvailableResponse>(),
            )

        assertThat(roundtrippedSwarmCheckAvailableResponse).isEqualTo(swarmCheckAvailableResponse)
    }
}

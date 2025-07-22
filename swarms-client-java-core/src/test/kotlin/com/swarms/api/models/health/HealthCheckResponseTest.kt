// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.health

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthCheckResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val healthCheckResponse = HealthCheckResponse.builder().status("status").build()

        assertThat(healthCheckResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthCheckResponse = HealthCheckResponse.builder().status("status").build()

        val roundtrippedHealthCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthCheckResponse),
                jacksonTypeRef<HealthCheckResponse>(),
            )

        assertThat(roundtrippedHealthCheckResponse).isEqualTo(healthCheckResponse)
    }
}

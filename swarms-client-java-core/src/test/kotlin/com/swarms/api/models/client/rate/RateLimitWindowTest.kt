// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.rate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateLimitWindowTest {

    @Test
    fun create() {
        val rateLimitWindow =
            RateLimitWindow.builder()
                .count(0L)
                .exceeded(true)
                .limit(0L)
                .remaining(0L)
                .resetTime("reset_time")
                .build()

        assertThat(rateLimitWindow.count()).isEqualTo(0L)
        assertThat(rateLimitWindow.exceeded()).isEqualTo(true)
        assertThat(rateLimitWindow.limit()).isEqualTo(0L)
        assertThat(rateLimitWindow.remaining()).isEqualTo(0L)
        assertThat(rateLimitWindow.resetTime()).isEqualTo("reset_time")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateLimitWindow =
            RateLimitWindow.builder()
                .count(0L)
                .exceeded(true)
                .limit(0L)
                .remaining(0L)
                .resetTime("reset_time")
                .build()

        val roundtrippedRateLimitWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateLimitWindow),
                jacksonTypeRef<RateLimitWindow>(),
            )

        assertThat(roundtrippedRateLimitWindow).isEqualTo(rateLimitWindow)
    }
}

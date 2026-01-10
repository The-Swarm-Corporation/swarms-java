// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.rate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateGetLimitsResponseTest {

    @Test
    fun create() {
        val rateGetLimitsResponse =
            RateGetLimitsResponse.builder()
                .limits(
                    RateGetLimitsResponse.Limits.builder()
                        .maximumRequestsPerDay(0L)
                        .maximumRequestsPerHour(0L)
                        .maximumRequestsPerMinute(0L)
                        .tokensPerAgent(0L)
                        .build()
                )
                .rateLimits(
                    RateGetLimitsResponse.RateLimits.builder()
                        .day(
                            RateLimitWindow.builder()
                                .count(0L)
                                .exceeded(true)
                                .limit(0L)
                                .remaining(0L)
                                .resetTime("reset_time")
                                .build()
                        )
                        .hour(
                            RateLimitWindow.builder()
                                .count(0L)
                                .exceeded(true)
                                .limit(0L)
                                .remaining(0L)
                                .resetTime("reset_time")
                                .build()
                        )
                        .minute(
                            RateLimitWindow.builder()
                                .count(0L)
                                .exceeded(true)
                                .limit(0L)
                                .remaining(0L)
                                .resetTime("reset_time")
                                .build()
                        )
                        .build()
                )
                .tier("tier")
                .timestamp("timestamp")
                .success(true)
                .build()

        assertThat(rateGetLimitsResponse.limits())
            .contains(
                RateGetLimitsResponse.Limits.builder()
                    .maximumRequestsPerDay(0L)
                    .maximumRequestsPerHour(0L)
                    .maximumRequestsPerMinute(0L)
                    .tokensPerAgent(0L)
                    .build()
            )
        assertThat(rateGetLimitsResponse.rateLimits())
            .contains(
                RateGetLimitsResponse.RateLimits.builder()
                    .day(
                        RateLimitWindow.builder()
                            .count(0L)
                            .exceeded(true)
                            .limit(0L)
                            .remaining(0L)
                            .resetTime("reset_time")
                            .build()
                    )
                    .hour(
                        RateLimitWindow.builder()
                            .count(0L)
                            .exceeded(true)
                            .limit(0L)
                            .remaining(0L)
                            .resetTime("reset_time")
                            .build()
                    )
                    .minute(
                        RateLimitWindow.builder()
                            .count(0L)
                            .exceeded(true)
                            .limit(0L)
                            .remaining(0L)
                            .resetTime("reset_time")
                            .build()
                    )
                    .build()
            )
        assertThat(rateGetLimitsResponse.tier()).contains("tier")
        assertThat(rateGetLimitsResponse.timestamp()).contains("timestamp")
        assertThat(rateGetLimitsResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateGetLimitsResponse =
            RateGetLimitsResponse.builder()
                .limits(
                    RateGetLimitsResponse.Limits.builder()
                        .maximumRequestsPerDay(0L)
                        .maximumRequestsPerHour(0L)
                        .maximumRequestsPerMinute(0L)
                        .tokensPerAgent(0L)
                        .build()
                )
                .rateLimits(
                    RateGetLimitsResponse.RateLimits.builder()
                        .day(
                            RateLimitWindow.builder()
                                .count(0L)
                                .exceeded(true)
                                .limit(0L)
                                .remaining(0L)
                                .resetTime("reset_time")
                                .build()
                        )
                        .hour(
                            RateLimitWindow.builder()
                                .count(0L)
                                .exceeded(true)
                                .limit(0L)
                                .remaining(0L)
                                .resetTime("reset_time")
                                .build()
                        )
                        .minute(
                            RateLimitWindow.builder()
                                .count(0L)
                                .exceeded(true)
                                .limit(0L)
                                .remaining(0L)
                                .resetTime("reset_time")
                                .build()
                        )
                        .build()
                )
                .tier("tier")
                .timestamp("timestamp")
                .success(true)
                .build()

        val roundtrippedRateGetLimitsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateGetLimitsResponse),
                jacksonTypeRef<RateGetLimitsResponse>(),
            )

        assertThat(roundtrippedRateGetLimitsResponse).isEqualTo(rateGetLimitsResponse)
    }
}

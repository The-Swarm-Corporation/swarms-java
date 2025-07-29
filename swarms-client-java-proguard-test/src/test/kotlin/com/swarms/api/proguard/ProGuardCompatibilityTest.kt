// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient
import com.swarms.api.core.jsonMapper
import com.swarms.api.models.health.HealthCheckResponse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/swarms-client-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = SwarmsClientOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.health()).isNotNull()
        assertThat(client.agent()).isNotNull()
        assertThat(client.models()).isNotNull()
        assertThat(client.swarms()).isNotNull()
        assertThat(client.reasoningAgents()).isNotNull()
        assertThat(client.client()).isNotNull()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun healthCheckResponseRoundtrip() {
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

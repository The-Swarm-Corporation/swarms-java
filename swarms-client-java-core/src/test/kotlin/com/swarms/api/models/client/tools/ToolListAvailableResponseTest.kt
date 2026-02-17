// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListAvailableResponseTest {

    @Test
    fun create() {
        val toolListAvailableResponse =
            ToolListAvailableResponse.builder().status("status").addTool("string").build()

        assertThat(toolListAvailableResponse.status()).contains("status")
        assertThat(toolListAvailableResponse.tools().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolListAvailableResponse =
            ToolListAvailableResponse.builder().status("status").addTool("string").build()

        val roundtrippedToolListAvailableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolListAvailableResponse),
                jacksonTypeRef<ToolListAvailableResponse>(),
            )

        assertThat(roundtrippedToolListAvailableResponse).isEqualTo(toolListAvailableResponse)
    }
}

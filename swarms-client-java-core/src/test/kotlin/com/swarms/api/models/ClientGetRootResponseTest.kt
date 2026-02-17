// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientGetRootResponseTest {

    @Test
    fun create() {
        val clientGetRootResponse = ClientGetRootResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientGetRootResponse = ClientGetRootResponse.builder().build()

        val roundtrippedClientGetRootResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientGetRootResponse),
                jacksonTypeRef<ClientGetRootResponse>(),
            )

        assertThat(roundtrippedClientGetRootResponse).isEqualTo(clientGetRootResponse)
    }
}

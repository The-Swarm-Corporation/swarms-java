// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ModelListAvailableResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val modelListAvailableResponse =
            ModelListAvailableResponse.builder()
                .models(JsonValue.from(mapOf<String, Any>()))
                .success(true)
                .build()

        assertThat(modelListAvailableResponse._models())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(modelListAvailableResponse.success()).contains(true)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelListAvailableResponse =
            ModelListAvailableResponse.builder()
                .models(JsonValue.from(mapOf<String, Any>()))
                .success(true)
                .build()

        val roundtrippedModelListAvailableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelListAvailableResponse),
                jacksonTypeRef<ModelListAvailableResponse>(),
            )

        assertThat(roundtrippedModelListAvailableResponse).isEqualTo(modelListAvailableResponse)
    }
}

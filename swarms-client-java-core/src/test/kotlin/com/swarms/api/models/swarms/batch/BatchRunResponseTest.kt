// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchRunResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val batchRunResponse =
            BatchRunResponse.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchRunResponse =
            BatchRunResponse.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()

        val roundtrippedBatchRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchRunResponse),
                jacksonTypeRef<BatchRunResponse>(),
            )

        assertThat(roundtrippedBatchRunResponse).isEqualTo(batchRunResponse)
    }
}

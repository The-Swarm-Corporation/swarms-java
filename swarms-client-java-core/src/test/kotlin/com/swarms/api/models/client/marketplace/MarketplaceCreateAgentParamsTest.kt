// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.marketplace

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketplaceCreateAgentParamsTest {

    @Test
    fun create() {
        MarketplaceCreateAgentParams.builder().numberOfItems(0L).build()
    }

    @Test
    fun body() {
        val params = MarketplaceCreateAgentParams.builder().numberOfItems(0L).build()

        val body = params._body()

        assertThat(body.numberOfItems()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MarketplaceCreateAgentParams.builder().build()

        val body = params._body()
    }
}

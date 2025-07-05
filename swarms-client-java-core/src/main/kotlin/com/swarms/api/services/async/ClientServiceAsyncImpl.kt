// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.async.client.RateServiceAsync
import com.swarms.api.services.async.client.RateServiceAsyncImpl
import java.util.function.Consumer

class ClientServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClientServiceAsync {

    private val withRawResponse: ClientServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rate: RateServiceAsync by lazy { RateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ClientServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientServiceAsync =
        ClientServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rate(): RateServiceAsync = rate

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClientServiceAsync.WithRawResponse {

        private val rate: RateServiceAsync.WithRawResponse by lazy {
            RateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientServiceAsync.WithRawResponse =
            ClientServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rate(): RateServiceAsync.WithRawResponse = rate
    }
}

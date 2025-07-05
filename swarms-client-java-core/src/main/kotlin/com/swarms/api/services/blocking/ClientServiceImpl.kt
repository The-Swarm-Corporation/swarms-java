// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.blocking.client.RateService
import com.swarms.api.services.blocking.client.RateServiceImpl
import java.util.function.Consumer

class ClientServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClientService {

    private val withRawResponse: ClientService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rate: RateService by lazy { RateServiceImpl(clientOptions) }

    override fun withRawResponse(): ClientService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientService =
        ClientServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rate(): RateService = rate

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClientService.WithRawResponse {

        private val rate: RateService.WithRawResponse by lazy {
            RateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientService.WithRawResponse =
            ClientServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rate(): RateService.WithRawResponse = rate
    }
}

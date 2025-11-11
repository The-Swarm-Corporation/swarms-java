// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.handlers.errorBodyHandler
import com.swarms.api.core.handlers.errorHandler
import com.swarms.api.core.handlers.jsonHandler
import com.swarms.api.core.http.HttpMethod
import com.swarms.api.core.http.HttpRequest
import com.swarms.api.core.http.HttpResponse
import com.swarms.api.core.http.HttpResponse.Handler
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepare
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsParams
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsResponse
import java.util.function.Consumer

class MarketplaceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketplaceService {

    private val withRawResponse: MarketplaceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketplaceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketplaceService =
        MarketplaceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listAgents(
        params: MarketplaceListAgentsParams,
        requestOptions: RequestOptions,
    ): MarketplaceListAgentsResponse =
        // get /v1/marketplace/agents
        withRawResponse().listAgents(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketplaceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketplaceService.WithRawResponse =
            MarketplaceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listAgentsHandler: Handler<MarketplaceListAgentsResponse> =
            jsonHandler<MarketplaceListAgentsResponse>(clientOptions.jsonMapper)

        override fun listAgents(
            params: MarketplaceListAgentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketplaceListAgentsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "marketplace", "agents")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAgentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

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
import com.swarms.api.core.prepareAsync
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsParams
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MarketplaceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketplaceServiceAsync {

    private val withRawResponse: MarketplaceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketplaceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketplaceServiceAsync =
        MarketplaceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listAgents(
        params: MarketplaceListAgentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketplaceListAgentsResponse> =
        // get /v1/marketplace/agents
        withRawResponse().listAgents(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketplaceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketplaceServiceAsync.WithRawResponse =
            MarketplaceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listAgentsHandler: Handler<MarketplaceListAgentsResponse> =
            jsonHandler<MarketplaceListAgentsResponse>(clientOptions.jsonMapper)

        override fun listAgents(
            params: MarketplaceListAgentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketplaceListAgentsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "marketplace", "agents")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}

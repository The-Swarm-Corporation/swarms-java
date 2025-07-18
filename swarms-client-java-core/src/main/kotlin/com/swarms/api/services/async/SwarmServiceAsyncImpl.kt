// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

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
import com.swarms.api.core.http.json
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepareAsync
import com.swarms.api.models.swarms.SwarmCheckAvailableParams
import com.swarms.api.models.swarms.SwarmCheckAvailableResponse
import com.swarms.api.models.swarms.SwarmGetLogsParams
import com.swarms.api.models.swarms.SwarmGetLogsResponse
import com.swarms.api.models.swarms.SwarmRunParams
import com.swarms.api.models.swarms.SwarmRunResponse
import com.swarms.api.services.async.swarms.BatchServiceAsync
import com.swarms.api.services.async.swarms.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SwarmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SwarmServiceAsync {

    private val withRawResponse: SwarmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SwarmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmServiceAsync =
        SwarmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun checkAvailable(
        params: SwarmCheckAvailableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SwarmCheckAvailableResponse> =
        // get /v1/swarms/available
        withRawResponse().checkAvailable(params, requestOptions).thenApply { it.parse() }

    override fun getLogs(
        params: SwarmGetLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SwarmGetLogsResponse> =
        // get /v1/swarm/logs
        withRawResponse().getLogs(params, requestOptions).thenApply { it.parse() }

    override fun run(
        params: SwarmRunParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SwarmRunResponse> =
        // post /v1/swarm/completions
        withRawResponse().run(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SwarmServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SwarmServiceAsync.WithRawResponse =
            SwarmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val checkAvailableHandler: Handler<SwarmCheckAvailableResponse> =
            jsonHandler<SwarmCheckAvailableResponse>(clientOptions.jsonMapper)

        override fun checkAvailable(
            params: SwarmCheckAvailableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SwarmCheckAvailableResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "swarms", "available")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { checkAvailableHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLogsHandler: Handler<SwarmGetLogsResponse> =
            jsonHandler<SwarmGetLogsResponse>(clientOptions.jsonMapper)

        override fun getLogs(
            params: SwarmGetLogsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SwarmGetLogsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "swarm", "logs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLogsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val runHandler: Handler<SwarmRunResponse> =
            jsonHandler<SwarmRunResponse>(clientOptions.jsonMapper)

        override fun run(
            params: SwarmRunParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SwarmRunResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "swarm", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { runHandler.handle(it) }
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

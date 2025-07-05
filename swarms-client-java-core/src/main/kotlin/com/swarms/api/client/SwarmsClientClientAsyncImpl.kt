// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.JsonValue
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.getPackageVersion
import com.swarms.api.core.handlers.errorHandler
import com.swarms.api.core.handlers.jsonHandler
import com.swarms.api.core.handlers.withErrorHandler
import com.swarms.api.core.http.HttpMethod
import com.swarms.api.core.http.HttpRequest
import com.swarms.api.core.http.HttpResponse.Handler
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepareAsync
import com.swarms.api.models.ClientGetRootParams
import com.swarms.api.models.ClientGetRootResponse
import com.swarms.api.services.async.AgentServiceAsync
import com.swarms.api.services.async.AgentServiceAsyncImpl
import com.swarms.api.services.async.ClientServiceAsync
import com.swarms.api.services.async.ClientServiceAsyncImpl
import com.swarms.api.services.async.HealthServiceAsync
import com.swarms.api.services.async.HealthServiceAsyncImpl
import com.swarms.api.services.async.ModelServiceAsync
import com.swarms.api.services.async.ModelServiceAsyncImpl
import com.swarms.api.services.async.SwarmServiceAsync
import com.swarms.api.services.async.SwarmServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SwarmsClientClientAsyncImpl(private val clientOptions: ClientOptions) :
    SwarmsClientClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: SwarmsClientClient by lazy { SwarmsClientClientImpl(clientOptions) }

    private val withRawResponse: SwarmsClientClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val health: HealthServiceAsync by lazy {
        HealthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val agent: AgentServiceAsync by lazy {
        AgentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val models: ModelServiceAsync by lazy {
        ModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val swarms: SwarmServiceAsync by lazy {
        SwarmServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val client: ClientServiceAsync by lazy {
        ClientServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): SwarmsClientClient = sync

    override fun withRawResponse(): SwarmsClientClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmsClientClientAsync =
        SwarmsClientClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun health(): HealthServiceAsync = health

    override fun agent(): AgentServiceAsync = agent

    override fun models(): ModelServiceAsync = models

    override fun swarms(): SwarmServiceAsync = swarms

    override fun client(): ClientServiceAsync = client

    override fun getRoot(
        params: ClientGetRootParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClientGetRootResponse> =
        // get /
        withRawResponse().getRoot(params, requestOptions).thenApply { it.parse() }

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SwarmsClientClientAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val health: HealthServiceAsync.WithRawResponse by lazy {
            HealthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val agent: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val models: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val swarms: SwarmServiceAsync.WithRawResponse by lazy {
            SwarmServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val client: ClientServiceAsync.WithRawResponse by lazy {
            ClientServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SwarmsClientClientAsync.WithRawResponse =
            SwarmsClientClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun health(): HealthServiceAsync.WithRawResponse = health

        override fun agent(): AgentServiceAsync.WithRawResponse = agent

        override fun models(): ModelServiceAsync.WithRawResponse = models

        override fun swarms(): SwarmServiceAsync.WithRawResponse = swarms

        override fun client(): ClientServiceAsync.WithRawResponse = client

        private val getRootHandler: Handler<ClientGetRootResponse> =
            jsonHandler<ClientGetRootResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getRoot(
            params: ClientGetRootParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClientGetRootResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getRootHandler.handle(it) }
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

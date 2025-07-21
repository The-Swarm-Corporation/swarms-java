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
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionParams
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionResponse
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesParams
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ReasoningAgentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ReasoningAgentServiceAsync {

    private val withRawResponse: ReasoningAgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReasoningAgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ReasoningAgentServiceAsync =
        ReasoningAgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createCompletion(
        params: ReasoningAgentCreateCompletionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReasoningAgentCreateCompletionResponse> =
        // post /v1/reasoning-agent/completions
        withRawResponse().createCompletion(params, requestOptions).thenApply { it.parse() }

    override fun listTypes(
        params: ReasoningAgentListTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReasoningAgentListTypesResponse> =
        // get /v1/reasoning-agent/types
        withRawResponse().listTypes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReasoningAgentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReasoningAgentServiceAsync.WithRawResponse =
            ReasoningAgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createCompletionHandler: Handler<ReasoningAgentCreateCompletionResponse> =
            jsonHandler<ReasoningAgentCreateCompletionResponse>(clientOptions.jsonMapper)

        override fun createCompletion(
            params: ReasoningAgentCreateCompletionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReasoningAgentCreateCompletionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reasoning-agent", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createCompletionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listTypesHandler: Handler<ReasoningAgentListTypesResponse> =
            jsonHandler<ReasoningAgentListTypesResponse>(clientOptions.jsonMapper)

        override fun listTypes(
            params: ReasoningAgentListTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReasoningAgentListTypesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reasoning-agent", "types")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listTypesHandler.handle(it) }
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

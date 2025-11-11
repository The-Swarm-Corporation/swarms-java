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
import com.swarms.api.core.http.json
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepareAsync
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionParams
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionResponse
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderListExecutionTypesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AutoSwarmBuilderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AutoSwarmBuilderServiceAsync {

    private val withRawResponse: AutoSwarmBuilderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutoSwarmBuilderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AutoSwarmBuilderServiceAsync =
        AutoSwarmBuilderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createCompletion(
        params: AutoSwarmBuilderCreateCompletionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutoSwarmBuilderCreateCompletionResponse> =
        // post /v1/auto-swarm-builder/completions
        withRawResponse().createCompletion(params, requestOptions).thenApply { it.parse() }

    override fun listExecutionTypes(
        params: AutoSwarmBuilderListExecutionTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        // get /v1/auto-swarm-builder/execution-types
        withRawResponse().listExecutionTypes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoSwarmBuilderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoSwarmBuilderServiceAsync.WithRawResponse =
            AutoSwarmBuilderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createCompletionHandler: Handler<AutoSwarmBuilderCreateCompletionResponse> =
            jsonHandler<AutoSwarmBuilderCreateCompletionResponse>(clientOptions.jsonMapper)

        override fun createCompletion(
            params: AutoSwarmBuilderCreateCompletionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auto-swarm-builder", "completions")
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

        private val listExecutionTypesHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun listExecutionTypes(
            params: AutoSwarmBuilderListExecutionTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auto-swarm-builder", "execution-types")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listExecutionTypesHandler.handle(it) }
                    }
                }
        }
    }
}

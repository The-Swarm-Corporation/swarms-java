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
import com.swarms.api.core.http.json
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepare
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionParams
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionResponse
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderListExecutionTypesParams
import java.util.function.Consumer

class AutoSwarmBuilderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutoSwarmBuilderService {

    private val withRawResponse: AutoSwarmBuilderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutoSwarmBuilderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoSwarmBuilderService =
        AutoSwarmBuilderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createCompletion(
        params: AutoSwarmBuilderCreateCompletionParams,
        requestOptions: RequestOptions,
    ): AutoSwarmBuilderCreateCompletionResponse =
        // post /v1/auto-swarm-builder/completions
        withRawResponse().createCompletion(params, requestOptions).parse()

    override fun listExecutionTypes(
        params: AutoSwarmBuilderListExecutionTypesParams,
        requestOptions: RequestOptions,
    ): List<String> =
        // get /v1/auto-swarm-builder/execution-types
        withRawResponse().listExecutionTypes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoSwarmBuilderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoSwarmBuilderService.WithRawResponse =
            AutoSwarmBuilderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createCompletionHandler: Handler<AutoSwarmBuilderCreateCompletionResponse> =
            jsonHandler<AutoSwarmBuilderCreateCompletionResponse>(clientOptions.jsonMapper)

        override fun createCompletion(
            params: AutoSwarmBuilderCreateCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auto-swarm-builder", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listExecutionTypesHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper)

        override fun listExecutionTypes(
            params: AutoSwarmBuilderListExecutionTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auto-swarm-builder", "execution-types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listExecutionTypesHandler.handle(it) }
            }
        }
    }
}

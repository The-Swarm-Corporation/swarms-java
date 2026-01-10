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
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowParams
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class GraphWorkflowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GraphWorkflowServiceAsync {

    private val withRawResponse: GraphWorkflowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GraphWorkflowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphWorkflowServiceAsync =
        GraphWorkflowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun executeWorkflow(
        params: GraphWorkflowExecuteWorkflowParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GraphWorkflowExecuteWorkflowResponse> =
        // post /v1/graph-workflow/completions
        withRawResponse().executeWorkflow(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GraphWorkflowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GraphWorkflowServiceAsync.WithRawResponse =
            GraphWorkflowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val executeWorkflowHandler: Handler<GraphWorkflowExecuteWorkflowResponse> =
            jsonHandler<GraphWorkflowExecuteWorkflowResponse>(clientOptions.jsonMapper)

        override fun executeWorkflow(
            params: GraphWorkflowExecuteWorkflowParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GraphWorkflowExecuteWorkflowResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "graph-workflow", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { executeWorkflowHandler.handle(it) }
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

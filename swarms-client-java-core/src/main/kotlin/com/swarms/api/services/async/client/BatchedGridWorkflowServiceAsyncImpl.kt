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
import com.swarms.api.models.client.batchedgridworkflow.BatchedGridWorkflowCompleteWorkflowParams
import com.swarms.api.models.client.batchedgridworkflow.BatchedGridWorkflowCompleteWorkflowResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BatchedGridWorkflowServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BatchedGridWorkflowServiceAsync {

    private val withRawResponse: BatchedGridWorkflowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchedGridWorkflowServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BatchedGridWorkflowServiceAsync =
        BatchedGridWorkflowServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun completeWorkflow(
        params: BatchedGridWorkflowCompleteWorkflowParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchedGridWorkflowCompleteWorkflowResponse> =
        // post /v1/batched-grid-workflow/completions
        withRawResponse().completeWorkflow(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchedGridWorkflowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchedGridWorkflowServiceAsync.WithRawResponse =
            BatchedGridWorkflowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeWorkflowHandler: Handler<BatchedGridWorkflowCompleteWorkflowResponse> =
            jsonHandler<BatchedGridWorkflowCompleteWorkflowResponse>(clientOptions.jsonMapper)

        override fun completeWorkflow(
            params: BatchedGridWorkflowCompleteWorkflowParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchedGridWorkflowCompleteWorkflowResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "batched-grid-workflow", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { completeWorkflowHandler.handle(it) }
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

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
import com.swarms.api.models.client.batchedgridworkflow.BatchedGridWorkflowCompleteWorkflowParams
import com.swarms.api.models.client.batchedgridworkflow.BatchedGridWorkflowCompleteWorkflowResponse
import java.util.function.Consumer

class BatchedGridWorkflowServiceImpl
internal constructor(private val clientOptions: ClientOptions) : BatchedGridWorkflowService {

    private val withRawResponse: BatchedGridWorkflowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchedGridWorkflowService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BatchedGridWorkflowService =
        BatchedGridWorkflowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun completeWorkflow(
        params: BatchedGridWorkflowCompleteWorkflowParams,
        requestOptions: RequestOptions,
    ): BatchedGridWorkflowCompleteWorkflowResponse =
        // post /v1/batched-grid-workflow/completions
        withRawResponse().completeWorkflow(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchedGridWorkflowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchedGridWorkflowService.WithRawResponse =
            BatchedGridWorkflowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeWorkflowHandler: Handler<BatchedGridWorkflowCompleteWorkflowResponse> =
            jsonHandler<BatchedGridWorkflowCompleteWorkflowResponse>(clientOptions.jsonMapper)

        override fun completeWorkflow(
            params: BatchedGridWorkflowCompleteWorkflowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchedGridWorkflowCompleteWorkflowResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "batched-grid-workflow", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

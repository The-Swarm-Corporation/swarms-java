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
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowParams
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowResponse
import java.util.function.Consumer

class GraphWorkflowServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GraphWorkflowService {

    private val withRawResponse: GraphWorkflowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GraphWorkflowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphWorkflowService =
        GraphWorkflowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun executeWorkflow(
        params: GraphWorkflowExecuteWorkflowParams,
        requestOptions: RequestOptions,
    ): GraphWorkflowExecuteWorkflowResponse =
        // post /v1/graph-workflow/completions
        withRawResponse().executeWorkflow(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GraphWorkflowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GraphWorkflowService.WithRawResponse =
            GraphWorkflowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val executeWorkflowHandler: Handler<GraphWorkflowExecuteWorkflowResponse> =
            jsonHandler<GraphWorkflowExecuteWorkflowResponse>(clientOptions.jsonMapper)

        override fun executeWorkflow(
            params: GraphWorkflowExecuteWorkflowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GraphWorkflowExecuteWorkflowResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "graph-workflow", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

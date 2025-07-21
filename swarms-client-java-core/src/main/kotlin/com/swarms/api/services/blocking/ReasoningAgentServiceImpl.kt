// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

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
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionParams
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionResponse
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesParams
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesResponse
import java.util.function.Consumer

class ReasoningAgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReasoningAgentService {

    private val withRawResponse: ReasoningAgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReasoningAgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReasoningAgentService =
        ReasoningAgentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createCompletion(
        params: ReasoningAgentCreateCompletionParams,
        requestOptions: RequestOptions,
    ): ReasoningAgentCreateCompletionResponse =
        // post /v1/reasoning-agent/completions
        withRawResponse().createCompletion(params, requestOptions).parse()

    override fun listTypes(
        params: ReasoningAgentListTypesParams,
        requestOptions: RequestOptions,
    ): ReasoningAgentListTypesResponse =
        // get /v1/reasoning-agent/types
        withRawResponse().listTypes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReasoningAgentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReasoningAgentService.WithRawResponse =
            ReasoningAgentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createCompletionHandler: Handler<ReasoningAgentCreateCompletionResponse> =
            jsonHandler<ReasoningAgentCreateCompletionResponse>(clientOptions.jsonMapper)

        override fun createCompletion(
            params: ReasoningAgentCreateCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReasoningAgentCreateCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reasoning-agent", "completions")
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

        private val listTypesHandler: Handler<ReasoningAgentListTypesResponse> =
            jsonHandler<ReasoningAgentListTypesResponse>(clientOptions.jsonMapper)

        override fun listTypes(
            params: ReasoningAgentListTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReasoningAgentListTypesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reasoning-agent", "types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

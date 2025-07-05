// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.JsonValue
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.handlers.errorHandler
import com.swarms.api.core.handlers.jsonHandler
import com.swarms.api.core.handlers.withErrorHandler
import com.swarms.api.core.http.HttpMethod
import com.swarms.api.core.http.HttpRequest
import com.swarms.api.core.http.HttpResponse.Handler
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.core.http.json
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepare
import com.swarms.api.models.agent.AgentRunParams
import com.swarms.api.models.agent.AgentRunResponse
import com.swarms.api.services.blocking.agent.BatchService
import com.swarms.api.services.blocking.agent.BatchServiceImpl
import java.util.function.Consumer

class AgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentService {

    private val withRawResponse: AgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): AgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService =
        AgentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun run(params: AgentRunParams, requestOptions: RequestOptions): AgentRunResponse =
        // post /v1/agent/completions
        withRawResponse().run(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentService.WithRawResponse =
            AgentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val runHandler: Handler<AgentRunResponse> =
            jsonHandler<AgentRunResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun run(
            params: AgentRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentRunResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "agent", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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

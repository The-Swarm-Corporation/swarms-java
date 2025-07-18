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
import com.swarms.api.models.swarms.SwarmCheckAvailableParams
import com.swarms.api.models.swarms.SwarmCheckAvailableResponse
import com.swarms.api.models.swarms.SwarmGetLogsParams
import com.swarms.api.models.swarms.SwarmGetLogsResponse
import com.swarms.api.models.swarms.SwarmRunParams
import com.swarms.api.models.swarms.SwarmRunResponse
import com.swarms.api.services.blocking.swarms.BatchService
import com.swarms.api.services.blocking.swarms.BatchServiceImpl
import java.util.function.Consumer

class SwarmServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SwarmService {

    private val withRawResponse: SwarmService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): SwarmService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmService =
        SwarmServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun checkAvailable(
        params: SwarmCheckAvailableParams,
        requestOptions: RequestOptions,
    ): SwarmCheckAvailableResponse =
        // get /v1/swarms/available
        withRawResponse().checkAvailable(params, requestOptions).parse()

    override fun getLogs(
        params: SwarmGetLogsParams,
        requestOptions: RequestOptions,
    ): SwarmGetLogsResponse =
        // get /v1/swarm/logs
        withRawResponse().getLogs(params, requestOptions).parse()

    override fun run(params: SwarmRunParams, requestOptions: RequestOptions): SwarmRunResponse =
        // post /v1/swarm/completions
        withRawResponse().run(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SwarmService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SwarmService.WithRawResponse =
            SwarmServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val checkAvailableHandler: Handler<SwarmCheckAvailableResponse> =
            jsonHandler<SwarmCheckAvailableResponse>(clientOptions.jsonMapper)

        override fun checkAvailable(
            params: SwarmCheckAvailableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwarmCheckAvailableResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "swarms", "available")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkAvailableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLogsHandler: Handler<SwarmGetLogsResponse> =
            jsonHandler<SwarmGetLogsResponse>(clientOptions.jsonMapper)

        override fun getLogs(
            params: SwarmGetLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwarmGetLogsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "swarm", "logs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLogsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val runHandler: Handler<SwarmRunResponse> =
            jsonHandler<SwarmRunResponse>(clientOptions.jsonMapper)

        override fun run(
            params: SwarmRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwarmRunResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "swarm", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

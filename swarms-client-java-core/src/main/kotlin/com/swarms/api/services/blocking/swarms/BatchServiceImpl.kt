// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.swarms

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
import com.swarms.api.models.swarms.batch.BatchRunParams
import com.swarms.api.models.swarms.batch.BatchRunResponse
import java.util.function.Consumer

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun run(
        params: BatchRunParams,
        requestOptions: RequestOptions,
    ): List<BatchRunResponse> =
        // post /v1/swarm/batch/completions
        withRawResponse().run(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val runHandler: Handler<List<BatchRunResponse>> =
            jsonHandler<List<BatchRunResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun run(
            params: BatchRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BatchRunResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "swarm", "batch", "completions")
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
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}

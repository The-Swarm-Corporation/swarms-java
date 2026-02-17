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
import com.swarms.api.models.client.advancedresearch.AdvancedResearchCreateCompletionParams
import com.swarms.api.models.client.advancedresearch.AdvancedResearchCreateCompletionResponse
import com.swarms.api.services.blocking.client.advancedresearch.BatchService
import com.swarms.api.services.blocking.client.advancedresearch.BatchServiceImpl
import java.util.function.Consumer

class AdvancedResearchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdvancedResearchService {

    private val withRawResponse: AdvancedResearchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): AdvancedResearchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedResearchService =
        AdvancedResearchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun createCompletion(
        params: AdvancedResearchCreateCompletionParams,
        requestOptions: RequestOptions,
    ): AdvancedResearchCreateCompletionResponse =
        // post /v1/advanced-research/completions
        withRawResponse().createCompletion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdvancedResearchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedResearchService.WithRawResponse =
            AdvancedResearchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val createCompletionHandler: Handler<AdvancedResearchCreateCompletionResponse> =
            jsonHandler<AdvancedResearchCreateCompletionResponse>(clientOptions.jsonMapper)

        override fun createCompletion(
            params: AdvancedResearchCreateCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedResearchCreateCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "advanced-research", "completions")
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
    }
}

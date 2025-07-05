// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

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
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepareAsync
import com.swarms.api.models.client.rate.RateGetLimitsParams
import com.swarms.api.models.client.rate.RateGetLimitsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RateServiceAsync {

    private val withRawResponse: RateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateServiceAsync =
        RateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getLimits(
        params: RateGetLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RateGetLimitsResponse> =
        // get /v1/rate/limits
        withRawResponse().getLimits(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RateServiceAsync.WithRawResponse =
            RateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getLimitsHandler: Handler<RateGetLimitsResponse> =
            jsonHandler<RateGetLimitsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getLimits(
            params: RateGetLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RateGetLimitsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rate", "limits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getLimitsHandler.handle(it) }
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

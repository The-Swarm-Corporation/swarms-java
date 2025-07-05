// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

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
import com.swarms.api.core.prepare
import com.swarms.api.models.client.rate.RateGetLimitsParams
import com.swarms.api.models.client.rate.RateGetLimitsResponse
import java.util.function.Consumer

class RateServiceImpl internal constructor(private val clientOptions: ClientOptions) : RateService {

    private val withRawResponse: RateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateService =
        RateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getLimits(
        params: RateGetLimitsParams,
        requestOptions: RequestOptions,
    ): RateGetLimitsResponse =
        // get /v1/rate/limits
        withRawResponse().getLimits(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RateService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RateService.WithRawResponse =
            RateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getLimitsHandler: Handler<RateGetLimitsResponse> =
            jsonHandler<RateGetLimitsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getLimits(
            params: RateGetLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RateGetLimitsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "rate", "limits")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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

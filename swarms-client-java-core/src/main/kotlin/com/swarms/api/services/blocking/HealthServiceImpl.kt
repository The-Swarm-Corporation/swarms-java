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
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepare
import com.swarms.api.models.health.HealthCheckParams
import com.swarms.api.models.health.HealthCheckResponse
import java.util.function.Consumer

class HealthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HealthService {

    private val withRawResponse: HealthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HealthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService =
        HealthServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun check(
        params: HealthCheckParams,
        requestOptions: RequestOptions,
    ): HealthCheckResponse =
        // get /health
        withRawResponse().check(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HealthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HealthService.WithRawResponse =
            HealthServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHandler: Handler<HealthCheckResponse> =
            jsonHandler<HealthCheckResponse>(clientOptions.jsonMapper)

        override fun check(
            params: HealthCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

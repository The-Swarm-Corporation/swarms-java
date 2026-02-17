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
import com.swarms.api.models.models.ModelListAvailableParams
import com.swarms.api.models.models.ModelListAvailableResponse
import java.util.function.Consumer

class ModelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelService {

    private val withRawResponse: ModelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ModelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelService =
        ModelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listAvailable(
        params: ModelListAvailableParams,
        requestOptions: RequestOptions,
    ): ModelListAvailableResponse =
        // get /v1/models/available
        withRawResponse().listAvailable(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelService.WithRawResponse =
            ModelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listAvailableHandler: Handler<ModelListAvailableResponse> =
            jsonHandler<ModelListAvailableResponse>(clientOptions.jsonMapper)

        override fun listAvailable(
            params: ModelListAvailableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelListAvailableResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "models", "available")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAvailableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.models.ModelListAvailableParams
import com.swarms.api.models.models.ModelListAvailableResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelServiceAsync

    /** Get all available models. */
    fun listAvailable(): CompletableFuture<ModelListAvailableResponse> =
        listAvailable(ModelListAvailableParams.none())

    /** @see [listAvailable] */
    fun listAvailable(
        params: ModelListAvailableParams = ModelListAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelListAvailableResponse>

    /** @see [listAvailable] */
    fun listAvailable(
        params: ModelListAvailableParams = ModelListAvailableParams.none()
    ): CompletableFuture<ModelListAvailableResponse> = listAvailable(params, RequestOptions.none())

    /** @see [listAvailable] */
    fun listAvailable(
        requestOptions: RequestOptions
    ): CompletableFuture<ModelListAvailableResponse> =
        listAvailable(ModelListAvailableParams.none(), requestOptions)

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models/available`, but is otherwise the same as
         * [ModelServiceAsync.listAvailable].
         */
        fun listAvailable(): CompletableFuture<HttpResponseFor<ModelListAvailableResponse>> =
            listAvailable(ModelListAvailableParams.none())

        /** @see [listAvailable] */
        fun listAvailable(
            params: ModelListAvailableParams = ModelListAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelListAvailableResponse>>

        /** @see [listAvailable] */
        fun listAvailable(
            params: ModelListAvailableParams = ModelListAvailableParams.none()
        ): CompletableFuture<HttpResponseFor<ModelListAvailableResponse>> =
            listAvailable(params, RequestOptions.none())

        /** @see [listAvailable] */
        fun listAvailable(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ModelListAvailableResponse>> =
            listAvailable(ModelListAvailableParams.none(), requestOptions)
    }
}

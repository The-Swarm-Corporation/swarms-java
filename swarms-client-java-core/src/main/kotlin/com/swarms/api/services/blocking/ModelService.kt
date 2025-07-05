// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.models.ModelListAvailableParams
import com.swarms.api.models.models.ModelListAvailableResponse
import java.util.function.Consumer

interface ModelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelService

    /** Get all available models. */
    fun listAvailable(): ModelListAvailableResponse = listAvailable(ModelListAvailableParams.none())

    /** @see [listAvailable] */
    fun listAvailable(
        params: ModelListAvailableParams = ModelListAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelListAvailableResponse

    /** @see [listAvailable] */
    fun listAvailable(
        params: ModelListAvailableParams = ModelListAvailableParams.none()
    ): ModelListAvailableResponse = listAvailable(params, RequestOptions.none())

    /** @see [listAvailable] */
    fun listAvailable(requestOptions: RequestOptions): ModelListAvailableResponse =
        listAvailable(ModelListAvailableParams.none(), requestOptions)

    /** A view of [ModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models/available`, but is otherwise the same as
         * [ModelService.listAvailable].
         */
        @MustBeClosed
        fun listAvailable(): HttpResponseFor<ModelListAvailableResponse> =
            listAvailable(ModelListAvailableParams.none())

        /** @see [listAvailable] */
        @MustBeClosed
        fun listAvailable(
            params: ModelListAvailableParams = ModelListAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelListAvailableResponse>

        /** @see [listAvailable] */
        @MustBeClosed
        fun listAvailable(
            params: ModelListAvailableParams = ModelListAvailableParams.none()
        ): HttpResponseFor<ModelListAvailableResponse> =
            listAvailable(params, RequestOptions.none())

        /** @see [listAvailable] */
        @MustBeClosed
        fun listAvailable(
            requestOptions: RequestOptions
        ): HttpResponseFor<ModelListAvailableResponse> =
            listAvailable(ModelListAvailableParams.none(), requestOptions)
    }
}

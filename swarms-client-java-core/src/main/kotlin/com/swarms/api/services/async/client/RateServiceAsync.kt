// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.rate.RateGetLimitsParams
import com.swarms.api.models.client.rate.RateGetLimitsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateServiceAsync

    /** Get the rate limits and current usage for the user associated with the provided API key. */
    fun getLimits(): CompletableFuture<RateGetLimitsResponse> =
        getLimits(RateGetLimitsParams.none())

    /** @see [getLimits] */
    fun getLimits(
        params: RateGetLimitsParams = RateGetLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateGetLimitsResponse>

    /** @see [getLimits] */
    fun getLimits(
        params: RateGetLimitsParams = RateGetLimitsParams.none()
    ): CompletableFuture<RateGetLimitsResponse> = getLimits(params, RequestOptions.none())

    /** @see [getLimits] */
    fun getLimits(requestOptions: RequestOptions): CompletableFuture<RateGetLimitsResponse> =
        getLimits(RateGetLimitsParams.none(), requestOptions)

    /** A view of [RateServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/rate/limits`, but is otherwise the same as
         * [RateServiceAsync.getLimits].
         */
        fun getLimits(): CompletableFuture<HttpResponseFor<RateGetLimitsResponse>> =
            getLimits(RateGetLimitsParams.none())

        /** @see [getLimits] */
        fun getLimits(
            params: RateGetLimitsParams = RateGetLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateGetLimitsResponse>>

        /** @see [getLimits] */
        fun getLimits(
            params: RateGetLimitsParams = RateGetLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<RateGetLimitsResponse>> =
            getLimits(params, RequestOptions.none())

        /** @see [getLimits] */
        fun getLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RateGetLimitsResponse>> =
            getLimits(RateGetLimitsParams.none(), requestOptions)
    }
}

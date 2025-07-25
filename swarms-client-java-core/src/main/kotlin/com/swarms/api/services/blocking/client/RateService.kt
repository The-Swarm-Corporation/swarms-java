// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.rate.RateGetLimitsParams
import com.swarms.api.models.client.rate.RateGetLimitsResponse
import java.util.function.Consumer

interface RateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateService

    /** Get the rate limits and current usage for the user associated with the provided API key. */
    fun getLimits(): RateGetLimitsResponse = getLimits(RateGetLimitsParams.none())

    /** @see getLimits */
    fun getLimits(
        params: RateGetLimitsParams = RateGetLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RateGetLimitsResponse

    /** @see getLimits */
    fun getLimits(params: RateGetLimitsParams = RateGetLimitsParams.none()): RateGetLimitsResponse =
        getLimits(params, RequestOptions.none())

    /** @see getLimits */
    fun getLimits(requestOptions: RequestOptions): RateGetLimitsResponse =
        getLimits(RateGetLimitsParams.none(), requestOptions)

    /** A view of [RateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/rate/limits`, but is otherwise the same as
         * [RateService.getLimits].
         */
        @MustBeClosed
        fun getLimits(): HttpResponseFor<RateGetLimitsResponse> =
            getLimits(RateGetLimitsParams.none())

        /** @see getLimits */
        @MustBeClosed
        fun getLimits(
            params: RateGetLimitsParams = RateGetLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RateGetLimitsResponse>

        /** @see getLimits */
        @MustBeClosed
        fun getLimits(
            params: RateGetLimitsParams = RateGetLimitsParams.none()
        ): HttpResponseFor<RateGetLimitsResponse> = getLimits(params, RequestOptions.none())

        /** @see getLimits */
        @MustBeClosed
        fun getLimits(requestOptions: RequestOptions): HttpResponseFor<RateGetLimitsResponse> =
            getLimits(RateGetLimitsParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.health.HealthCheckParams
import com.swarms.api.models.health.HealthCheckResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HealthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthServiceAsync

    /** Health */
    fun check(): CompletableFuture<HealthCheckResponse> = check(HealthCheckParams.none())

    /** @see [check] */
    fun check(
        params: HealthCheckParams = HealthCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HealthCheckResponse>

    /** @see [check] */
    fun check(
        params: HealthCheckParams = HealthCheckParams.none()
    ): CompletableFuture<HealthCheckResponse> = check(params, RequestOptions.none())

    /** @see [check] */
    fun check(requestOptions: RequestOptions): CompletableFuture<HealthCheckResponse> =
        check(HealthCheckParams.none(), requestOptions)

    /**
     * A view of [HealthServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HealthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /health`, but is otherwise the same as
         * [HealthServiceAsync.check].
         */
        fun check(): CompletableFuture<HttpResponseFor<HealthCheckResponse>> =
            check(HealthCheckParams.none())

        /** @see [check] */
        fun check(
            params: HealthCheckParams = HealthCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HealthCheckResponse>>

        /** @see [check] */
        fun check(
            params: HealthCheckParams = HealthCheckParams.none()
        ): CompletableFuture<HttpResponseFor<HealthCheckResponse>> =
            check(params, RequestOptions.none())

        /** @see [check] */
        fun check(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HealthCheckResponse>> =
            check(HealthCheckParams.none(), requestOptions)
    }
}

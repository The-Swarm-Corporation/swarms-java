// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.swarms.SwarmCheckAvailableParams
import com.swarms.api.models.swarms.SwarmCheckAvailableResponse
import com.swarms.api.models.swarms.SwarmGetLogsParams
import com.swarms.api.models.swarms.SwarmGetLogsResponse
import com.swarms.api.models.swarms.SwarmRunParams
import com.swarms.api.models.swarms.SwarmRunResponse
import com.swarms.api.services.async.swarms.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SwarmServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmServiceAsync

    fun batch(): BatchServiceAsync

    /** Check the available swarm types. */
    fun checkAvailable(): CompletableFuture<SwarmCheckAvailableResponse> =
        checkAvailable(SwarmCheckAvailableParams.none())

    /** @see checkAvailable */
    fun checkAvailable(
        params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwarmCheckAvailableResponse>

    /** @see checkAvailable */
    fun checkAvailable(
        params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none()
    ): CompletableFuture<SwarmCheckAvailableResponse> =
        checkAvailable(params, RequestOptions.none())

    /** @see checkAvailable */
    fun checkAvailable(
        requestOptions: RequestOptions
    ): CompletableFuture<SwarmCheckAvailableResponse> =
        checkAvailable(SwarmCheckAvailableParams.none(), requestOptions)

    /**
     * Get all API request logs for all API keys associated with the user identified by the provided
     * API key, excluding any logs that contain a client_ip field in their data.
     */
    fun getLogs(): CompletableFuture<SwarmGetLogsResponse> = getLogs(SwarmGetLogsParams.none())

    /** @see getLogs */
    fun getLogs(
        params: SwarmGetLogsParams = SwarmGetLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwarmGetLogsResponse>

    /** @see getLogs */
    fun getLogs(
        params: SwarmGetLogsParams = SwarmGetLogsParams.none()
    ): CompletableFuture<SwarmGetLogsResponse> = getLogs(params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(requestOptions: RequestOptions): CompletableFuture<SwarmGetLogsResponse> =
        getLogs(SwarmGetLogsParams.none(), requestOptions)

    /** Run a swarm with the specified task. */
    fun run(params: SwarmRunParams): CompletableFuture<SwarmRunResponse> =
        run(params, RequestOptions.none())

    /** @see run */
    fun run(
        params: SwarmRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SwarmRunResponse>

    /** A view of [SwarmServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SwarmServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/swarms/available`, but is otherwise the same as
         * [SwarmServiceAsync.checkAvailable].
         */
        fun checkAvailable(): CompletableFuture<HttpResponseFor<SwarmCheckAvailableResponse>> =
            checkAvailable(SwarmCheckAvailableParams.none())

        /** @see checkAvailable */
        fun checkAvailable(
            params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwarmCheckAvailableResponse>>

        /** @see checkAvailable */
        fun checkAvailable(
            params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none()
        ): CompletableFuture<HttpResponseFor<SwarmCheckAvailableResponse>> =
            checkAvailable(params, RequestOptions.none())

        /** @see checkAvailable */
        fun checkAvailable(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SwarmCheckAvailableResponse>> =
            checkAvailable(SwarmCheckAvailableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/swarm/logs`, but is otherwise the same as
         * [SwarmServiceAsync.getLogs].
         */
        fun getLogs(): CompletableFuture<HttpResponseFor<SwarmGetLogsResponse>> =
            getLogs(SwarmGetLogsParams.none())

        /** @see getLogs */
        fun getLogs(
            params: SwarmGetLogsParams = SwarmGetLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwarmGetLogsResponse>>

        /** @see getLogs */
        fun getLogs(
            params: SwarmGetLogsParams = SwarmGetLogsParams.none()
        ): CompletableFuture<HttpResponseFor<SwarmGetLogsResponse>> =
            getLogs(params, RequestOptions.none())

        /** @see getLogs */
        fun getLogs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SwarmGetLogsResponse>> =
            getLogs(SwarmGetLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/swarm/completions`, but is otherwise the same
         * as [SwarmServiceAsync.run].
         */
        fun run(params: SwarmRunParams): CompletableFuture<HttpResponseFor<SwarmRunResponse>> =
            run(params, RequestOptions.none())

        /** @see run */
        fun run(
            params: SwarmRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SwarmRunResponse>>
    }
}

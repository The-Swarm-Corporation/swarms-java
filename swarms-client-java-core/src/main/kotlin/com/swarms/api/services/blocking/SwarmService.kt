// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.swarms.SwarmCheckAvailableParams
import com.swarms.api.models.swarms.SwarmCheckAvailableResponse
import com.swarms.api.models.swarms.SwarmGetLogsParams
import com.swarms.api.models.swarms.SwarmGetLogsResponse
import com.swarms.api.models.swarms.SwarmRunParams
import com.swarms.api.models.swarms.SwarmRunResponse
import com.swarms.api.services.blocking.swarms.BatchService
import java.util.function.Consumer

interface SwarmService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmService

    fun batch(): BatchService

    /** Check the available swarm types. */
    fun checkAvailable(): SwarmCheckAvailableResponse =
        checkAvailable(SwarmCheckAvailableParams.none())

    /** @see [checkAvailable] */
    fun checkAvailable(
        params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwarmCheckAvailableResponse

    /** @see [checkAvailable] */
    fun checkAvailable(
        params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none()
    ): SwarmCheckAvailableResponse = checkAvailable(params, RequestOptions.none())

    /** @see [checkAvailable] */
    fun checkAvailable(requestOptions: RequestOptions): SwarmCheckAvailableResponse =
        checkAvailable(SwarmCheckAvailableParams.none(), requestOptions)

    /**
     * Get all API request logs for the user associated with the provided API key, excluding any
     * logs that contain a client_ip field in their data.
     */
    fun getLogs(): SwarmGetLogsResponse = getLogs(SwarmGetLogsParams.none())

    /** @see [getLogs] */
    fun getLogs(
        params: SwarmGetLogsParams = SwarmGetLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwarmGetLogsResponse

    /** @see [getLogs] */
    fun getLogs(params: SwarmGetLogsParams = SwarmGetLogsParams.none()): SwarmGetLogsResponse =
        getLogs(params, RequestOptions.none())

    /** @see [getLogs] */
    fun getLogs(requestOptions: RequestOptions): SwarmGetLogsResponse =
        getLogs(SwarmGetLogsParams.none(), requestOptions)

    /** Run a swarm with the specified task. */
    fun run(params: SwarmRunParams): SwarmRunResponse = run(params, RequestOptions.none())

    /** @see [run] */
    fun run(
        params: SwarmRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwarmRunResponse

    /** A view of [SwarmService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/swarms/available`, but is otherwise the same as
         * [SwarmService.checkAvailable].
         */
        @MustBeClosed
        fun checkAvailable(): HttpResponseFor<SwarmCheckAvailableResponse> =
            checkAvailable(SwarmCheckAvailableParams.none())

        /** @see [checkAvailable] */
        @MustBeClosed
        fun checkAvailable(
            params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwarmCheckAvailableResponse>

        /** @see [checkAvailable] */
        @MustBeClosed
        fun checkAvailable(
            params: SwarmCheckAvailableParams = SwarmCheckAvailableParams.none()
        ): HttpResponseFor<SwarmCheckAvailableResponse> =
            checkAvailable(params, RequestOptions.none())

        /** @see [checkAvailable] */
        @MustBeClosed
        fun checkAvailable(
            requestOptions: RequestOptions
        ): HttpResponseFor<SwarmCheckAvailableResponse> =
            checkAvailable(SwarmCheckAvailableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/swarm/logs`, but is otherwise the same as
         * [SwarmService.getLogs].
         */
        @MustBeClosed
        fun getLogs(): HttpResponseFor<SwarmGetLogsResponse> = getLogs(SwarmGetLogsParams.none())

        /** @see [getLogs] */
        @MustBeClosed
        fun getLogs(
            params: SwarmGetLogsParams = SwarmGetLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwarmGetLogsResponse>

        /** @see [getLogs] */
        @MustBeClosed
        fun getLogs(
            params: SwarmGetLogsParams = SwarmGetLogsParams.none()
        ): HttpResponseFor<SwarmGetLogsResponse> = getLogs(params, RequestOptions.none())

        /** @see [getLogs] */
        @MustBeClosed
        fun getLogs(requestOptions: RequestOptions): HttpResponseFor<SwarmGetLogsResponse> =
            getLogs(SwarmGetLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/swarm/completions`, but is otherwise the same
         * as [SwarmService.run].
         */
        @MustBeClosed
        fun run(params: SwarmRunParams): HttpResponseFor<SwarmRunResponse> =
            run(params, RequestOptions.none())

        /** @see [run] */
        @MustBeClosed
        fun run(
            params: SwarmRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwarmRunResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.swarms

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.swarms.batch.BatchRunParams
import com.swarms.api.models.swarms.batch.BatchRunResponse
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Run a batch of swarms with the specified tasks using a thread pool. */
    fun run(params: BatchRunParams): List<BatchRunResponse> = run(params, RequestOptions.none())

    /** @see run */
    fun run(
        params: BatchRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BatchRunResponse>

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/swarm/batch/completions`, but is otherwise the
         * same as [BatchService.run].
         */
        @MustBeClosed
        fun run(params: BatchRunParams): HttpResponseFor<List<BatchRunResponse>> =
            run(params, RequestOptions.none())

        /** @see run */
        @MustBeClosed
        fun run(
            params: BatchRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BatchRunResponse>>
    }
}

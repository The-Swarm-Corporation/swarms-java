// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.agent

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.agent.batch.BatchRunParams
import com.swarms.api.models.agent.batch.BatchRunResponse
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

    /** Run a batch of agents with the specified tasks using a thread pool. */
    fun run(params: BatchRunParams): BatchRunResponse = run(params, RequestOptions.none())

    /** @see [run] */
    fun run(
        params: BatchRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRunResponse

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agent/batch/completions`, but is otherwise the
         * same as [BatchService.run].
         */
        @MustBeClosed
        fun run(params: BatchRunParams): HttpResponseFor<BatchRunResponse> =
            run(params, RequestOptions.none())

        /** @see [run] */
        @MustBeClosed
        fun run(
            params: BatchRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRunResponse>
    }
}

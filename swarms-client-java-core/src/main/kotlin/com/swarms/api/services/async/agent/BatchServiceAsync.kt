// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.agent

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.agent.batch.BatchRunParams
import com.swarms.api.models.agent.batch.BatchRunResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /** Run a batch of agents with the specified tasks using a thread pool. */
    fun run(params: BatchRunParams): CompletableFuture<BatchRunResponse> =
        run(params, RequestOptions.none())

    /** @see [run] */
    fun run(
        params: BatchRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRunResponse>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agent/batch/completions`, but is otherwise the
         * same as [BatchServiceAsync.run].
         */
        fun run(params: BatchRunParams): CompletableFuture<HttpResponseFor<BatchRunResponse>> =
            run(params, RequestOptions.none())

        /** @see [run] */
        fun run(
            params: BatchRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRunResponse>>
    }
}

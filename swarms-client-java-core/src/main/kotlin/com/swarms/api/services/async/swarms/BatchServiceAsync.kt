// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.swarms

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.swarms.batch.BatchRunParams
import com.swarms.api.models.swarms.batch.BatchRunResponse
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

    /** Run a batch of swarms with the specified tasks using a thread pool. */
    fun run(params: BatchRunParams): CompletableFuture<List<BatchRunResponse>> =
        run(params, RequestOptions.none())

    /** @see [run] */
    fun run(
        params: BatchRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BatchRunResponse>>

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
         * Returns a raw HTTP response for `post /v1/swarm/batch/completions`, but is otherwise the
         * same as [BatchServiceAsync.run].
         */
        fun run(
            params: BatchRunParams
        ): CompletableFuture<HttpResponseFor<List<BatchRunResponse>>> =
            run(params, RequestOptions.none())

        /** @see [run] */
        fun run(
            params: BatchRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BatchRunResponse>>>
    }
}

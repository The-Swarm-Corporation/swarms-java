// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client.advancedresearch

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.advancedresearch.batch.BatchCreateCompletionParams
import com.swarms.api.models.client.advancedresearch.batch.BatchCreateCompletionResponse
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

    /**
     * Execute multiple advanced research sessions concurrently with independent configurations for
     * high-throughput research workflows.
     */
    fun createCompletion(
        params: BatchCreateCompletionParams
    ): CompletableFuture<List<BatchCreateCompletionResponse>> =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: BatchCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BatchCreateCompletionResponse>>

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
         * Returns a raw HTTP response for `post /v1/advanced-research/batch/completions`, but is
         * otherwise the same as [BatchServiceAsync.createCompletion].
         */
        fun createCompletion(
            params: BatchCreateCompletionParams
        ): CompletableFuture<HttpResponseFor<List<BatchCreateCompletionResponse>>> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        fun createCompletion(
            params: BatchCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BatchCreateCompletionResponse>>>
    }
}

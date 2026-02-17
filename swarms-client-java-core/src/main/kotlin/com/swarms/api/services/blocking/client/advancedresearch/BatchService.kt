// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client.advancedresearch

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.advancedresearch.batch.BatchCreateCompletionParams
import com.swarms.api.models.client.advancedresearch.batch.BatchCreateCompletionResponse
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

    /**
     * Execute multiple advanced research sessions concurrently with independent configurations for
     * high-throughput research workflows.
     */
    fun createCompletion(params: BatchCreateCompletionParams): List<BatchCreateCompletionResponse> =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: BatchCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BatchCreateCompletionResponse>

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/advanced-research/batch/completions`, but is
         * otherwise the same as [BatchService.createCompletion].
         */
        @MustBeClosed
        fun createCompletion(
            params: BatchCreateCompletionParams
        ): HttpResponseFor<List<BatchCreateCompletionResponse>> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            params: BatchCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BatchCreateCompletionResponse>>
    }
}

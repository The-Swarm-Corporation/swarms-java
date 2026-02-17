// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.advancedresearch.AdvancedResearchCreateCompletionParams
import com.swarms.api.models.client.advancedresearch.AdvancedResearchCreateCompletionResponse
import com.swarms.api.services.async.client.advancedresearch.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AdvancedResearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedResearchServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Execute comprehensive research sessions with multi-source data collection, analysis, and
     * synthesis capabilities.
     */
    fun createCompletion(
        params: AdvancedResearchCreateCompletionParams
    ): CompletableFuture<AdvancedResearchCreateCompletionResponse> =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: AdvancedResearchCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedResearchCreateCompletionResponse>

    /**
     * A view of [AdvancedResearchServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedResearchServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/advanced-research/completions`, but is
         * otherwise the same as [AdvancedResearchServiceAsync.createCompletion].
         */
        fun createCompletion(
            params: AdvancedResearchCreateCompletionParams
        ): CompletableFuture<HttpResponseFor<AdvancedResearchCreateCompletionResponse>> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        fun createCompletion(
            params: AdvancedResearchCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedResearchCreateCompletionResponse>>
    }
}

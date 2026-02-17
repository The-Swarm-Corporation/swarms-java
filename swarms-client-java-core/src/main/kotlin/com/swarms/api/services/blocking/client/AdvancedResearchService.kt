// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.advancedresearch.AdvancedResearchCreateCompletionParams
import com.swarms.api.models.client.advancedresearch.AdvancedResearchCreateCompletionResponse
import com.swarms.api.services.blocking.client.advancedresearch.BatchService
import java.util.function.Consumer

interface AdvancedResearchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedResearchService

    fun batch(): BatchService

    /**
     * Execute comprehensive research sessions with multi-source data collection, analysis, and
     * synthesis capabilities.
     */
    fun createCompletion(
        params: AdvancedResearchCreateCompletionParams
    ): AdvancedResearchCreateCompletionResponse = createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: AdvancedResearchCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedResearchCreateCompletionResponse

    /**
     * A view of [AdvancedResearchService] that provides access to raw HTTP responses for each
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
        ): AdvancedResearchService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/advanced-research/completions`, but is
         * otherwise the same as [AdvancedResearchService.createCompletion].
         */
        @MustBeClosed
        fun createCompletion(
            params: AdvancedResearchCreateCompletionParams
        ): HttpResponseFor<AdvancedResearchCreateCompletionResponse> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            params: AdvancedResearchCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedResearchCreateCompletionResponse>
    }
}

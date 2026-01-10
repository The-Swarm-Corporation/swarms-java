// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.async.client.AdvancedResearchServiceAsync
import com.swarms.api.services.async.client.AutoSwarmBuilderServiceAsync
import com.swarms.api.services.async.client.BatchedGridWorkflowServiceAsync
import com.swarms.api.services.async.client.GraphWorkflowServiceAsync
import com.swarms.api.services.async.client.MarketplaceServiceAsync
import com.swarms.api.services.async.client.RateServiceAsync
import com.swarms.api.services.async.client.ToolServiceAsync
import java.util.function.Consumer

interface ClientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientServiceAsync

    fun rate(): RateServiceAsync

    fun autoSwarmBuilder(): AutoSwarmBuilderServiceAsync

    fun advancedResearch(): AdvancedResearchServiceAsync

    fun tools(): ToolServiceAsync

    fun marketplace(): MarketplaceServiceAsync

    fun batchedGridWorkflow(): BatchedGridWorkflowServiceAsync

    fun graphWorkflow(): GraphWorkflowServiceAsync

    /**
     * A view of [ClientServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientServiceAsync.WithRawResponse

        fun rate(): RateServiceAsync.WithRawResponse

        fun autoSwarmBuilder(): AutoSwarmBuilderServiceAsync.WithRawResponse

        fun advancedResearch(): AdvancedResearchServiceAsync.WithRawResponse

        fun tools(): ToolServiceAsync.WithRawResponse

        fun marketplace(): MarketplaceServiceAsync.WithRawResponse

        fun batchedGridWorkflow(): BatchedGridWorkflowServiceAsync.WithRawResponse

        fun graphWorkflow(): GraphWorkflowServiceAsync.WithRawResponse
    }
}

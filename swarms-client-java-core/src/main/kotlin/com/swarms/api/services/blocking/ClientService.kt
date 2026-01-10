// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.blocking.client.AdvancedResearchService
import com.swarms.api.services.blocking.client.AutoSwarmBuilderService
import com.swarms.api.services.blocking.client.BatchedGridWorkflowService
import com.swarms.api.services.blocking.client.GraphWorkflowService
import com.swarms.api.services.blocking.client.MarketplaceService
import com.swarms.api.services.blocking.client.RateService
import com.swarms.api.services.blocking.client.ToolService
import java.util.function.Consumer

interface ClientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientService

    fun rate(): RateService

    fun autoSwarmBuilder(): AutoSwarmBuilderService

    fun advancedResearch(): AdvancedResearchService

    fun tools(): ToolService

    fun marketplace(): MarketplaceService

    fun batchedGridWorkflow(): BatchedGridWorkflowService

    fun graphWorkflow(): GraphWorkflowService

    /** A view of [ClientService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientService.WithRawResponse

        fun rate(): RateService.WithRawResponse

        fun autoSwarmBuilder(): AutoSwarmBuilderService.WithRawResponse

        fun advancedResearch(): AdvancedResearchService.WithRawResponse

        fun tools(): ToolService.WithRawResponse

        fun marketplace(): MarketplaceService.WithRawResponse

        fun batchedGridWorkflow(): BatchedGridWorkflowService.WithRawResponse

        fun graphWorkflow(): GraphWorkflowService.WithRawResponse
    }
}

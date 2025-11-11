// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.blocking.client.AdvancedResearchService
import com.swarms.api.services.blocking.client.AdvancedResearchServiceImpl
import com.swarms.api.services.blocking.client.AutoSwarmBuilderService
import com.swarms.api.services.blocking.client.AutoSwarmBuilderServiceImpl
import com.swarms.api.services.blocking.client.BatchedGridWorkflowService
import com.swarms.api.services.blocking.client.BatchedGridWorkflowServiceImpl
import com.swarms.api.services.blocking.client.MarketplaceService
import com.swarms.api.services.blocking.client.MarketplaceServiceImpl
import com.swarms.api.services.blocking.client.RateService
import com.swarms.api.services.blocking.client.RateServiceImpl
import com.swarms.api.services.blocking.client.ToolService
import com.swarms.api.services.blocking.client.ToolServiceImpl
import java.util.function.Consumer

class ClientServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClientService {

    private val withRawResponse: ClientService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rate: RateService by lazy { RateServiceImpl(clientOptions) }

    private val autoSwarmBuilder: AutoSwarmBuilderService by lazy {
        AutoSwarmBuilderServiceImpl(clientOptions)
    }

    private val advancedResearch: AdvancedResearchService by lazy {
        AdvancedResearchServiceImpl(clientOptions)
    }

    private val tools: ToolService by lazy { ToolServiceImpl(clientOptions) }

    private val marketplace: MarketplaceService by lazy { MarketplaceServiceImpl(clientOptions) }

    private val batchedGridWorkflow: BatchedGridWorkflowService by lazy {
        BatchedGridWorkflowServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ClientService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientService =
        ClientServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rate(): RateService = rate

    override fun autoSwarmBuilder(): AutoSwarmBuilderService = autoSwarmBuilder

    override fun advancedResearch(): AdvancedResearchService = advancedResearch

    override fun tools(): ToolService = tools

    override fun marketplace(): MarketplaceService = marketplace

    override fun batchedGridWorkflow(): BatchedGridWorkflowService = batchedGridWorkflow

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClientService.WithRawResponse {

        private val rate: RateService.WithRawResponse by lazy {
            RateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val autoSwarmBuilder: AutoSwarmBuilderService.WithRawResponse by lazy {
            AutoSwarmBuilderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val advancedResearch: AdvancedResearchService.WithRawResponse by lazy {
            AdvancedResearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolService.WithRawResponse by lazy {
            ToolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketplace: MarketplaceService.WithRawResponse by lazy {
            MarketplaceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batchedGridWorkflow: BatchedGridWorkflowService.WithRawResponse by lazy {
            BatchedGridWorkflowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientService.WithRawResponse =
            ClientServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rate(): RateService.WithRawResponse = rate

        override fun autoSwarmBuilder(): AutoSwarmBuilderService.WithRawResponse = autoSwarmBuilder

        override fun advancedResearch(): AdvancedResearchService.WithRawResponse = advancedResearch

        override fun tools(): ToolService.WithRawResponse = tools

        override fun marketplace(): MarketplaceService.WithRawResponse = marketplace

        override fun batchedGridWorkflow(): BatchedGridWorkflowService.WithRawResponse =
            batchedGridWorkflow
    }
}

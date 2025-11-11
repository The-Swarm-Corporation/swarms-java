// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.async.client.AdvancedResearchServiceAsync
import com.swarms.api.services.async.client.AdvancedResearchServiceAsyncImpl
import com.swarms.api.services.async.client.AutoSwarmBuilderServiceAsync
import com.swarms.api.services.async.client.AutoSwarmBuilderServiceAsyncImpl
import com.swarms.api.services.async.client.BatchedGridWorkflowServiceAsync
import com.swarms.api.services.async.client.BatchedGridWorkflowServiceAsyncImpl
import com.swarms.api.services.async.client.MarketplaceServiceAsync
import com.swarms.api.services.async.client.MarketplaceServiceAsyncImpl
import com.swarms.api.services.async.client.RateServiceAsync
import com.swarms.api.services.async.client.RateServiceAsyncImpl
import com.swarms.api.services.async.client.ToolServiceAsync
import com.swarms.api.services.async.client.ToolServiceAsyncImpl
import java.util.function.Consumer

class ClientServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClientServiceAsync {

    private val withRawResponse: ClientServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rate: RateServiceAsync by lazy { RateServiceAsyncImpl(clientOptions) }

    private val autoSwarmBuilder: AutoSwarmBuilderServiceAsync by lazy {
        AutoSwarmBuilderServiceAsyncImpl(clientOptions)
    }

    private val advancedResearch: AdvancedResearchServiceAsync by lazy {
        AdvancedResearchServiceAsyncImpl(clientOptions)
    }

    private val tools: ToolServiceAsync by lazy { ToolServiceAsyncImpl(clientOptions) }

    private val marketplace: MarketplaceServiceAsync by lazy {
        MarketplaceServiceAsyncImpl(clientOptions)
    }

    private val batchedGridWorkflow: BatchedGridWorkflowServiceAsync by lazy {
        BatchedGridWorkflowServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ClientServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientServiceAsync =
        ClientServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rate(): RateServiceAsync = rate

    override fun autoSwarmBuilder(): AutoSwarmBuilderServiceAsync = autoSwarmBuilder

    override fun advancedResearch(): AdvancedResearchServiceAsync = advancedResearch

    override fun tools(): ToolServiceAsync = tools

    override fun marketplace(): MarketplaceServiceAsync = marketplace

    override fun batchedGridWorkflow(): BatchedGridWorkflowServiceAsync = batchedGridWorkflow

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClientServiceAsync.WithRawResponse {

        private val rate: RateServiceAsync.WithRawResponse by lazy {
            RateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val autoSwarmBuilder: AutoSwarmBuilderServiceAsync.WithRawResponse by lazy {
            AutoSwarmBuilderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val advancedResearch: AdvancedResearchServiceAsync.WithRawResponse by lazy {
            AdvancedResearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolServiceAsync.WithRawResponse by lazy {
            ToolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketplace: MarketplaceServiceAsync.WithRawResponse by lazy {
            MarketplaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batchedGridWorkflow: BatchedGridWorkflowServiceAsync.WithRawResponse by lazy {
            BatchedGridWorkflowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientServiceAsync.WithRawResponse =
            ClientServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rate(): RateServiceAsync.WithRawResponse = rate

        override fun autoSwarmBuilder(): AutoSwarmBuilderServiceAsync.WithRawResponse =
            autoSwarmBuilder

        override fun advancedResearch(): AdvancedResearchServiceAsync.WithRawResponse =
            advancedResearch

        override fun tools(): ToolServiceAsync.WithRawResponse = tools

        override fun marketplace(): MarketplaceServiceAsync.WithRawResponse = marketplace

        override fun batchedGridWorkflow(): BatchedGridWorkflowServiceAsync.WithRawResponse =
            batchedGridWorkflow
    }
}

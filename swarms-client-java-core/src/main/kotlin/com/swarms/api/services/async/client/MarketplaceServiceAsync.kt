// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.marketplace.MarketplaceCreateAgentParams
import com.swarms.api.models.client.marketplace.MarketplaceCreateAgentResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MarketplaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketplaceServiceAsync

    /** Retrieve free agents from the marketplace. */
    fun createAgent(): CompletableFuture<MarketplaceCreateAgentResponse> =
        createAgent(MarketplaceCreateAgentParams.none())

    /** @see createAgent */
    fun createAgent(
        params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketplaceCreateAgentResponse>

    /** @see createAgent */
    fun createAgent(
        params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none()
    ): CompletableFuture<MarketplaceCreateAgentResponse> =
        createAgent(params, RequestOptions.none())

    /** @see createAgent */
    fun createAgent(
        requestOptions: RequestOptions
    ): CompletableFuture<MarketplaceCreateAgentResponse> =
        createAgent(MarketplaceCreateAgentParams.none(), requestOptions)

    /**
     * A view of [MarketplaceServiceAsync] that provides access to raw HTTP responses for each
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
        ): MarketplaceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/marketplace/agents`, but is otherwise the same
         * as [MarketplaceServiceAsync.createAgent].
         */
        fun createAgent(): CompletableFuture<HttpResponseFor<MarketplaceCreateAgentResponse>> =
            createAgent(MarketplaceCreateAgentParams.none())

        /** @see createAgent */
        fun createAgent(
            params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketplaceCreateAgentResponse>>

        /** @see createAgent */
        fun createAgent(
            params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none()
        ): CompletableFuture<HttpResponseFor<MarketplaceCreateAgentResponse>> =
            createAgent(params, RequestOptions.none())

        /** @see createAgent */
        fun createAgent(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MarketplaceCreateAgentResponse>> =
            createAgent(MarketplaceCreateAgentParams.none(), requestOptions)
    }
}

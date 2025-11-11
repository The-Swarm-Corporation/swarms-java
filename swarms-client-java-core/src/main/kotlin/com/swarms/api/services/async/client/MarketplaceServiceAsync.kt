// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsParams
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsResponse
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
    fun listAgents(): CompletableFuture<MarketplaceListAgentsResponse> =
        listAgents(MarketplaceListAgentsParams.none())

    /** @see listAgents */
    fun listAgents(
        params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketplaceListAgentsResponse>

    /** @see listAgents */
    fun listAgents(
        params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none()
    ): CompletableFuture<MarketplaceListAgentsResponse> = listAgents(params, RequestOptions.none())

    /** @see listAgents */
    fun listAgents(
        requestOptions: RequestOptions
    ): CompletableFuture<MarketplaceListAgentsResponse> =
        listAgents(MarketplaceListAgentsParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /v1/marketplace/agents`, but is otherwise the same
         * as [MarketplaceServiceAsync.listAgents].
         */
        fun listAgents(): CompletableFuture<HttpResponseFor<MarketplaceListAgentsResponse>> =
            listAgents(MarketplaceListAgentsParams.none())

        /** @see listAgents */
        fun listAgents(
            params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketplaceListAgentsResponse>>

        /** @see listAgents */
        fun listAgents(
            params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none()
        ): CompletableFuture<HttpResponseFor<MarketplaceListAgentsResponse>> =
            listAgents(params, RequestOptions.none())

        /** @see listAgents */
        fun listAgents(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MarketplaceListAgentsResponse>> =
            listAgents(MarketplaceListAgentsParams.none(), requestOptions)
    }
}

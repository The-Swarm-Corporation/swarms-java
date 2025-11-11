// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsParams
import com.swarms.api.models.client.marketplace.MarketplaceListAgentsResponse
import java.util.function.Consumer

interface MarketplaceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketplaceService

    /** Retrieve free agents from the marketplace. */
    fun listAgents(): MarketplaceListAgentsResponse = listAgents(MarketplaceListAgentsParams.none())

    /** @see listAgents */
    fun listAgents(
        params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketplaceListAgentsResponse

    /** @see listAgents */
    fun listAgents(
        params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none()
    ): MarketplaceListAgentsResponse = listAgents(params, RequestOptions.none())

    /** @see listAgents */
    fun listAgents(requestOptions: RequestOptions): MarketplaceListAgentsResponse =
        listAgents(MarketplaceListAgentsParams.none(), requestOptions)

    /**
     * A view of [MarketplaceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketplaceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/marketplace/agents`, but is otherwise the same
         * as [MarketplaceService.listAgents].
         */
        @MustBeClosed
        fun listAgents(): HttpResponseFor<MarketplaceListAgentsResponse> =
            listAgents(MarketplaceListAgentsParams.none())

        /** @see listAgents */
        @MustBeClosed
        fun listAgents(
            params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketplaceListAgentsResponse>

        /** @see listAgents */
        @MustBeClosed
        fun listAgents(
            params: MarketplaceListAgentsParams = MarketplaceListAgentsParams.none()
        ): HttpResponseFor<MarketplaceListAgentsResponse> =
            listAgents(params, RequestOptions.none())

        /** @see listAgents */
        @MustBeClosed
        fun listAgents(
            requestOptions: RequestOptions
        ): HttpResponseFor<MarketplaceListAgentsResponse> =
            listAgents(MarketplaceListAgentsParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.marketplace.MarketplaceCreateAgentParams
import com.swarms.api.models.client.marketplace.MarketplaceCreateAgentResponse
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
    fun createAgent(): MarketplaceCreateAgentResponse =
        createAgent(MarketplaceCreateAgentParams.none())

    /** @see createAgent */
    fun createAgent(
        params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketplaceCreateAgentResponse

    /** @see createAgent */
    fun createAgent(
        params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none()
    ): MarketplaceCreateAgentResponse = createAgent(params, RequestOptions.none())

    /** @see createAgent */
    fun createAgent(requestOptions: RequestOptions): MarketplaceCreateAgentResponse =
        createAgent(MarketplaceCreateAgentParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /v1/marketplace/agents`, but is otherwise the same
         * as [MarketplaceService.createAgent].
         */
        @MustBeClosed
        fun createAgent(): HttpResponseFor<MarketplaceCreateAgentResponse> =
            createAgent(MarketplaceCreateAgentParams.none())

        /** @see createAgent */
        @MustBeClosed
        fun createAgent(
            params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketplaceCreateAgentResponse>

        /** @see createAgent */
        @MustBeClosed
        fun createAgent(
            params: MarketplaceCreateAgentParams = MarketplaceCreateAgentParams.none()
        ): HttpResponseFor<MarketplaceCreateAgentResponse> =
            createAgent(params, RequestOptions.none())

        /** @see createAgent */
        @MustBeClosed
        fun createAgent(
            requestOptions: RequestOptions
        ): HttpResponseFor<MarketplaceCreateAgentResponse> =
            createAgent(MarketplaceCreateAgentParams.none(), requestOptions)
    }
}

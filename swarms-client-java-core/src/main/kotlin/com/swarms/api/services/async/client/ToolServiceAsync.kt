// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.tools.ToolListAvailableParams
import com.swarms.api.models.client.tools.ToolListAvailableResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ToolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync

    /**
     * Retrieve comprehensive information about all available tools and capabilities supported by
     * the Swarms API.
     */
    fun listAvailable(): CompletableFuture<ToolListAvailableResponse> =
        listAvailable(ToolListAvailableParams.none())

    /** @see listAvailable */
    fun listAvailable(
        params: ToolListAvailableParams = ToolListAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListAvailableResponse>

    /** @see listAvailable */
    fun listAvailable(
        params: ToolListAvailableParams = ToolListAvailableParams.none()
    ): CompletableFuture<ToolListAvailableResponse> = listAvailable(params, RequestOptions.none())

    /** @see listAvailable */
    fun listAvailable(
        requestOptions: RequestOptions
    ): CompletableFuture<ToolListAvailableResponse> =
        listAvailable(ToolListAvailableParams.none(), requestOptions)

    /** A view of [ToolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/tools/available`, but is otherwise the same as
         * [ToolServiceAsync.listAvailable].
         */
        fun listAvailable(): CompletableFuture<HttpResponseFor<ToolListAvailableResponse>> =
            listAvailable(ToolListAvailableParams.none())

        /** @see listAvailable */
        fun listAvailable(
            params: ToolListAvailableParams = ToolListAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolListAvailableResponse>>

        /** @see listAvailable */
        fun listAvailable(
            params: ToolListAvailableParams = ToolListAvailableParams.none()
        ): CompletableFuture<HttpResponseFor<ToolListAvailableResponse>> =
            listAvailable(params, RequestOptions.none())

        /** @see listAvailable */
        fun listAvailable(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ToolListAvailableResponse>> =
            listAvailable(ToolListAvailableParams.none(), requestOptions)
    }
}

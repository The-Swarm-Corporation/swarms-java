// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.tools.ToolListAvailableParams
import com.swarms.api.models.client.tools.ToolListAvailableResponse
import java.util.function.Consumer

interface ToolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService

    /**
     * Retrieve comprehensive information about all available tools and capabilities supported by
     * the Swarms API.
     */
    fun listAvailable(): ToolListAvailableResponse = listAvailable(ToolListAvailableParams.none())

    /** @see listAvailable */
    fun listAvailable(
        params: ToolListAvailableParams = ToolListAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListAvailableResponse

    /** @see listAvailable */
    fun listAvailable(
        params: ToolListAvailableParams = ToolListAvailableParams.none()
    ): ToolListAvailableResponse = listAvailable(params, RequestOptions.none())

    /** @see listAvailable */
    fun listAvailable(requestOptions: RequestOptions): ToolListAvailableResponse =
        listAvailable(ToolListAvailableParams.none(), requestOptions)

    /** A view of [ToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/tools/available`, but is otherwise the same as
         * [ToolService.listAvailable].
         */
        @MustBeClosed
        fun listAvailable(): HttpResponseFor<ToolListAvailableResponse> =
            listAvailable(ToolListAvailableParams.none())

        /** @see listAvailable */
        @MustBeClosed
        fun listAvailable(
            params: ToolListAvailableParams = ToolListAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListAvailableResponse>

        /** @see listAvailable */
        @MustBeClosed
        fun listAvailable(
            params: ToolListAvailableParams = ToolListAvailableParams.none()
        ): HttpResponseFor<ToolListAvailableResponse> = listAvailable(params, RequestOptions.none())

        /** @see listAvailable */
        @MustBeClosed
        fun listAvailable(
            requestOptions: RequestOptions
        ): HttpResponseFor<ToolListAvailableResponse> =
            listAvailable(ToolListAvailableParams.none(), requestOptions)
    }
}

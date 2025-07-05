// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.agent.AgentRunParams
import com.swarms.api.models.agent.AgentRunResponse
import com.swarms.api.services.blocking.agent.BatchService
import java.util.function.Consumer

interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService

    fun batch(): BatchService

    /** Run an agent with the specified task. */
    fun run(params: AgentRunParams): AgentRunResponse = run(params, RequestOptions.none())

    /** @see [run] */
    fun run(
        params: AgentRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentRunResponse

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/agent/completions`, but is otherwise the same
         * as [AgentService.run].
         */
        @MustBeClosed
        fun run(params: AgentRunParams): HttpResponseFor<AgentRunResponse> =
            run(params, RequestOptions.none())

        /** @see [run] */
        @MustBeClosed
        fun run(
            params: AgentRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentRunResponse>
    }
}

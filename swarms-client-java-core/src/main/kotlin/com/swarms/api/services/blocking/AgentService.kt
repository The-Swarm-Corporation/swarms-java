// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.agent.AgentCompletion
import com.swarms.api.models.agent.AgentListParams
import com.swarms.api.models.agent.AgentListResponse
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

    /**
     * Get all unique agent configurations that the user has created or used, without task details.
     * Allows users to reuse agent configs with new tasks.
     */
    fun list(): AgentListResponse = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListResponse

    /** @see list */
    fun list(params: AgentListParams = AgentListParams.none()): AgentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentListResponse =
        list(AgentListParams.none(), requestOptions)

    /** Run an agent with the specified task. Supports streaming when stream=True. */
    fun run(params: AgentRunParams): AgentRunResponse = run(params, RequestOptions.none())

    /** @see run */
    fun run(
        params: AgentRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentRunResponse

    /** @see run */
    fun run(
        agentCompletion: AgentCompletion,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentRunResponse =
        run(AgentRunParams.builder().agentCompletion(agentCompletion).build(), requestOptions)

    /** @see run */
    fun run(agentCompletion: AgentCompletion): AgentRunResponse =
        run(agentCompletion, RequestOptions.none())

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
         * Returns a raw HTTP response for `get /v1/agents/list`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AgentListResponse> = list(AgentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): HttpResponseFor<AgentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListResponse> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/agent/completions`, but is otherwise the same
         * as [AgentService.run].
         */
        @MustBeClosed
        fun run(params: AgentRunParams): HttpResponseFor<AgentRunResponse> =
            run(params, RequestOptions.none())

        /** @see run */
        @MustBeClosed
        fun run(
            params: AgentRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentRunResponse>

        /** @see run */
        @MustBeClosed
        fun run(
            agentCompletion: AgentCompletion,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentRunResponse> =
            run(AgentRunParams.builder().agentCompletion(agentCompletion).build(), requestOptions)

        /** @see run */
        @MustBeClosed
        fun run(agentCompletion: AgentCompletion): HttpResponseFor<AgentRunResponse> =
            run(agentCompletion, RequestOptions.none())
    }
}

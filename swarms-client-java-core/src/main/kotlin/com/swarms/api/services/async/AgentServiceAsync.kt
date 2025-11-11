// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.agent.AgentCompletion
import com.swarms.api.models.agent.AgentListParams
import com.swarms.api.models.agent.AgentListResponse
import com.swarms.api.models.agent.AgentRunParams
import com.swarms.api.models.agent.AgentRunResponse
import com.swarms.api.services.async.agent.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Get all unique agent configurations that the user has created or used, without task details.
     * Allows users to reuse agent configs with new tasks.
     */
    fun list(): CompletableFuture<AgentListResponse> = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentListResponse>

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none()
    ): CompletableFuture<AgentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgentListResponse> =
        list(AgentListParams.none(), requestOptions)

    /** Run an agent with the specified task. Supports streaming when stream=True. */
    fun run(params: AgentRunParams): CompletableFuture<AgentRunResponse> =
        run(params, RequestOptions.none())

    /** @see run */
    fun run(
        params: AgentRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentRunResponse>

    /** @see run */
    fun run(
        agentCompletion: AgentCompletion,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentRunResponse> =
        run(AgentRunParams.builder().agentCompletion(agentCompletion).build(), requestOptions)

    /** @see run */
    fun run(agentCompletion: AgentCompletion): CompletableFuture<AgentRunResponse> =
        run(agentCompletion, RequestOptions.none())

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/agents/list`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgentListResponse>> =
            list(AgentListParams.none())

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentListResponse>>

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): CompletableFuture<HttpResponseFor<AgentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentListResponse>> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/agent/completions`, but is otherwise the same
         * as [AgentServiceAsync.run].
         */
        fun run(params: AgentRunParams): CompletableFuture<HttpResponseFor<AgentRunResponse>> =
            run(params, RequestOptions.none())

        /** @see run */
        fun run(
            params: AgentRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentRunResponse>>

        /** @see run */
        fun run(
            agentCompletion: AgentCompletion,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentRunResponse>> =
            run(AgentRunParams.builder().agentCompletion(agentCompletion).build(), requestOptions)

        /** @see run */
        fun run(
            agentCompletion: AgentCompletion
        ): CompletableFuture<HttpResponseFor<AgentRunResponse>> =
            run(agentCompletion, RequestOptions.none())
    }
}

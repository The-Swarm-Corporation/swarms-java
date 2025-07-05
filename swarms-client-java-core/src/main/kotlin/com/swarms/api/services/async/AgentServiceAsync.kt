// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
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

    /** Run an agent with the specified task. */
    fun run(params: AgentRunParams): CompletableFuture<AgentRunResponse> =
        run(params, RequestOptions.none())

    /** @see [run] */
    fun run(
        params: AgentRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentRunResponse>

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
         * Returns a raw HTTP response for `post /v1/agent/completions`, but is otherwise the same
         * as [AgentServiceAsync.run].
         */
        fun run(params: AgentRunParams): CompletableFuture<HttpResponseFor<AgentRunResponse>> =
            run(params, RequestOptions.none())

        /** @see [run] */
        fun run(
            params: AgentRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentRunResponse>>
    }
}

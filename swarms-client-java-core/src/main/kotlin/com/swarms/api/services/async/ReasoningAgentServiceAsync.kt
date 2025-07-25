// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionParams
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionResponse
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesParams
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReasoningAgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReasoningAgentServiceAsync

    /** Run a reasoning agent with the specified task. */
    fun createCompletion(): CompletableFuture<ReasoningAgentCreateCompletionResponse> =
        createCompletion(ReasoningAgentCreateCompletionParams.none())

    /** @see createCompletion */
    fun createCompletion(
        params: ReasoningAgentCreateCompletionParams = ReasoningAgentCreateCompletionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReasoningAgentCreateCompletionResponse>

    /** @see createCompletion */
    fun createCompletion(
        params: ReasoningAgentCreateCompletionParams = ReasoningAgentCreateCompletionParams.none()
    ): CompletableFuture<ReasoningAgentCreateCompletionResponse> =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        requestOptions: RequestOptions
    ): CompletableFuture<ReasoningAgentCreateCompletionResponse> =
        createCompletion(ReasoningAgentCreateCompletionParams.none(), requestOptions)

    /** Get the types of reasoning agents available. */
    fun listTypes(): CompletableFuture<ReasoningAgentListTypesResponse> =
        listTypes(ReasoningAgentListTypesParams.none())

    /** @see listTypes */
    fun listTypes(
        params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReasoningAgentListTypesResponse>

    /** @see listTypes */
    fun listTypes(
        params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none()
    ): CompletableFuture<ReasoningAgentListTypesResponse> = listTypes(params, RequestOptions.none())

    /** @see listTypes */
    fun listTypes(
        requestOptions: RequestOptions
    ): CompletableFuture<ReasoningAgentListTypesResponse> =
        listTypes(ReasoningAgentListTypesParams.none(), requestOptions)

    /**
     * A view of [ReasoningAgentServiceAsync] that provides access to raw HTTP responses for each
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
        ): ReasoningAgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/reasoning-agent/completions`, but is otherwise
         * the same as [ReasoningAgentServiceAsync.createCompletion].
         */
        fun createCompletion():
            CompletableFuture<HttpResponseFor<ReasoningAgentCreateCompletionResponse>> =
            createCompletion(ReasoningAgentCreateCompletionParams.none())

        /** @see createCompletion */
        fun createCompletion(
            params: ReasoningAgentCreateCompletionParams =
                ReasoningAgentCreateCompletionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReasoningAgentCreateCompletionResponse>>

        /** @see createCompletion */
        fun createCompletion(
            params: ReasoningAgentCreateCompletionParams =
                ReasoningAgentCreateCompletionParams.none()
        ): CompletableFuture<HttpResponseFor<ReasoningAgentCreateCompletionResponse>> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        fun createCompletion(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReasoningAgentCreateCompletionResponse>> =
            createCompletion(ReasoningAgentCreateCompletionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reasoning-agent/types`, but is otherwise the
         * same as [ReasoningAgentServiceAsync.listTypes].
         */
        fun listTypes(): CompletableFuture<HttpResponseFor<ReasoningAgentListTypesResponse>> =
            listTypes(ReasoningAgentListTypesParams.none())

        /** @see listTypes */
        fun listTypes(
            params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReasoningAgentListTypesResponse>>

        /** @see listTypes */
        fun listTypes(
            params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none()
        ): CompletableFuture<HttpResponseFor<ReasoningAgentListTypesResponse>> =
            listTypes(params, RequestOptions.none())

        /** @see listTypes */
        fun listTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReasoningAgentListTypesResponse>> =
            listTypes(ReasoningAgentListTypesParams.none(), requestOptions)
    }
}

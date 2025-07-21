// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionParams
import com.swarms.api.models.reasoningagents.ReasoningAgentCreateCompletionResponse
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesParams
import com.swarms.api.models.reasoningagents.ReasoningAgentListTypesResponse
import java.util.function.Consumer

interface ReasoningAgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReasoningAgentService

    /** Run a reasoning agent with the specified task. */
    fun createCompletion(): ReasoningAgentCreateCompletionResponse =
        createCompletion(ReasoningAgentCreateCompletionParams.none())

    /** @see [createCompletion] */
    fun createCompletion(
        params: ReasoningAgentCreateCompletionParams = ReasoningAgentCreateCompletionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReasoningAgentCreateCompletionResponse

    /** @see [createCompletion] */
    fun createCompletion(
        params: ReasoningAgentCreateCompletionParams = ReasoningAgentCreateCompletionParams.none()
    ): ReasoningAgentCreateCompletionResponse = createCompletion(params, RequestOptions.none())

    /** @see [createCompletion] */
    fun createCompletion(requestOptions: RequestOptions): ReasoningAgentCreateCompletionResponse =
        createCompletion(ReasoningAgentCreateCompletionParams.none(), requestOptions)

    /** Get the types of reasoning agents available. */
    fun listTypes(): ReasoningAgentListTypesResponse =
        listTypes(ReasoningAgentListTypesParams.none())

    /** @see [listTypes] */
    fun listTypes(
        params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReasoningAgentListTypesResponse

    /** @see [listTypes] */
    fun listTypes(
        params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none()
    ): ReasoningAgentListTypesResponse = listTypes(params, RequestOptions.none())

    /** @see [listTypes] */
    fun listTypes(requestOptions: RequestOptions): ReasoningAgentListTypesResponse =
        listTypes(ReasoningAgentListTypesParams.none(), requestOptions)

    /**
     * A view of [ReasoningAgentService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReasoningAgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/reasoning-agent/completions`, but is otherwise
         * the same as [ReasoningAgentService.createCompletion].
         */
        @MustBeClosed
        fun createCompletion(): HttpResponseFor<ReasoningAgentCreateCompletionResponse> =
            createCompletion(ReasoningAgentCreateCompletionParams.none())

        /** @see [createCompletion] */
        @MustBeClosed
        fun createCompletion(
            params: ReasoningAgentCreateCompletionParams =
                ReasoningAgentCreateCompletionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReasoningAgentCreateCompletionResponse>

        /** @see [createCompletion] */
        @MustBeClosed
        fun createCompletion(
            params: ReasoningAgentCreateCompletionParams =
                ReasoningAgentCreateCompletionParams.none()
        ): HttpResponseFor<ReasoningAgentCreateCompletionResponse> =
            createCompletion(params, RequestOptions.none())

        /** @see [createCompletion] */
        @MustBeClosed
        fun createCompletion(
            requestOptions: RequestOptions
        ): HttpResponseFor<ReasoningAgentCreateCompletionResponse> =
            createCompletion(ReasoningAgentCreateCompletionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reasoning-agent/types`, but is otherwise the
         * same as [ReasoningAgentService.listTypes].
         */
        @MustBeClosed
        fun listTypes(): HttpResponseFor<ReasoningAgentListTypesResponse> =
            listTypes(ReasoningAgentListTypesParams.none())

        /** @see [listTypes] */
        @MustBeClosed
        fun listTypes(
            params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReasoningAgentListTypesResponse>

        /** @see [listTypes] */
        @MustBeClosed
        fun listTypes(
            params: ReasoningAgentListTypesParams = ReasoningAgentListTypesParams.none()
        ): HttpResponseFor<ReasoningAgentListTypesResponse> =
            listTypes(params, RequestOptions.none())

        /** @see [listTypes] */
        @MustBeClosed
        fun listTypes(
            requestOptions: RequestOptions
        ): HttpResponseFor<ReasoningAgentListTypesResponse> =
            listTypes(ReasoningAgentListTypesParams.none(), requestOptions)
    }
}

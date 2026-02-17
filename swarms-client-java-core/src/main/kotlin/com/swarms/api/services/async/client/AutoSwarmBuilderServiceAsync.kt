// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionParams
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionResponse
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderListExecutionTypesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutoSwarmBuilderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoSwarmBuilderServiceAsync

    /**
     * Generate and orchestrate agent swarms autonomously using AI-powered swarm composition and
     * task decomposition.
     */
    fun createCompletion(): CompletableFuture<AutoSwarmBuilderCreateCompletionResponse> =
        createCompletion(AutoSwarmBuilderCreateCompletionParams.none())

    /** @see createCompletion */
    fun createCompletion(
        params: AutoSwarmBuilderCreateCompletionParams =
            AutoSwarmBuilderCreateCompletionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoSwarmBuilderCreateCompletionResponse>

    /** @see createCompletion */
    fun createCompletion(
        params: AutoSwarmBuilderCreateCompletionParams =
            AutoSwarmBuilderCreateCompletionParams.none()
    ): CompletableFuture<AutoSwarmBuilderCreateCompletionResponse> =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        requestOptions: RequestOptions
    ): CompletableFuture<AutoSwarmBuilderCreateCompletionResponse> =
        createCompletion(AutoSwarmBuilderCreateCompletionParams.none(), requestOptions)

    /**
     * Retrieve all available execution types and return formats for the Auto Swarm Builder
     * endpoint.
     */
    fun listExecutionTypes(): CompletableFuture<List<String>> =
        listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none())

    /** @see listExecutionTypes */
    fun listExecutionTypes(
        params: AutoSwarmBuilderListExecutionTypesParams =
            AutoSwarmBuilderListExecutionTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see listExecutionTypes */
    fun listExecutionTypes(
        params: AutoSwarmBuilderListExecutionTypesParams =
            AutoSwarmBuilderListExecutionTypesParams.none()
    ): CompletableFuture<List<String>> = listExecutionTypes(params, RequestOptions.none())

    /** @see listExecutionTypes */
    fun listExecutionTypes(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none(), requestOptions)

    /**
     * A view of [AutoSwarmBuilderServiceAsync] that provides access to raw HTTP responses for each
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
        ): AutoSwarmBuilderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/auto-swarm-builder/completions`, but is
         * otherwise the same as [AutoSwarmBuilderServiceAsync.createCompletion].
         */
        fun createCompletion():
            CompletableFuture<HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse>> =
            createCompletion(AutoSwarmBuilderCreateCompletionParams.none())

        /** @see createCompletion */
        fun createCompletion(
            params: AutoSwarmBuilderCreateCompletionParams =
                AutoSwarmBuilderCreateCompletionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse>>

        /** @see createCompletion */
        fun createCompletion(
            params: AutoSwarmBuilderCreateCompletionParams =
                AutoSwarmBuilderCreateCompletionParams.none()
        ): CompletableFuture<HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse>> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        fun createCompletion(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse>> =
            createCompletion(AutoSwarmBuilderCreateCompletionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/auto-swarm-builder/execution-types`, but is
         * otherwise the same as [AutoSwarmBuilderServiceAsync.listExecutionTypes].
         */
        fun listExecutionTypes(): CompletableFuture<HttpResponseFor<List<String>>> =
            listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none())

        /** @see listExecutionTypes */
        fun listExecutionTypes(
            params: AutoSwarmBuilderListExecutionTypesParams =
                AutoSwarmBuilderListExecutionTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see listExecutionTypes */
        fun listExecutionTypes(
            params: AutoSwarmBuilderListExecutionTypesParams =
                AutoSwarmBuilderListExecutionTypesParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            listExecutionTypes(params, RequestOptions.none())

        /** @see listExecutionTypes */
        fun listExecutionTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none(), requestOptions)
    }
}

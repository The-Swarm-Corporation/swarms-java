// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionParams
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderCreateCompletionResponse
import com.swarms.api.models.client.autoswarmbuilder.AutoSwarmBuilderListExecutionTypesParams
import java.util.function.Consumer

interface AutoSwarmBuilderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoSwarmBuilderService

    /**
     * Generate and orchestrate agent swarms autonomously using AI-powered swarm composition and
     * task decomposition.
     */
    fun createCompletion(): AutoSwarmBuilderCreateCompletionResponse =
        createCompletion(AutoSwarmBuilderCreateCompletionParams.none())

    /** @see createCompletion */
    fun createCompletion(
        params: AutoSwarmBuilderCreateCompletionParams =
            AutoSwarmBuilderCreateCompletionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoSwarmBuilderCreateCompletionResponse

    /** @see createCompletion */
    fun createCompletion(
        params: AutoSwarmBuilderCreateCompletionParams =
            AutoSwarmBuilderCreateCompletionParams.none()
    ): AutoSwarmBuilderCreateCompletionResponse = createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(requestOptions: RequestOptions): AutoSwarmBuilderCreateCompletionResponse =
        createCompletion(AutoSwarmBuilderCreateCompletionParams.none(), requestOptions)

    /**
     * Retrieve all available execution types and return formats for the Auto Swarm Builder
     * endpoint.
     */
    fun listExecutionTypes(): List<String> =
        listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none())

    /** @see listExecutionTypes */
    fun listExecutionTypes(
        params: AutoSwarmBuilderListExecutionTypesParams =
            AutoSwarmBuilderListExecutionTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see listExecutionTypes */
    fun listExecutionTypes(
        params: AutoSwarmBuilderListExecutionTypesParams =
            AutoSwarmBuilderListExecutionTypesParams.none()
    ): List<String> = listExecutionTypes(params, RequestOptions.none())

    /** @see listExecutionTypes */
    fun listExecutionTypes(requestOptions: RequestOptions): List<String> =
        listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none(), requestOptions)

    /**
     * A view of [AutoSwarmBuilderService] that provides access to raw HTTP responses for each
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
        ): AutoSwarmBuilderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/auto-swarm-builder/completions`, but is
         * otherwise the same as [AutoSwarmBuilderService.createCompletion].
         */
        @MustBeClosed
        fun createCompletion(): HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse> =
            createCompletion(AutoSwarmBuilderCreateCompletionParams.none())

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            params: AutoSwarmBuilderCreateCompletionParams =
                AutoSwarmBuilderCreateCompletionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse>

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            params: AutoSwarmBuilderCreateCompletionParams =
                AutoSwarmBuilderCreateCompletionParams.none()
        ): HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            requestOptions: RequestOptions
        ): HttpResponseFor<AutoSwarmBuilderCreateCompletionResponse> =
            createCompletion(AutoSwarmBuilderCreateCompletionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/auto-swarm-builder/execution-types`, but is
         * otherwise the same as [AutoSwarmBuilderService.listExecutionTypes].
         */
        @MustBeClosed
        fun listExecutionTypes(): HttpResponseFor<List<String>> =
            listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none())

        /** @see listExecutionTypes */
        @MustBeClosed
        fun listExecutionTypes(
            params: AutoSwarmBuilderListExecutionTypesParams =
                AutoSwarmBuilderListExecutionTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see listExecutionTypes */
        @MustBeClosed
        fun listExecutionTypes(
            params: AutoSwarmBuilderListExecutionTypesParams =
                AutoSwarmBuilderListExecutionTypesParams.none()
        ): HttpResponseFor<List<String>> = listExecutionTypes(params, RequestOptions.none())

        /** @see listExecutionTypes */
        @MustBeClosed
        fun listExecutionTypes(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            listExecutionTypes(AutoSwarmBuilderListExecutionTypesParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowParams
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GraphWorkflowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphWorkflowServiceAsync

    /**
     * Execute a graph workflow with directed agent nodes and edges. Enables complex multi-agent
     * collaboration with parallel execution, automatic compilation, and comprehensive workflow
     * orchestration.
     */
    fun executeWorkflow(): CompletableFuture<GraphWorkflowExecuteWorkflowResponse> =
        executeWorkflow(GraphWorkflowExecuteWorkflowParams.none())

    /** @see executeWorkflow */
    fun executeWorkflow(
        params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GraphWorkflowExecuteWorkflowResponse>

    /** @see executeWorkflow */
    fun executeWorkflow(
        params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none()
    ): CompletableFuture<GraphWorkflowExecuteWorkflowResponse> =
        executeWorkflow(params, RequestOptions.none())

    /** @see executeWorkflow */
    fun executeWorkflow(
        requestOptions: RequestOptions
    ): CompletableFuture<GraphWorkflowExecuteWorkflowResponse> =
        executeWorkflow(GraphWorkflowExecuteWorkflowParams.none(), requestOptions)

    /**
     * A view of [GraphWorkflowServiceAsync] that provides access to raw HTTP responses for each
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
        ): GraphWorkflowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/graph-workflow/completions`, but is otherwise
         * the same as [GraphWorkflowServiceAsync.executeWorkflow].
         */
        fun executeWorkflow():
            CompletableFuture<HttpResponseFor<GraphWorkflowExecuteWorkflowResponse>> =
            executeWorkflow(GraphWorkflowExecuteWorkflowParams.none())

        /** @see executeWorkflow */
        fun executeWorkflow(
            params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GraphWorkflowExecuteWorkflowResponse>>

        /** @see executeWorkflow */
        fun executeWorkflow(
            params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none()
        ): CompletableFuture<HttpResponseFor<GraphWorkflowExecuteWorkflowResponse>> =
            executeWorkflow(params, RequestOptions.none())

        /** @see executeWorkflow */
        fun executeWorkflow(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GraphWorkflowExecuteWorkflowResponse>> =
            executeWorkflow(GraphWorkflowExecuteWorkflowParams.none(), requestOptions)
    }
}

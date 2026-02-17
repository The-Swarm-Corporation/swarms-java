// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowParams
import com.swarms.api.models.client.graphworkflow.GraphWorkflowExecuteWorkflowResponse
import java.util.function.Consumer

interface GraphWorkflowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphWorkflowService

    /**
     * Execute a graph workflow with directed agent nodes and edges. Enables complex multi-agent
     * collaboration with parallel execution, automatic compilation, and comprehensive workflow
     * orchestration.
     */
    fun executeWorkflow(): GraphWorkflowExecuteWorkflowResponse =
        executeWorkflow(GraphWorkflowExecuteWorkflowParams.none())

    /** @see executeWorkflow */
    fun executeWorkflow(
        params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GraphWorkflowExecuteWorkflowResponse

    /** @see executeWorkflow */
    fun executeWorkflow(
        params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none()
    ): GraphWorkflowExecuteWorkflowResponse = executeWorkflow(params, RequestOptions.none())

    /** @see executeWorkflow */
    fun executeWorkflow(requestOptions: RequestOptions): GraphWorkflowExecuteWorkflowResponse =
        executeWorkflow(GraphWorkflowExecuteWorkflowParams.none(), requestOptions)

    /**
     * A view of [GraphWorkflowService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GraphWorkflowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/graph-workflow/completions`, but is otherwise
         * the same as [GraphWorkflowService.executeWorkflow].
         */
        @MustBeClosed
        fun executeWorkflow(): HttpResponseFor<GraphWorkflowExecuteWorkflowResponse> =
            executeWorkflow(GraphWorkflowExecuteWorkflowParams.none())

        /** @see executeWorkflow */
        @MustBeClosed
        fun executeWorkflow(
            params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GraphWorkflowExecuteWorkflowResponse>

        /** @see executeWorkflow */
        @MustBeClosed
        fun executeWorkflow(
            params: GraphWorkflowExecuteWorkflowParams = GraphWorkflowExecuteWorkflowParams.none()
        ): HttpResponseFor<GraphWorkflowExecuteWorkflowResponse> =
            executeWorkflow(params, RequestOptions.none())

        /** @see executeWorkflow */
        @MustBeClosed
        fun executeWorkflow(
            requestOptions: RequestOptions
        ): HttpResponseFor<GraphWorkflowExecuteWorkflowResponse> =
            executeWorkflow(GraphWorkflowExecuteWorkflowParams.none(), requestOptions)
    }
}

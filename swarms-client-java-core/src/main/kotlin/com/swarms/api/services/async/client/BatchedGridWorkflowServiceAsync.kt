// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.client.batchedgridworkflow.BatchedGridWorkflowCompleteWorkflowParams
import com.swarms.api.models.client.batchedgridworkflow.BatchedGridWorkflowCompleteWorkflowResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchedGridWorkflowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchedGridWorkflowServiceAsync

    /**
     * Complete a batched grid workflow with the specified input data. Enables you to run a grid
     * workflow with multiple agents and tasks in a single request.
     */
    fun completeWorkflow(): CompletableFuture<BatchedGridWorkflowCompleteWorkflowResponse> =
        completeWorkflow(BatchedGridWorkflowCompleteWorkflowParams.none())

    /** @see completeWorkflow */
    fun completeWorkflow(
        params: BatchedGridWorkflowCompleteWorkflowParams =
            BatchedGridWorkflowCompleteWorkflowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchedGridWorkflowCompleteWorkflowResponse>

    /** @see completeWorkflow */
    fun completeWorkflow(
        params: BatchedGridWorkflowCompleteWorkflowParams =
            BatchedGridWorkflowCompleteWorkflowParams.none()
    ): CompletableFuture<BatchedGridWorkflowCompleteWorkflowResponse> =
        completeWorkflow(params, RequestOptions.none())

    /** @see completeWorkflow */
    fun completeWorkflow(
        requestOptions: RequestOptions
    ): CompletableFuture<BatchedGridWorkflowCompleteWorkflowResponse> =
        completeWorkflow(BatchedGridWorkflowCompleteWorkflowParams.none(), requestOptions)

    /**
     * A view of [BatchedGridWorkflowServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchedGridWorkflowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/batched-grid-workflow/completions`, but is
         * otherwise the same as [BatchedGridWorkflowServiceAsync.completeWorkflow].
         */
        fun completeWorkflow():
            CompletableFuture<HttpResponseFor<BatchedGridWorkflowCompleteWorkflowResponse>> =
            completeWorkflow(BatchedGridWorkflowCompleteWorkflowParams.none())

        /** @see completeWorkflow */
        fun completeWorkflow(
            params: BatchedGridWorkflowCompleteWorkflowParams =
                BatchedGridWorkflowCompleteWorkflowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchedGridWorkflowCompleteWorkflowResponse>>

        /** @see completeWorkflow */
        fun completeWorkflow(
            params: BatchedGridWorkflowCompleteWorkflowParams =
                BatchedGridWorkflowCompleteWorkflowParams.none()
        ): CompletableFuture<HttpResponseFor<BatchedGridWorkflowCompleteWorkflowResponse>> =
            completeWorkflow(params, RequestOptions.none())

        /** @see completeWorkflow */
        fun completeWorkflow(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BatchedGridWorkflowCompleteWorkflowResponse>> =
            completeWorkflow(BatchedGridWorkflowCompleteWorkflowParams.none(), requestOptions)
    }
}

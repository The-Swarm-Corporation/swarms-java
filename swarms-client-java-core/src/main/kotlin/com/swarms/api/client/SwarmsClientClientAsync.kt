// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.ClientGetRootParams
import com.swarms.api.models.ClientGetRootResponse
import com.swarms.api.services.async.AgentServiceAsync
import com.swarms.api.services.async.ClientServiceAsync
import com.swarms.api.services.async.HealthServiceAsync
import com.swarms.api.services.async.ModelServiceAsync
import com.swarms.api.services.async.ReasoningAgentServiceAsync
import com.swarms.api.services.async.SwarmServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * A client for interacting with the Swarms Client REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface SwarmsClientClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): SwarmsClientClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmsClientClientAsync

    fun health(): HealthServiceAsync

    fun agent(): AgentServiceAsync

    fun models(): ModelServiceAsync

    fun swarms(): SwarmServiceAsync

    fun reasoningAgents(): ReasoningAgentServiceAsync

    fun client(): ClientServiceAsync

    /** Root */
    fun getRoot(): CompletableFuture<ClientGetRootResponse> = getRoot(ClientGetRootParams.none())

    /** @see [getRoot] */
    fun getRoot(
        params: ClientGetRootParams = ClientGetRootParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClientGetRootResponse>

    /** @see [getRoot] */
    fun getRoot(
        params: ClientGetRootParams = ClientGetRootParams.none()
    ): CompletableFuture<ClientGetRootResponse> = getRoot(params, RequestOptions.none())

    /** @see [getRoot] */
    fun getRoot(requestOptions: RequestOptions): CompletableFuture<ClientGetRootResponse> =
        getRoot(ClientGetRootParams.none(), requestOptions)

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [SwarmsClientClientAsync] that provides access to raw HTTP responses for each
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
        ): SwarmsClientClientAsync.WithRawResponse

        fun health(): HealthServiceAsync.WithRawResponse

        fun agent(): AgentServiceAsync.WithRawResponse

        fun models(): ModelServiceAsync.WithRawResponse

        fun swarms(): SwarmServiceAsync.WithRawResponse

        fun reasoningAgents(): ReasoningAgentServiceAsync.WithRawResponse

        fun client(): ClientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /`, but is otherwise the same as
         * [SwarmsClientClientAsync.getRoot].
         */
        fun getRoot(): CompletableFuture<HttpResponseFor<ClientGetRootResponse>> =
            getRoot(ClientGetRootParams.none())

        /** @see [getRoot] */
        fun getRoot(
            params: ClientGetRootParams = ClientGetRootParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClientGetRootResponse>>

        /** @see [getRoot] */
        fun getRoot(
            params: ClientGetRootParams = ClientGetRootParams.none()
        ): CompletableFuture<HttpResponseFor<ClientGetRootResponse>> =
            getRoot(params, RequestOptions.none())

        /** @see [getRoot] */
        fun getRoot(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClientGetRootResponse>> =
            getRoot(ClientGetRootParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.models.ClientGetRootParams
import com.swarms.api.models.ClientGetRootResponse
import com.swarms.api.services.blocking.AgentService
import com.swarms.api.services.blocking.ClientService
import com.swarms.api.services.blocking.HealthService
import com.swarms.api.services.blocking.ModelService
import com.swarms.api.services.blocking.SwarmService
import java.util.function.Consumer

/**
 * A client for interacting with the Swarms Client REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface SwarmsClientClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): SwarmsClientClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmsClientClient

    fun health(): HealthService

    fun agent(): AgentService

    fun models(): ModelService

    fun swarms(): SwarmService

    fun client(): ClientService

    /** Root */
    fun getRoot(): ClientGetRootResponse = getRoot(ClientGetRootParams.none())

    /** @see [getRoot] */
    fun getRoot(
        params: ClientGetRootParams = ClientGetRootParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClientGetRootResponse

    /** @see [getRoot] */
    fun getRoot(params: ClientGetRootParams = ClientGetRootParams.none()): ClientGetRootResponse =
        getRoot(params, RequestOptions.none())

    /** @see [getRoot] */
    fun getRoot(requestOptions: RequestOptions): ClientGetRootResponse =
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
     * A view of [SwarmsClientClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SwarmsClientClient.WithRawResponse

        fun health(): HealthService.WithRawResponse

        fun agent(): AgentService.WithRawResponse

        fun models(): ModelService.WithRawResponse

        fun swarms(): SwarmService.WithRawResponse

        fun client(): ClientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /`, but is otherwise the same as
         * [SwarmsClientClient.getRoot].
         */
        @MustBeClosed
        fun getRoot(): HttpResponseFor<ClientGetRootResponse> = getRoot(ClientGetRootParams.none())

        /** @see [getRoot] */
        @MustBeClosed
        fun getRoot(
            params: ClientGetRootParams = ClientGetRootParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClientGetRootResponse>

        /** @see [getRoot] */
        @MustBeClosed
        fun getRoot(
            params: ClientGetRootParams = ClientGetRootParams.none()
        ): HttpResponseFor<ClientGetRootResponse> = getRoot(params, RequestOptions.none())

        /** @see [getRoot] */
        @MustBeClosed
        fun getRoot(requestOptions: RequestOptions): HttpResponseFor<ClientGetRootResponse> =
            getRoot(ClientGetRootParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.async

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.async.client.RateServiceAsync
import java.util.function.Consumer

interface ClientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientServiceAsync

    fun rate(): RateServiceAsync

    /**
     * A view of [ClientServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClientServiceAsync.WithRawResponse

        fun rate(): RateServiceAsync.WithRawResponse
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.services.blocking

import com.swarms.api.core.ClientOptions
import com.swarms.api.services.blocking.client.RateService
import java.util.function.Consumer

interface ClientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientService

    fun rate(): RateService

    /** A view of [ClientService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClientService.WithRawResponse

        fun rate(): RateService.WithRawResponse
    }
}

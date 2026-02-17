// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.client

import com.swarms.api.core.ClientOptions
import com.swarms.api.core.RequestOptions
import com.swarms.api.core.getPackageVersion
import com.swarms.api.core.handlers.errorBodyHandler
import com.swarms.api.core.handlers.errorHandler
import com.swarms.api.core.handlers.jsonHandler
import com.swarms.api.core.http.HttpMethod
import com.swarms.api.core.http.HttpRequest
import com.swarms.api.core.http.HttpResponse
import com.swarms.api.core.http.HttpResponse.Handler
import com.swarms.api.core.http.HttpResponseFor
import com.swarms.api.core.http.parseable
import com.swarms.api.core.prepare
import com.swarms.api.models.ClientGetRootParams
import com.swarms.api.models.ClientGetRootResponse
import com.swarms.api.services.blocking.AgentService
import com.swarms.api.services.blocking.AgentServiceImpl
import com.swarms.api.services.blocking.ClientService
import com.swarms.api.services.blocking.ClientServiceImpl
import com.swarms.api.services.blocking.HealthService
import com.swarms.api.services.blocking.HealthServiceImpl
import com.swarms.api.services.blocking.ModelService
import com.swarms.api.services.blocking.ModelServiceImpl
import com.swarms.api.services.blocking.ReasoningAgentService
import com.swarms.api.services.blocking.ReasoningAgentServiceImpl
import com.swarms.api.services.blocking.SwarmService
import com.swarms.api.services.blocking.SwarmServiceImpl
import java.util.function.Consumer

class SwarmsClientClientImpl(private val clientOptions: ClientOptions) : SwarmsClientClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: SwarmsClientClientAsync by lazy {
        SwarmsClientClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: SwarmsClientClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val health: HealthService by lazy { HealthServiceImpl(clientOptionsWithUserAgent) }

    private val agent: AgentService by lazy { AgentServiceImpl(clientOptionsWithUserAgent) }

    private val models: ModelService by lazy { ModelServiceImpl(clientOptionsWithUserAgent) }

    private val swarms: SwarmService by lazy { SwarmServiceImpl(clientOptionsWithUserAgent) }

    private val reasoningAgents: ReasoningAgentService by lazy {
        ReasoningAgentServiceImpl(clientOptionsWithUserAgent)
    }

    private val client: ClientService by lazy { ClientServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): SwarmsClientClientAsync = async

    override fun withRawResponse(): SwarmsClientClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwarmsClientClient =
        SwarmsClientClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun health(): HealthService = health

    override fun agent(): AgentService = agent

    override fun models(): ModelService = models

    override fun swarms(): SwarmService = swarms

    override fun reasoningAgents(): ReasoningAgentService = reasoningAgents

    override fun client(): ClientService = client

    override fun getRoot(
        params: ClientGetRootParams,
        requestOptions: RequestOptions,
    ): ClientGetRootResponse =
        // get /
        withRawResponse().getRoot(params, requestOptions).parse()

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SwarmsClientClient.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val health: HealthService.WithRawResponse by lazy {
            HealthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val agent: AgentService.WithRawResponse by lazy {
            AgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val models: ModelService.WithRawResponse by lazy {
            ModelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val swarms: SwarmService.WithRawResponse by lazy {
            SwarmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reasoningAgents: ReasoningAgentService.WithRawResponse by lazy {
            ReasoningAgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val client: ClientService.WithRawResponse by lazy {
            ClientServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SwarmsClientClient.WithRawResponse =
            SwarmsClientClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun health(): HealthService.WithRawResponse = health

        override fun agent(): AgentService.WithRawResponse = agent

        override fun models(): ModelService.WithRawResponse = models

        override fun swarms(): SwarmService.WithRawResponse = swarms

        override fun reasoningAgents(): ReasoningAgentService.WithRawResponse = reasoningAgents

        override fun client(): ClientService.WithRawResponse = client

        private val getRootHandler: Handler<ClientGetRootResponse> =
            jsonHandler<ClientGetRootResponse>(clientOptions.jsonMapper)

        override fun getRoot(
            params: ClientGetRootParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClientGetRootResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRootHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

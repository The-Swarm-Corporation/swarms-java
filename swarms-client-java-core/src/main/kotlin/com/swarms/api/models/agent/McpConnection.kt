// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class McpConnection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorizationToken: JsonField<String>,
    private val headers: JsonField<Headers>,
    private val timeout: JsonField<Long>,
    private val toolConfigurations: JsonField<ToolConfigurations>,
    private val transport: JsonField<String>,
    private val type: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorization_token")
        @ExcludeMissing
        authorizationToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tool_configurations")
        @ExcludeMissing
        toolConfigurations: JsonField<ToolConfigurations> = JsonMissing.of(),
        @JsonProperty("transport") @ExcludeMissing transport: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        authorizationToken,
        headers,
        timeout,
        toolConfigurations,
        transport,
        type,
        url,
        mutableMapOf(),
    )

    /**
     * Authentication token for accessing the MCP server
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun authorizationToken(): Optional<String> =
        authorizationToken.getOptional("authorization_token")

    /**
     * Headers to send to the MCP server
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = headers.getOptional("headers")

    /**
     * Timeout for the MCP server
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timeout(): Optional<Long> = timeout.getOptional("timeout")

    /**
     * Dictionary containing configuration settings for MCP tools
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun toolConfigurations(): Optional<ToolConfigurations> =
        toolConfigurations.getOptional("tool_configurations")

    /**
     * The transport protocol to use for the MCP server
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transport(): Optional<String> = transport.getOptional("transport")

    /**
     * The type of connection, defaults to 'mcp'
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * The URL endpoint for the MCP server
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [authorizationToken].
     *
     * Unlike [authorizationToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorization_token")
    @ExcludeMissing
    fun _authorizationToken(): JsonField<String> = authorizationToken

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

    /**
     * Returns the raw JSON value of [toolConfigurations].
     *
     * Unlike [toolConfigurations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tool_configurations")
    @ExcludeMissing
    fun _toolConfigurations(): JsonField<ToolConfigurations> = toolConfigurations

    /**
     * Returns the raw JSON value of [transport].
     *
     * Unlike [transport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transport") @ExcludeMissing fun _transport(): JsonField<String> = transport

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [McpConnection]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [McpConnection]. */
    class Builder internal constructor() {

        private var authorizationToken: JsonField<String> = JsonMissing.of()
        private var headers: JsonField<Headers> = JsonMissing.of()
        private var timeout: JsonField<Long> = JsonMissing.of()
        private var toolConfigurations: JsonField<ToolConfigurations> = JsonMissing.of()
        private var transport: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mcpConnection: McpConnection) = apply {
            authorizationToken = mcpConnection.authorizationToken
            headers = mcpConnection.headers
            timeout = mcpConnection.timeout
            toolConfigurations = mcpConnection.toolConfigurations
            transport = mcpConnection.transport
            type = mcpConnection.type
            url = mcpConnection.url
            additionalProperties = mcpConnection.additionalProperties.toMutableMap()
        }

        /** Authentication token for accessing the MCP server */
        fun authorizationToken(authorizationToken: String?) =
            authorizationToken(JsonField.ofNullable(authorizationToken))

        /**
         * Alias for calling [Builder.authorizationToken] with `authorizationToken.orElse(null)`.
         */
        fun authorizationToken(authorizationToken: Optional<String>) =
            authorizationToken(authorizationToken.getOrNull())

        /**
         * Sets [Builder.authorizationToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizationToken(authorizationToken: JsonField<String>) = apply {
            this.authorizationToken = authorizationToken
        }

        /** Headers to send to the MCP server */
        fun headers(headers: Headers?) = headers(JsonField.ofNullable(headers))

        /** Alias for calling [Builder.headers] with `headers.orElse(null)`. */
        fun headers(headers: Optional<Headers>) = headers(headers.getOrNull())

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /** Timeout for the MCP server */
        fun timeout(timeout: Long?) = timeout(JsonField.ofNullable(timeout))

        /**
         * Alias for [Builder.timeout].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeout(timeout: Long) = timeout(timeout as Long?)

        /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
        fun timeout(timeout: Optional<Long>) = timeout(timeout.getOrNull())

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

        /** Dictionary containing configuration settings for MCP tools */
        fun toolConfigurations(toolConfigurations: ToolConfigurations?) =
            toolConfigurations(JsonField.ofNullable(toolConfigurations))

        /**
         * Alias for calling [Builder.toolConfigurations] with `toolConfigurations.orElse(null)`.
         */
        fun toolConfigurations(toolConfigurations: Optional<ToolConfigurations>) =
            toolConfigurations(toolConfigurations.getOrNull())

        /**
         * Sets [Builder.toolConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolConfigurations] with a well-typed
         * [ToolConfigurations] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun toolConfigurations(toolConfigurations: JsonField<ToolConfigurations>) = apply {
            this.toolConfigurations = toolConfigurations
        }

        /** The transport protocol to use for the MCP server */
        fun transport(transport: String?) = transport(JsonField.ofNullable(transport))

        /** Alias for calling [Builder.transport] with `transport.orElse(null)`. */
        fun transport(transport: Optional<String>) = transport(transport.getOrNull())

        /**
         * Sets [Builder.transport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transport] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transport(transport: JsonField<String>) = apply { this.transport = transport }

        /** The type of connection, defaults to 'mcp' */
        fun type(type: String?) = type(JsonField.ofNullable(type))

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<String>) = type(type.getOrNull())

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** The URL endpoint for the MCP server */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** Alias for calling [Builder.url] with `url.orElse(null)`. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [McpConnection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): McpConnection =
            McpConnection(
                authorizationToken,
                headers,
                timeout,
                toolConfigurations,
                transport,
                type,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): McpConnection = apply {
        if (validated) {
            return@apply
        }

        authorizationToken()
        headers().ifPresent { it.validate() }
        timeout()
        toolConfigurations().ifPresent { it.validate() }
        transport()
        type()
        url()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: SwarmsClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (authorizationToken.asKnown().isPresent) 1 else 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timeout.asKnown().isPresent) 1 else 0) +
            (toolConfigurations.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transport.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    /** Headers to send to the MCP server */
    class Headers
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Headers = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SwarmsClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    /** Dictionary containing configuration settings for MCP tools */
    class ToolConfigurations
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ToolConfigurations]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ToolConfigurations]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toolConfigurations: ToolConfigurations) = apply {
                additionalProperties = toolConfigurations.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ToolConfigurations].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ToolConfigurations = ToolConfigurations(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ToolConfigurations = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SwarmsClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolConfigurations && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ToolConfigurations{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is McpConnection &&
            authorizationToken == other.authorizationToken &&
            headers == other.headers &&
            timeout == other.timeout &&
            toolConfigurations == other.toolConfigurations &&
            transport == other.transport &&
            type == other.type &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authorizationToken,
            headers,
            timeout,
            toolConfigurations,
            transport,
            type,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "McpConnection{authorizationToken=$authorizationToken, headers=$headers, timeout=$timeout, toolConfigurations=$toolConfigurations, transport=$transport, type=$type, url=$url, additionalProperties=$additionalProperties}"
}

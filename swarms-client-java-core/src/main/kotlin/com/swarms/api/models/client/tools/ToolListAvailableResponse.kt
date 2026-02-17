// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.checkKnown
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ToolListAvailableResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val status: JsonField<String>,
    private val tools: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<String>> = JsonMissing.of(),
    ) : this(status, tools, mutableMapOf())

    /**
     * The status of the available tools.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * The list of available tools.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tools(): Optional<List<String>> = tools.getOptional("tools")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<String>> = tools

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

        /**
         * Returns a mutable builder for constructing an instance of [ToolListAvailableResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolListAvailableResponse]. */
    class Builder internal constructor() {

        private var status: JsonField<String> = JsonMissing.of()
        private var tools: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolListAvailableResponse: ToolListAvailableResponse) = apply {
            status = toolListAvailableResponse.status
            tools = toolListAvailableResponse.tools.map { it.toMutableList() }
            additionalProperties = toolListAvailableResponse.additionalProperties.toMutableMap()
        }

        /** The status of the available tools. */
        fun status(status: String?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** The list of available tools. */
        fun tools(tools: List<String>?) = tools(JsonField.ofNullable(tools))

        /** Alias for calling [Builder.tools] with `tools.orElse(null)`. */
        fun tools(tools: Optional<List<String>>) = tools(tools.getOrNull())

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<String>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: String) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
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
         * Returns an immutable instance of [ToolListAvailableResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ToolListAvailableResponse =
            ToolListAvailableResponse(
                status,
                (tools ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ToolListAvailableResponse = apply {
        if (validated) {
            return@apply
        }

        status()
        tools()
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
        (if (status.asKnown().isPresent) 1 else 0) + (tools.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolListAvailableResponse &&
            status == other.status &&
            tools == other.tools &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(status, tools, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolListAvailableResponse{status=$status, tools=$tools, additionalProperties=$additionalProperties}"
}

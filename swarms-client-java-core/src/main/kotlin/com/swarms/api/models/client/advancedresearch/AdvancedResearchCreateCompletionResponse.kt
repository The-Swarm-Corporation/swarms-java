// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.advancedresearch

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.checkRequired
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AdvancedResearchCreateCompletionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val charactersPerSource: JsonField<Long>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val outputs: JsonValue,
    private val sources: JsonField<Long>,
    private val timestamp: JsonField<String>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("characters_per_source")
        @ExcludeMissing
        charactersPerSource: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
        @JsonProperty("sources") @ExcludeMissing sources: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
    ) : this(
        id,
        charactersPerSource,
        description,
        name,
        outputs,
        sources,
        timestamp,
        usage,
        mutableMapOf(),
    )

    /**
     * The id of the advanced research session
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The number of characters per source used for the advanced research session
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun charactersPerSource(): Optional<Long> =
        charactersPerSource.getOptional("characters_per_source")

    /**
     * The description of the advanced research session
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The name of the advanced research session
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The outputs of the advanced research session
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = advancedResearchCreateCompletionResponse.outputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
     * The number of sources used for the advanced research session
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sources(): Optional<Long> = sources.getOptional("sources")

    /**
     * The timestamp of the advanced research session
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

    /**
     * The usage of the advanced research session
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun usage(): Optional<Usage> = usage.getOptional("usage")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [charactersPerSource].
     *
     * Unlike [charactersPerSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("characters_per_source")
    @ExcludeMissing
    fun _charactersPerSource(): JsonField<Long> = charactersPerSource

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sources].
     *
     * Unlike [sources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sources") @ExcludeMissing fun _sources(): JsonField<Long> = sources

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
         * Returns a mutable builder for constructing an instance of
         * [AdvancedResearchCreateCompletionResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .charactersPerSource()
         * .description()
         * .name()
         * .outputs()
         * .sources()
         * .timestamp()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdvancedResearchCreateCompletionResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var charactersPerSource: JsonField<Long>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var outputs: JsonValue? = null
        private var sources: JsonField<Long>? = null
        private var timestamp: JsonField<String>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            advancedResearchCreateCompletionResponse: AdvancedResearchCreateCompletionResponse
        ) = apply {
            id = advancedResearchCreateCompletionResponse.id
            charactersPerSource = advancedResearchCreateCompletionResponse.charactersPerSource
            description = advancedResearchCreateCompletionResponse.description
            name = advancedResearchCreateCompletionResponse.name
            outputs = advancedResearchCreateCompletionResponse.outputs
            sources = advancedResearchCreateCompletionResponse.sources
            timestamp = advancedResearchCreateCompletionResponse.timestamp
            usage = advancedResearchCreateCompletionResponse.usage
            additionalProperties =
                advancedResearchCreateCompletionResponse.additionalProperties.toMutableMap()
        }

        /** The id of the advanced research session */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The number of characters per source used for the advanced research session */
        fun charactersPerSource(charactersPerSource: Long?) =
            charactersPerSource(JsonField.ofNullable(charactersPerSource))

        /**
         * Alias for [Builder.charactersPerSource].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun charactersPerSource(charactersPerSource: Long) =
            charactersPerSource(charactersPerSource as Long?)

        /**
         * Alias for calling [Builder.charactersPerSource] with `charactersPerSource.orElse(null)`.
         */
        fun charactersPerSource(charactersPerSource: Optional<Long>) =
            charactersPerSource(charactersPerSource.getOrNull())

        /**
         * Sets [Builder.charactersPerSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charactersPerSource] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun charactersPerSource(charactersPerSource: JsonField<Long>) = apply {
            this.charactersPerSource = charactersPerSource
        }

        /** The description of the advanced research session */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The name of the advanced research session */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The outputs of the advanced research session */
        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        /** The number of sources used for the advanced research session */
        fun sources(sources: Long?) = sources(JsonField.ofNullable(sources))

        /**
         * Alias for [Builder.sources].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sources(sources: Long) = sources(sources as Long?)

        /** Alias for calling [Builder.sources] with `sources.orElse(null)`. */
        fun sources(sources: Optional<Long>) = sources(sources.getOrNull())

        /**
         * Sets [Builder.sources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sources] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sources(sources: JsonField<Long>) = apply { this.sources = sources }

        /** The timestamp of the advanced research session */
        fun timestamp(timestamp: String?) = timestamp(JsonField.ofNullable(timestamp))

        /** Alias for calling [Builder.timestamp] with `timestamp.orElse(null)`. */
        fun timestamp(timestamp: Optional<String>) = timestamp(timestamp.getOrNull())

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

        /** The usage of the advanced research session */
        fun usage(usage: Usage?) = usage(JsonField.ofNullable(usage))

        /** Alias for calling [Builder.usage] with `usage.orElse(null)`. */
        fun usage(usage: Optional<Usage>) = usage(usage.getOrNull())

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [AdvancedResearchCreateCompletionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .charactersPerSource()
         * .description()
         * .name()
         * .outputs()
         * .sources()
         * .timestamp()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AdvancedResearchCreateCompletionResponse =
            AdvancedResearchCreateCompletionResponse(
                checkRequired("id", id),
                checkRequired("charactersPerSource", charactersPerSource),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("outputs", outputs),
                checkRequired("sources", sources),
                checkRequired("timestamp", timestamp),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AdvancedResearchCreateCompletionResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        charactersPerSource()
        description()
        name()
        sources()
        timestamp()
        usage().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (charactersPerSource.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (sources.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    /** The usage of the advanced research session */
    class Usage
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

            /** Returns a mutable builder for constructing an instance of [Usage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                additionalProperties = usage.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Usage = Usage(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
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

            return other is Usage && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Usage{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdvancedResearchCreateCompletionResponse &&
            id == other.id &&
            charactersPerSource == other.charactersPerSource &&
            description == other.description &&
            name == other.name &&
            outputs == other.outputs &&
            sources == other.sources &&
            timestamp == other.timestamp &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            charactersPerSource,
            description,
            name,
            outputs,
            sources,
            timestamp,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdvancedResearchCreateCompletionResponse{id=$id, charactersPerSource=$charactersPerSource, description=$description, name=$name, outputs=$outputs, sources=$sources, timestamp=$timestamp, usage=$usage, additionalProperties=$additionalProperties}"
}

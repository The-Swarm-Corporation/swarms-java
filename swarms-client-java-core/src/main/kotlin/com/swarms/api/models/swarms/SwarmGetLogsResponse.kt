// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SwarmGetLogsResponse
private constructor(
    private val count: JsonField<Long>,
    private val logs: JsonValue,
    private val status: JsonField<String>,
    private val timestamp: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("logs") @ExcludeMissing logs: JsonValue = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
    ) : this(count, logs, status, timestamp, mutableMapOf())

    /**
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun count(): Optional<Long> = count.getOptional("count")

    @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonValue = logs

    /**
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

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

        /** Returns a mutable builder for constructing an instance of [SwarmGetLogsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SwarmGetLogsResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Long> = JsonMissing.of()
        private var logs: JsonValue = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var timestamp: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(swarmGetLogsResponse: SwarmGetLogsResponse) = apply {
            count = swarmGetLogsResponse.count
            logs = swarmGetLogsResponse.logs
            status = swarmGetLogsResponse.status
            timestamp = swarmGetLogsResponse.timestamp
            additionalProperties = swarmGetLogsResponse.additionalProperties.toMutableMap()
        }

        fun count(count: Long?) = count(JsonField.ofNullable(count))

        /**
         * Alias for [Builder.count].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun count(count: Long) = count(count as Long?)

        /** Alias for calling [Builder.count] with `count.orElse(null)`. */
        fun count(count: Optional<Long>) = count(count.getOrNull())

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        fun logs(logs: JsonValue) = apply { this.logs = logs }

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
         * Returns an immutable instance of [SwarmGetLogsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SwarmGetLogsResponse =
            SwarmGetLogsResponse(
                count,
                logs,
                status,
                timestamp,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SwarmGetLogsResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        status()
        timestamp()
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SwarmGetLogsResponse && count == other.count && logs == other.logs && status == other.status && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(count, logs, status, timestamp, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SwarmGetLogsResponse{count=$count, logs=$logs, status=$status, timestamp=$timestamp, additionalProperties=$additionalProperties}"
}

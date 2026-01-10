// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.rate

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.checkRequired
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects

class RateLimitWindow
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val exceeded: JsonField<Boolean>,
    private val limit: JsonField<Long>,
    private val remaining: JsonField<Long>,
    private val resetTime: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("exceeded") @ExcludeMissing exceeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("remaining") @ExcludeMissing remaining: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reset_time") @ExcludeMissing resetTime: JsonField<String> = JsonMissing.of(),
    ) : this(count, exceeded, limit, remaining, resetTime, mutableMapOf())

    /**
     * The number of requests made in this time window.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Long = count.getRequired("count")

    /**
     * Whether the rate limit has been exceeded for this time window.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exceeded(): Boolean = exceeded.getRequired("exceeded")

    /**
     * The maximum number of requests allowed in this time window.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * The number of requests remaining before hitting the limit.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remaining(): Long = remaining.getRequired("remaining")

    /**
     * ISO timestamp when the rate limit will reset.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resetTime(): String = resetTime.getRequired("reset_time")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [exceeded].
     *
     * Unlike [exceeded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exceeded") @ExcludeMissing fun _exceeded(): JsonField<Boolean> = exceeded

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [remaining].
     *
     * Unlike [remaining], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remaining") @ExcludeMissing fun _remaining(): JsonField<Long> = remaining

    /**
     * Returns the raw JSON value of [resetTime].
     *
     * Unlike [resetTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reset_time") @ExcludeMissing fun _resetTime(): JsonField<String> = resetTime

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
         * Returns a mutable builder for constructing an instance of [RateLimitWindow].
         *
         * The following fields are required:
         * ```java
         * .count()
         * .exceeded()
         * .limit()
         * .remaining()
         * .resetTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RateLimitWindow]. */
    class Builder internal constructor() {

        private var count: JsonField<Long>? = null
        private var exceeded: JsonField<Boolean>? = null
        private var limit: JsonField<Long>? = null
        private var remaining: JsonField<Long>? = null
        private var resetTime: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rateLimitWindow: RateLimitWindow) = apply {
            count = rateLimitWindow.count
            exceeded = rateLimitWindow.exceeded
            limit = rateLimitWindow.limit
            remaining = rateLimitWindow.remaining
            resetTime = rateLimitWindow.resetTime
            additionalProperties = rateLimitWindow.additionalProperties.toMutableMap()
        }

        /** The number of requests made in this time window. */
        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /** Whether the rate limit has been exceeded for this time window. */
        fun exceeded(exceeded: Boolean) = exceeded(JsonField.of(exceeded))

        /**
         * Sets [Builder.exceeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exceeded] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exceeded(exceeded: JsonField<Boolean>) = apply { this.exceeded = exceeded }

        /** The maximum number of requests allowed in this time window. */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** The number of requests remaining before hitting the limit. */
        fun remaining(remaining: Long) = remaining(JsonField.of(remaining))

        /**
         * Sets [Builder.remaining] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remaining] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remaining(remaining: JsonField<Long>) = apply { this.remaining = remaining }

        /** ISO timestamp when the rate limit will reset. */
        fun resetTime(resetTime: String) = resetTime(JsonField.of(resetTime))

        /**
         * Sets [Builder.resetTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resetTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resetTime(resetTime: JsonField<String>) = apply { this.resetTime = resetTime }

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
         * Returns an immutable instance of [RateLimitWindow].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .count()
         * .exceeded()
         * .limit()
         * .remaining()
         * .resetTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RateLimitWindow =
            RateLimitWindow(
                checkRequired("count", count),
                checkRequired("exceeded", exceeded),
                checkRequired("limit", limit),
                checkRequired("remaining", remaining),
                checkRequired("resetTime", resetTime),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RateLimitWindow = apply {
        if (validated) {
            return@apply
        }

        count()
        exceeded()
        limit()
        remaining()
        resetTime()
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
            (if (exceeded.asKnown().isPresent) 1 else 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (remaining.asKnown().isPresent) 1 else 0) +
            (if (resetTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RateLimitWindow &&
            count == other.count &&
            exceeded == other.exceeded &&
            limit == other.limit &&
            remaining == other.remaining &&
            resetTime == other.resetTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(count, exceeded, limit, remaining, resetTime, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RateLimitWindow{count=$count, exceeded=$exceeded, limit=$limit, remaining=$remaining, resetTime=$resetTime, additionalProperties=$additionalProperties}"
}

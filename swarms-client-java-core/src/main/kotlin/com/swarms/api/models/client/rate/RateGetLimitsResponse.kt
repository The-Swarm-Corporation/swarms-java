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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RateGetLimitsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limits: JsonField<Limits>,
    private val rateLimits: JsonField<RateLimits>,
    private val tier: JsonField<String>,
    private val timestamp: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limits") @ExcludeMissing limits: JsonField<Limits> = JsonMissing.of(),
        @JsonProperty("rate_limits")
        @ExcludeMissing
        rateLimits: JsonField<RateLimits> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(limits, rateLimits, tier, timestamp, success, mutableMapOf())

    /**
     * The configured rate limits based on the user's subscription tier.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun limits(): Optional<Limits> = limits.getOptional("limits")

    /**
     * Current rate limit usage information for different time windows.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rateLimits(): Optional<RateLimits> = rateLimits.getOptional("rate_limits")

    /**
     * The user's current subscription tier (free or premium).
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tier(): Optional<String> = tier.getOptional("tier")

    /**
     * ISO timestamp when the rate limits information was retrieved.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

    /**
     * Indicates whether the rate limits request was successful.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [limits].
     *
     * Unlike [limits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limits") @ExcludeMissing fun _limits(): JsonField<Limits> = limits

    /**
     * Returns the raw JSON value of [rateLimits].
     *
     * Unlike [rateLimits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate_limits")
    @ExcludeMissing
    fun _rateLimits(): JsonField<RateLimits> = rateLimits

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<String> = tier

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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
         * Returns a mutable builder for constructing an instance of [RateGetLimitsResponse].
         *
         * The following fields are required:
         * ```java
         * .limits()
         * .rateLimits()
         * .tier()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RateGetLimitsResponse]. */
    class Builder internal constructor() {

        private var limits: JsonField<Limits>? = null
        private var rateLimits: JsonField<RateLimits>? = null
        private var tier: JsonField<String>? = null
        private var timestamp: JsonField<String>? = null
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rateGetLimitsResponse: RateGetLimitsResponse) = apply {
            limits = rateGetLimitsResponse.limits
            rateLimits = rateGetLimitsResponse.rateLimits
            tier = rateGetLimitsResponse.tier
            timestamp = rateGetLimitsResponse.timestamp
            success = rateGetLimitsResponse.success
            additionalProperties = rateGetLimitsResponse.additionalProperties.toMutableMap()
        }

        /** The configured rate limits based on the user's subscription tier. */
        fun limits(limits: Limits?) = limits(JsonField.ofNullable(limits))

        /** Alias for calling [Builder.limits] with `limits.orElse(null)`. */
        fun limits(limits: Optional<Limits>) = limits(limits.getOrNull())

        /**
         * Sets [Builder.limits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limits] with a well-typed [Limits] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limits(limits: JsonField<Limits>) = apply { this.limits = limits }

        /** Current rate limit usage information for different time windows. */
        fun rateLimits(rateLimits: RateLimits?) = rateLimits(JsonField.ofNullable(rateLimits))

        /** Alias for calling [Builder.rateLimits] with `rateLimits.orElse(null)`. */
        fun rateLimits(rateLimits: Optional<RateLimits>) = rateLimits(rateLimits.getOrNull())

        /**
         * Sets [Builder.rateLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateLimits] with a well-typed [RateLimits] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rateLimits(rateLimits: JsonField<RateLimits>) = apply { this.rateLimits = rateLimits }

        /** The user's current subscription tier (free or premium). */
        fun tier(tier: String?) = tier(JsonField.ofNullable(tier))

        /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
        fun tier(tier: Optional<String>) = tier(tier.getOrNull())

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

        /** ISO timestamp when the rate limits information was retrieved. */
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

        /** Indicates whether the rate limits request was successful. */
        fun success(success: Boolean?) = success(JsonField.ofNullable(success))

        /**
         * Alias for [Builder.success].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun success(success: Boolean) = success(success as Boolean?)

        /** Alias for calling [Builder.success] with `success.orElse(null)`. */
        fun success(success: Optional<Boolean>) = success(success.getOrNull())

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [RateGetLimitsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .limits()
         * .rateLimits()
         * .tier()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RateGetLimitsResponse =
            RateGetLimitsResponse(
                checkRequired("limits", limits),
                checkRequired("rateLimits", rateLimits),
                checkRequired("tier", tier),
                checkRequired("timestamp", timestamp),
                success,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RateGetLimitsResponse = apply {
        if (validated) {
            return@apply
        }

        limits().ifPresent { it.validate() }
        rateLimits().ifPresent { it.validate() }
        tier()
        timestamp()
        success()
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
        (limits.asKnown().getOrNull()?.validity() ?: 0) +
            (rateLimits.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tier.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    /** The configured rate limits based on the user's subscription tier. */
    class Limits
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maximumRequestsPerDay: JsonField<Long>,
        private val maximumRequestsPerHour: JsonField<Long>,
        private val maximumRequestsPerMinute: JsonField<Long>,
        private val tokensPerAgent: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("maximum_requests_per_day")
            @ExcludeMissing
            maximumRequestsPerDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("maximum_requests_per_hour")
            @ExcludeMissing
            maximumRequestsPerHour: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("maximum_requests_per_minute")
            @ExcludeMissing
            maximumRequestsPerMinute: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tokens_per_agent")
            @ExcludeMissing
            tokensPerAgent: JsonField<Long> = JsonMissing.of(),
        ) : this(
            maximumRequestsPerDay,
            maximumRequestsPerHour,
            maximumRequestsPerMinute,
            tokensPerAgent,
            mutableMapOf(),
        )

        /**
         * The maximum number of requests allowed per day.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maximumRequestsPerDay(): Long =
            maximumRequestsPerDay.getRequired("maximum_requests_per_day")

        /**
         * The maximum number of requests allowed per hour.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maximumRequestsPerHour(): Long =
            maximumRequestsPerHour.getRequired("maximum_requests_per_hour")

        /**
         * The maximum number of requests allowed per minute.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maximumRequestsPerMinute(): Long =
            maximumRequestsPerMinute.getRequired("maximum_requests_per_minute")

        /**
         * The maximum number of tokens allowed per agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokensPerAgent(): Long = tokensPerAgent.getRequired("tokens_per_agent")

        /**
         * Returns the raw JSON value of [maximumRequestsPerDay].
         *
         * Unlike [maximumRequestsPerDay], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maximum_requests_per_day")
        @ExcludeMissing
        fun _maximumRequestsPerDay(): JsonField<Long> = maximumRequestsPerDay

        /**
         * Returns the raw JSON value of [maximumRequestsPerHour].
         *
         * Unlike [maximumRequestsPerHour], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maximum_requests_per_hour")
        @ExcludeMissing
        fun _maximumRequestsPerHour(): JsonField<Long> = maximumRequestsPerHour

        /**
         * Returns the raw JSON value of [maximumRequestsPerMinute].
         *
         * Unlike [maximumRequestsPerMinute], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maximum_requests_per_minute")
        @ExcludeMissing
        fun _maximumRequestsPerMinute(): JsonField<Long> = maximumRequestsPerMinute

        /**
         * Returns the raw JSON value of [tokensPerAgent].
         *
         * Unlike [tokensPerAgent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tokens_per_agent")
        @ExcludeMissing
        fun _tokensPerAgent(): JsonField<Long> = tokensPerAgent

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
             * Returns a mutable builder for constructing an instance of [Limits].
             *
             * The following fields are required:
             * ```java
             * .maximumRequestsPerDay()
             * .maximumRequestsPerHour()
             * .maximumRequestsPerMinute()
             * .tokensPerAgent()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Limits]. */
        class Builder internal constructor() {

            private var maximumRequestsPerDay: JsonField<Long>? = null
            private var maximumRequestsPerHour: JsonField<Long>? = null
            private var maximumRequestsPerMinute: JsonField<Long>? = null
            private var tokensPerAgent: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(limits: Limits) = apply {
                maximumRequestsPerDay = limits.maximumRequestsPerDay
                maximumRequestsPerHour = limits.maximumRequestsPerHour
                maximumRequestsPerMinute = limits.maximumRequestsPerMinute
                tokensPerAgent = limits.tokensPerAgent
                additionalProperties = limits.additionalProperties.toMutableMap()
            }

            /** The maximum number of requests allowed per day. */
            fun maximumRequestsPerDay(maximumRequestsPerDay: Long) =
                maximumRequestsPerDay(JsonField.of(maximumRequestsPerDay))

            /**
             * Sets [Builder.maximumRequestsPerDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumRequestsPerDay] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maximumRequestsPerDay(maximumRequestsPerDay: JsonField<Long>) = apply {
                this.maximumRequestsPerDay = maximumRequestsPerDay
            }

            /** The maximum number of requests allowed per hour. */
            fun maximumRequestsPerHour(maximumRequestsPerHour: Long) =
                maximumRequestsPerHour(JsonField.of(maximumRequestsPerHour))

            /**
             * Sets [Builder.maximumRequestsPerHour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumRequestsPerHour] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maximumRequestsPerHour(maximumRequestsPerHour: JsonField<Long>) = apply {
                this.maximumRequestsPerHour = maximumRequestsPerHour
            }

            /** The maximum number of requests allowed per minute. */
            fun maximumRequestsPerMinute(maximumRequestsPerMinute: Long) =
                maximumRequestsPerMinute(JsonField.of(maximumRequestsPerMinute))

            /**
             * Sets [Builder.maximumRequestsPerMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumRequestsPerMinute] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maximumRequestsPerMinute(maximumRequestsPerMinute: JsonField<Long>) = apply {
                this.maximumRequestsPerMinute = maximumRequestsPerMinute
            }

            /** The maximum number of tokens allowed per agent. */
            fun tokensPerAgent(tokensPerAgent: Long) = tokensPerAgent(JsonField.of(tokensPerAgent))

            /**
             * Sets [Builder.tokensPerAgent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokensPerAgent] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokensPerAgent(tokensPerAgent: JsonField<Long>) = apply {
                this.tokensPerAgent = tokensPerAgent
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
             * Returns an immutable instance of [Limits].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .maximumRequestsPerDay()
             * .maximumRequestsPerHour()
             * .maximumRequestsPerMinute()
             * .tokensPerAgent()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Limits =
                Limits(
                    checkRequired("maximumRequestsPerDay", maximumRequestsPerDay),
                    checkRequired("maximumRequestsPerHour", maximumRequestsPerHour),
                    checkRequired("maximumRequestsPerMinute", maximumRequestsPerMinute),
                    checkRequired("tokensPerAgent", tokensPerAgent),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Limits = apply {
            if (validated) {
                return@apply
            }

            maximumRequestsPerDay()
            maximumRequestsPerHour()
            maximumRequestsPerMinute()
            tokensPerAgent()
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
            (if (maximumRequestsPerDay.asKnown().isPresent) 1 else 0) +
                (if (maximumRequestsPerHour.asKnown().isPresent) 1 else 0) +
                (if (maximumRequestsPerMinute.asKnown().isPresent) 1 else 0) +
                (if (tokensPerAgent.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Limits &&
                maximumRequestsPerDay == other.maximumRequestsPerDay &&
                maximumRequestsPerHour == other.maximumRequestsPerHour &&
                maximumRequestsPerMinute == other.maximumRequestsPerMinute &&
                tokensPerAgent == other.tokensPerAgent &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                maximumRequestsPerDay,
                maximumRequestsPerHour,
                maximumRequestsPerMinute,
                tokensPerAgent,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Limits{maximumRequestsPerDay=$maximumRequestsPerDay, maximumRequestsPerHour=$maximumRequestsPerHour, maximumRequestsPerMinute=$maximumRequestsPerMinute, tokensPerAgent=$tokensPerAgent, additionalProperties=$additionalProperties}"
    }

    /** Current rate limit usage information for different time windows. */
    class RateLimits
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val day: JsonField<RateLimitWindow>,
        private val hour: JsonField<RateLimitWindow>,
        private val minute: JsonField<RateLimitWindow>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("day") @ExcludeMissing day: JsonField<RateLimitWindow> = JsonMissing.of(),
            @JsonProperty("hour")
            @ExcludeMissing
            hour: JsonField<RateLimitWindow> = JsonMissing.of(),
            @JsonProperty("minute")
            @ExcludeMissing
            minute: JsonField<RateLimitWindow> = JsonMissing.of(),
        ) : this(day, hour, minute, mutableMapOf())

        /**
         * Rate limit information for the last day.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun day(): RateLimitWindow = day.getRequired("day")

        /**
         * Rate limit information for the last hour.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hour(): RateLimitWindow = hour.getRequired("hour")

        /**
         * Rate limit information for the last minute.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minute(): RateLimitWindow = minute.getRequired("minute")

        /**
         * Returns the raw JSON value of [day].
         *
         * Unlike [day], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<RateLimitWindow> = day

        /**
         * Returns the raw JSON value of [hour].
         *
         * Unlike [hour], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hour") @ExcludeMissing fun _hour(): JsonField<RateLimitWindow> = hour

        /**
         * Returns the raw JSON value of [minute].
         *
         * Unlike [minute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minute") @ExcludeMissing fun _minute(): JsonField<RateLimitWindow> = minute

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
             * Returns a mutable builder for constructing an instance of [RateLimits].
             *
             * The following fields are required:
             * ```java
             * .day()
             * .hour()
             * .minute()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RateLimits]. */
        class Builder internal constructor() {

            private var day: JsonField<RateLimitWindow>? = null
            private var hour: JsonField<RateLimitWindow>? = null
            private var minute: JsonField<RateLimitWindow>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rateLimits: RateLimits) = apply {
                day = rateLimits.day
                hour = rateLimits.hour
                minute = rateLimits.minute
                additionalProperties = rateLimits.additionalProperties.toMutableMap()
            }

            /** Rate limit information for the last day. */
            fun day(day: RateLimitWindow) = day(JsonField.of(day))

            /**
             * Sets [Builder.day] to an arbitrary JSON value.
             *
             * You should usually call [Builder.day] with a well-typed [RateLimitWindow] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun day(day: JsonField<RateLimitWindow>) = apply { this.day = day }

            /** Rate limit information for the last hour. */
            fun hour(hour: RateLimitWindow) = hour(JsonField.of(hour))

            /**
             * Sets [Builder.hour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hour] with a well-typed [RateLimitWindow] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hour(hour: JsonField<RateLimitWindow>) = apply { this.hour = hour }

            /** Rate limit information for the last minute. */
            fun minute(minute: RateLimitWindow) = minute(JsonField.of(minute))

            /**
             * Sets [Builder.minute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minute] with a well-typed [RateLimitWindow] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minute(minute: JsonField<RateLimitWindow>) = apply { this.minute = minute }

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
             * Returns an immutable instance of [RateLimits].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .day()
             * .hour()
             * .minute()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RateLimits =
                RateLimits(
                    checkRequired("day", day),
                    checkRequired("hour", hour),
                    checkRequired("minute", minute),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RateLimits = apply {
            if (validated) {
                return@apply
            }

            day().validate()
            hour().validate()
            minute().validate()
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
            (day.asKnown().getOrNull()?.validity() ?: 0) +
                (hour.asKnown().getOrNull()?.validity() ?: 0) +
                (minute.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RateLimits &&
                day == other.day &&
                hour == other.hour &&
                minute == other.minute &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(day, hour, minute, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RateLimits{day=$day, hour=$hour, minute=$minute, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RateGetLimitsResponse &&
            limits == other.limits &&
            rateLimits == other.rateLimits &&
            tier == other.tier &&
            timestamp == other.timestamp &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(limits, rateLimits, tier, timestamp, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RateGetLimitsResponse{limits=$limits, rateLimits=$rateLimits, tier=$tier, timestamp=$timestamp, success=$success, additionalProperties=$additionalProperties}"
}

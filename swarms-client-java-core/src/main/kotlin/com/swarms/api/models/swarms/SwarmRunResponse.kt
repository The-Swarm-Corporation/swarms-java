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
import com.swarms.api.core.checkRequired
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SwarmRunResponse
private constructor(
    private val description: JsonField<String>,
    private val executionTime: JsonField<Double>,
    private val jobId: JsonField<String>,
    private val numberOfAgents: JsonField<Long>,
    private val output: JsonValue,
    private val serviceTier: JsonField<String>,
    private val status: JsonField<String>,
    private val swarmName: JsonField<String>,
    private val swarmType: JsonField<String>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("execution_time")
        @ExcludeMissing
        executionTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("number_of_agents")
        @ExcludeMissing
        numberOfAgents: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonValue = JsonMissing.of(),
        @JsonProperty("service_tier")
        @ExcludeMissing
        serviceTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("swarm_name") @ExcludeMissing swarmName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("swarm_type") @ExcludeMissing swarmType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
    ) : this(
        description,
        executionTime,
        jobId,
        numberOfAgents,
        output,
        serviceTier,
        status,
        swarmName,
        swarmType,
        usage,
        mutableMapOf(),
    )

    /**
     * The description of the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The execution time of the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun executionTime(): Optional<Double> = executionTime.getOptional("execution_time")

    /**
     * The unique identifier for the swarm completion.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jobId(): Optional<String> = jobId.getOptional("job_id")

    /**
     * The number of agents in the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun numberOfAgents(): Optional<Long> = numberOfAgents.getOptional("number_of_agents")

    /** The output of the swarm. */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonValue = output

    /**
     * The service tier of the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun serviceTier(): Optional<String> = serviceTier.getOptional("service_tier")

    /**
     * The status of the swarm completion.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * The name of the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun swarmName(): Optional<String> = swarmName.getOptional("swarm_name")

    /**
     * The type of the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun swarmType(): Optional<String> = swarmType.getOptional("swarm_type")

    /**
     * The usage of the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun usage(): Optional<Usage> = usage.getOptional("usage")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [executionTime].
     *
     * Unlike [executionTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_time")
    @ExcludeMissing
    fun _executionTime(): JsonField<Double> = executionTime

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [numberOfAgents].
     *
     * Unlike [numberOfAgents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number_of_agents")
    @ExcludeMissing
    fun _numberOfAgents(): JsonField<Long> = numberOfAgents

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_tier")
    @ExcludeMissing
    fun _serviceTier(): JsonField<String> = serviceTier

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [swarmName].
     *
     * Unlike [swarmName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swarm_name") @ExcludeMissing fun _swarmName(): JsonField<String> = swarmName

    /**
     * Returns the raw JSON value of [swarmType].
     *
     * Unlike [swarmType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swarm_type") @ExcludeMissing fun _swarmType(): JsonField<String> = swarmType

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
         * Returns a mutable builder for constructing an instance of [SwarmRunResponse].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .executionTime()
         * .jobId()
         * .numberOfAgents()
         * .output()
         * .serviceTier()
         * .status()
         * .swarmName()
         * .swarmType()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SwarmRunResponse]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var executionTime: JsonField<Double>? = null
        private var jobId: JsonField<String>? = null
        private var numberOfAgents: JsonField<Long>? = null
        private var output: JsonValue? = null
        private var serviceTier: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var swarmName: JsonField<String>? = null
        private var swarmType: JsonField<String>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(swarmRunResponse: SwarmRunResponse) = apply {
            description = swarmRunResponse.description
            executionTime = swarmRunResponse.executionTime
            jobId = swarmRunResponse.jobId
            numberOfAgents = swarmRunResponse.numberOfAgents
            output = swarmRunResponse.output
            serviceTier = swarmRunResponse.serviceTier
            status = swarmRunResponse.status
            swarmName = swarmRunResponse.swarmName
            swarmType = swarmRunResponse.swarmType
            usage = swarmRunResponse.usage
            additionalProperties = swarmRunResponse.additionalProperties.toMutableMap()
        }

        /** The description of the swarm. */
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

        /** The execution time of the swarm. */
        fun executionTime(executionTime: Double?) =
            executionTime(JsonField.ofNullable(executionTime))

        /**
         * Alias for [Builder.executionTime].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun executionTime(executionTime: Double) = executionTime(executionTime as Double?)

        /** Alias for calling [Builder.executionTime] with `executionTime.orElse(null)`. */
        fun executionTime(executionTime: Optional<Double>) =
            executionTime(executionTime.getOrNull())

        /**
         * Sets [Builder.executionTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionTime] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionTime(executionTime: JsonField<Double>) = apply {
            this.executionTime = executionTime
        }

        /** The unique identifier for the swarm completion. */
        fun jobId(jobId: String?) = jobId(JsonField.ofNullable(jobId))

        /** Alias for calling [Builder.jobId] with `jobId.orElse(null)`. */
        fun jobId(jobId: Optional<String>) = jobId(jobId.getOrNull())

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The number of agents in the swarm. */
        fun numberOfAgents(numberOfAgents: Long?) =
            numberOfAgents(JsonField.ofNullable(numberOfAgents))

        /**
         * Alias for [Builder.numberOfAgents].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numberOfAgents(numberOfAgents: Long) = numberOfAgents(numberOfAgents as Long?)

        /** Alias for calling [Builder.numberOfAgents] with `numberOfAgents.orElse(null)`. */
        fun numberOfAgents(numberOfAgents: Optional<Long>) =
            numberOfAgents(numberOfAgents.getOrNull())

        /**
         * Sets [Builder.numberOfAgents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfAgents] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numberOfAgents(numberOfAgents: JsonField<Long>) = apply {
            this.numberOfAgents = numberOfAgents
        }

        /** The output of the swarm. */
        fun output(output: JsonValue) = apply { this.output = output }

        /** The service tier of the swarm. */
        fun serviceTier(serviceTier: String?) = serviceTier(JsonField.ofNullable(serviceTier))

        /** Alias for calling [Builder.serviceTier] with `serviceTier.orElse(null)`. */
        fun serviceTier(serviceTier: Optional<String>) = serviceTier(serviceTier.getOrNull())

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceTier(serviceTier: JsonField<String>) = apply { this.serviceTier = serviceTier }

        /** The status of the swarm completion. */
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

        /** The name of the swarm. */
        fun swarmName(swarmName: String?) = swarmName(JsonField.ofNullable(swarmName))

        /** Alias for calling [Builder.swarmName] with `swarmName.orElse(null)`. */
        fun swarmName(swarmName: Optional<String>) = swarmName(swarmName.getOrNull())

        /**
         * Sets [Builder.swarmName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swarmName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun swarmName(swarmName: JsonField<String>) = apply { this.swarmName = swarmName }

        /** The type of the swarm. */
        fun swarmType(swarmType: String?) = swarmType(JsonField.ofNullable(swarmType))

        /** Alias for calling [Builder.swarmType] with `swarmType.orElse(null)`. */
        fun swarmType(swarmType: Optional<String>) = swarmType(swarmType.getOrNull())

        /**
         * Sets [Builder.swarmType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swarmType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun swarmType(swarmType: JsonField<String>) = apply { this.swarmType = swarmType }

        /** The usage of the swarm. */
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
         * Returns an immutable instance of [SwarmRunResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .executionTime()
         * .jobId()
         * .numberOfAgents()
         * .output()
         * .serviceTier()
         * .status()
         * .swarmName()
         * .swarmType()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SwarmRunResponse =
            SwarmRunResponse(
                checkRequired("description", description),
                checkRequired("executionTime", executionTime),
                checkRequired("jobId", jobId),
                checkRequired("numberOfAgents", numberOfAgents),
                checkRequired("output", output),
                checkRequired("serviceTier", serviceTier),
                checkRequired("status", status),
                checkRequired("swarmName", swarmName),
                checkRequired("swarmType", swarmType),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SwarmRunResponse = apply {
        if (validated) {
            return@apply
        }

        description()
        executionTime()
        jobId()
        numberOfAgents()
        serviceTier()
        status()
        swarmName()
        swarmType()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (executionTime.asKnown().isPresent) 1 else 0) +
            (if (jobId.asKnown().isPresent) 1 else 0) +
            (if (numberOfAgents.asKnown().isPresent) 1 else 0) +
            (if (serviceTier.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (swarmName.asKnown().isPresent) 1 else 0) +
            (if (swarmType.asKnown().isPresent) 1 else 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    /** The usage of the swarm. */
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

            return /* spotless:off */ other is Usage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Usage{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SwarmRunResponse && description == other.description && executionTime == other.executionTime && jobId == other.jobId && numberOfAgents == other.numberOfAgents && output == other.output && serviceTier == other.serviceTier && status == other.status && swarmName == other.swarmName && swarmType == other.swarmType && usage == other.usage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(description, executionTime, jobId, numberOfAgents, output, serviceTier, status, swarmName, swarmType, usage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SwarmRunResponse{description=$description, executionTime=$executionTime, jobId=$jobId, numberOfAgents=$numberOfAgents, output=$output, serviceTier=$serviceTier, status=$status, swarmName=$swarmName, swarmType=$swarmType, usage=$usage, additionalProperties=$additionalProperties}"
}

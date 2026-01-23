// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.batchedgridworkflow

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
import kotlin.jvm.optionals.getOrNull

class BatchedGridWorkflowCompleteWorkflowResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val jobId: JsonField<String>,
    private val name: JsonField<String>,
    private val outputs: JsonValue,
    private val status: JsonField<String>,
    private val timestamp: JsonField<String>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
    ) : this(description, jobId, name, outputs, status, timestamp, usage, mutableMapOf())

    /**
     * The description of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The job ID of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobId(): String = jobId.getRequired("job_id")

    /**
     * The name of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The outputs of the batched grid workflow.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = batchedGridWorkflowCompleteWorkflowResponse.outputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
     * The status of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * The timestamp of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): String = timestamp.getRequired("timestamp")

    /**
     * The usage of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Usage = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * [BatchedGridWorkflowCompleteWorkflowResponse].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .jobId()
         * .name()
         * .outputs()
         * .status()
         * .timestamp()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchedGridWorkflowCompleteWorkflowResponse]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var jobId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var outputs: JsonValue? = null
        private var status: JsonField<String>? = null
        private var timestamp: JsonField<String>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            batchedGridWorkflowCompleteWorkflowResponse: BatchedGridWorkflowCompleteWorkflowResponse
        ) = apply {
            description = batchedGridWorkflowCompleteWorkflowResponse.description
            jobId = batchedGridWorkflowCompleteWorkflowResponse.jobId
            name = batchedGridWorkflowCompleteWorkflowResponse.name
            outputs = batchedGridWorkflowCompleteWorkflowResponse.outputs
            status = batchedGridWorkflowCompleteWorkflowResponse.status
            timestamp = batchedGridWorkflowCompleteWorkflowResponse.timestamp
            usage = batchedGridWorkflowCompleteWorkflowResponse.usage
            additionalProperties =
                batchedGridWorkflowCompleteWorkflowResponse.additionalProperties.toMutableMap()
        }

        /** The description of the batched grid workflow. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The job ID of the batched grid workflow. */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The name of the batched grid workflow. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The outputs of the batched grid workflow. */
        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        /** The status of the batched grid workflow. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** The timestamp of the batched grid workflow. */
        fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

        /** The usage of the batched grid workflow. */
        fun usage(usage: Usage) = usage(JsonField.of(usage))

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
         * Returns an immutable instance of [BatchedGridWorkflowCompleteWorkflowResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .jobId()
         * .name()
         * .outputs()
         * .status()
         * .timestamp()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchedGridWorkflowCompleteWorkflowResponse =
            BatchedGridWorkflowCompleteWorkflowResponse(
                checkRequired("description", description),
                checkRequired("jobId", jobId),
                checkRequired("name", name),
                checkRequired("outputs", outputs),
                checkRequired("status", status),
                checkRequired("timestamp", timestamp),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BatchedGridWorkflowCompleteWorkflowResponse = apply {
        if (validated) {
            return@apply
        }

        description()
        jobId()
        name()
        status()
        timestamp()
        usage().validate()
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
            (if (jobId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    /** The usage of the batched grid workflow. */
    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val costPerAgent: JsonField<Double>,
        private val inputTokens: JsonField<Long>,
        private val outputTokens: JsonField<Long>,
        private val tokenCost: JsonField<Double>,
        private val totalTokens: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cost_per_agent")
            @ExcludeMissing
            costPerAgent: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_tokens")
            @ExcludeMissing
            inputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("output_tokens")
            @ExcludeMissing
            outputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("token_cost")
            @ExcludeMissing
            tokenCost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_tokens")
            @ExcludeMissing
            totalTokens: JsonField<Long> = JsonMissing.of(),
        ) : this(costPerAgent, inputTokens, outputTokens, tokenCost, totalTokens, mutableMapOf())

        /**
         * The cost in credits for the agents.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun costPerAgent(): Double = costPerAgent.getRequired("cost_per_agent")

        /**
         * The number of input tokens.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputTokens(): Long = inputTokens.getRequired("input_tokens")

        /**
         * The number of output tokens.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outputTokens(): Long = outputTokens.getRequired("output_tokens")

        /**
         * The cost in credits for the tokens.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokenCost(): Double = tokenCost.getRequired("token_cost")

        /**
         * The total number of tokens.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

        /**
         * Returns the raw JSON value of [costPerAgent].
         *
         * Unlike [costPerAgent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cost_per_agent")
        @ExcludeMissing
        fun _costPerAgent(): JsonField<Double> = costPerAgent

        /**
         * Returns the raw JSON value of [inputTokens].
         *
         * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_tokens")
        @ExcludeMissing
        fun _inputTokens(): JsonField<Long> = inputTokens

        /**
         * Returns the raw JSON value of [outputTokens].
         *
         * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_tokens")
        @ExcludeMissing
        fun _outputTokens(): JsonField<Long> = outputTokens

        /**
         * Returns the raw JSON value of [tokenCost].
         *
         * Unlike [tokenCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token_cost") @ExcludeMissing fun _tokenCost(): JsonField<Double> = tokenCost

        /**
         * Returns the raw JSON value of [totalTokens].
         *
         * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_tokens")
        @ExcludeMissing
        fun _totalTokens(): JsonField<Long> = totalTokens

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
             * Returns a mutable builder for constructing an instance of [Usage].
             *
             * The following fields are required:
             * ```java
             * .costPerAgent()
             * .inputTokens()
             * .outputTokens()
             * .tokenCost()
             * .totalTokens()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var costPerAgent: JsonField<Double>? = null
            private var inputTokens: JsonField<Long>? = null
            private var outputTokens: JsonField<Long>? = null
            private var tokenCost: JsonField<Double>? = null
            private var totalTokens: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                costPerAgent = usage.costPerAgent
                inputTokens = usage.inputTokens
                outputTokens = usage.outputTokens
                tokenCost = usage.tokenCost
                totalTokens = usage.totalTokens
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            /** The cost in credits for the agents. */
            fun costPerAgent(costPerAgent: Double) = costPerAgent(JsonField.of(costPerAgent))

            /**
             * Sets [Builder.costPerAgent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costPerAgent] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costPerAgent(costPerAgent: JsonField<Double>) = apply {
                this.costPerAgent = costPerAgent
            }

            /** The number of input tokens. */
            fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

            /**
             * Sets [Builder.inputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputTokens(inputTokens: JsonField<Long>) = apply { this.inputTokens = inputTokens }

            /** The number of output tokens. */
            fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

            /**
             * Sets [Builder.outputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputTokens(outputTokens: JsonField<Long>) = apply {
                this.outputTokens = outputTokens
            }

            /** The cost in credits for the tokens. */
            fun tokenCost(tokenCost: Double) = tokenCost(JsonField.of(tokenCost))

            /**
             * Sets [Builder.tokenCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenCost] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenCost(tokenCost: JsonField<Double>) = apply { this.tokenCost = tokenCost }

            /** The total number of tokens. */
            fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

            /**
             * Sets [Builder.totalTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

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
             *
             * The following fields are required:
             * ```java
             * .costPerAgent()
             * .inputTokens()
             * .outputTokens()
             * .tokenCost()
             * .totalTokens()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Usage =
                Usage(
                    checkRequired("costPerAgent", costPerAgent),
                    checkRequired("inputTokens", inputTokens),
                    checkRequired("outputTokens", outputTokens),
                    checkRequired("tokenCost", tokenCost),
                    checkRequired("totalTokens", totalTokens),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            costPerAgent()
            inputTokens()
            outputTokens()
            tokenCost()
            totalTokens()
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
            (if (costPerAgent.asKnown().isPresent) 1 else 0) +
                (if (inputTokens.asKnown().isPresent) 1 else 0) +
                (if (outputTokens.asKnown().isPresent) 1 else 0) +
                (if (tokenCost.asKnown().isPresent) 1 else 0) +
                (if (totalTokens.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                costPerAgent == other.costPerAgent &&
                inputTokens == other.inputTokens &&
                outputTokens == other.outputTokens &&
                tokenCost == other.tokenCost &&
                totalTokens == other.totalTokens &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                costPerAgent,
                inputTokens,
                outputTokens,
                tokenCost,
                totalTokens,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{costPerAgent=$costPerAgent, inputTokens=$inputTokens, outputTokens=$outputTokens, tokenCost=$tokenCost, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchedGridWorkflowCompleteWorkflowResponse &&
            description == other.description &&
            jobId == other.jobId &&
            name == other.name &&
            outputs == other.outputs &&
            status == other.status &&
            timestamp == other.timestamp &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            jobId,
            name,
            outputs,
            status,
            timestamp,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchedGridWorkflowCompleteWorkflowResponse{description=$description, jobId=$jobId, name=$name, outputs=$outputs, status=$status, timestamp=$timestamp, usage=$usage, additionalProperties=$additionalProperties}"
}

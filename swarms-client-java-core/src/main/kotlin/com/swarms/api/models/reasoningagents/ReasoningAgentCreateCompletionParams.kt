// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.reasoningagents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.Enum
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.Params
import com.swarms.api.core.http.Headers
import com.swarms.api.core.http.QueryParams
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Run a reasoning agent with the specified task. */
class ReasoningAgentCreateCompletionParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The unique name assigned to the reasoning agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun agentName(): Optional<String> = body.agentName()

    /**
     * A detailed explanation of the reasoning agent's purpose and capabilities.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The maximum number of times the reasoning agent is allowed to repeat its task.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxLoops(): Optional<Long> = body.maxLoops()

    /**
     * The memory capacity for the reasoning agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun memoryCapacity(): Optional<Long> = body.memoryCapacity()

    /**
     * The name of the AI model that the reasoning agent will utilize.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun modelName(): Optional<String> = body.modelName()

    /**
     * The number of knowledge items to use for the reasoning agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun numKnowledgeItems(): Optional<Long> = body.numKnowledgeItems()

    /**
     * The number of samples to generate for the reasoning agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun numSamples(): Optional<Long> = body.numSamples()

    /**
     * The type of output format for the reasoning agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outputType(): Optional<OutputType> = body.outputType()

    /**
     * The type of reasoning swarm to use (e.g., reasoning duo, self-consistency, IRE).
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun swarmType(): Optional<SwarmType> = body.swarmType()

    /**
     * The initial instruction or context provided to the reasoning agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = body.systemPrompt()

    /**
     * The task to be completed by the reasoning agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun task(): Optional<String> = body.task()

    /**
     * Returns the raw JSON value of [agentName].
     *
     * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentName(): JsonField<String> = body._agentName()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [maxLoops].
     *
     * Unlike [maxLoops], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxLoops(): JsonField<Long> = body._maxLoops()

    /**
     * Returns the raw JSON value of [memoryCapacity].
     *
     * Unlike [memoryCapacity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memoryCapacity(): JsonField<Long> = body._memoryCapacity()

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelName(): JsonField<String> = body._modelName()

    /**
     * Returns the raw JSON value of [numKnowledgeItems].
     *
     * Unlike [numKnowledgeItems], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _numKnowledgeItems(): JsonField<Long> = body._numKnowledgeItems()

    /**
     * Returns the raw JSON value of [numSamples].
     *
     * Unlike [numSamples], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numSamples(): JsonField<Long> = body._numSamples()

    /**
     * Returns the raw JSON value of [outputType].
     *
     * Unlike [outputType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputType(): JsonField<OutputType> = body._outputType()

    /**
     * Returns the raw JSON value of [swarmType].
     *
     * Unlike [swarmType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _swarmType(): JsonField<SwarmType> = body._swarmType()

    /**
     * Returns the raw JSON value of [systemPrompt].
     *
     * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _systemPrompt(): JsonField<String> = body._systemPrompt()

    /**
     * Returns the raw JSON value of [task].
     *
     * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _task(): JsonField<String> = body._task()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReasoningAgentCreateCompletionParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReasoningAgentCreateCompletionParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReasoningAgentCreateCompletionParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            reasoningAgentCreateCompletionParams: ReasoningAgentCreateCompletionParams
        ) = apply {
            body = reasoningAgentCreateCompletionParams.body.toBuilder()
            additionalHeaders = reasoningAgentCreateCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                reasoningAgentCreateCompletionParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agentName]
         * - [description]
         * - [maxLoops]
         * - [memoryCapacity]
         * - [modelName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The unique name assigned to the reasoning agent. */
        fun agentName(agentName: String?) = apply { body.agentName(agentName) }

        /** Alias for calling [Builder.agentName] with `agentName.orElse(null)`. */
        fun agentName(agentName: Optional<String>) = agentName(agentName.getOrNull())

        /**
         * Sets [Builder.agentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentName(agentName: JsonField<String>) = apply { body.agentName(agentName) }

        /** A detailed explanation of the reasoning agent's purpose and capabilities. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The maximum number of times the reasoning agent is allowed to repeat its task. */
        fun maxLoops(maxLoops: Long?) = apply { body.maxLoops(maxLoops) }

        /**
         * Alias for [Builder.maxLoops].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxLoops(maxLoops: Long) = maxLoops(maxLoops as Long?)

        /** Alias for calling [Builder.maxLoops] with `maxLoops.orElse(null)`. */
        fun maxLoops(maxLoops: Optional<Long>) = maxLoops(maxLoops.getOrNull())

        /**
         * Sets [Builder.maxLoops] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLoops] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxLoops(maxLoops: JsonField<Long>) = apply { body.maxLoops(maxLoops) }

        /** The memory capacity for the reasoning agent. */
        fun memoryCapacity(memoryCapacity: Long?) = apply { body.memoryCapacity(memoryCapacity) }

        /**
         * Alias for [Builder.memoryCapacity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun memoryCapacity(memoryCapacity: Long) = memoryCapacity(memoryCapacity as Long?)

        /** Alias for calling [Builder.memoryCapacity] with `memoryCapacity.orElse(null)`. */
        fun memoryCapacity(memoryCapacity: Optional<Long>) =
            memoryCapacity(memoryCapacity.getOrNull())

        /**
         * Sets [Builder.memoryCapacity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryCapacity] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun memoryCapacity(memoryCapacity: JsonField<Long>) = apply {
            body.memoryCapacity(memoryCapacity)
        }

        /** The name of the AI model that the reasoning agent will utilize. */
        fun modelName(modelName: String?) = apply { body.modelName(modelName) }

        /** Alias for calling [Builder.modelName] with `modelName.orElse(null)`. */
        fun modelName(modelName: Optional<String>) = modelName(modelName.getOrNull())

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { body.modelName(modelName) }

        /** The number of knowledge items to use for the reasoning agent. */
        fun numKnowledgeItems(numKnowledgeItems: Long?) = apply {
            body.numKnowledgeItems(numKnowledgeItems)
        }

        /**
         * Alias for [Builder.numKnowledgeItems].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numKnowledgeItems(numKnowledgeItems: Long) =
            numKnowledgeItems(numKnowledgeItems as Long?)

        /** Alias for calling [Builder.numKnowledgeItems] with `numKnowledgeItems.orElse(null)`. */
        fun numKnowledgeItems(numKnowledgeItems: Optional<Long>) =
            numKnowledgeItems(numKnowledgeItems.getOrNull())

        /**
         * Sets [Builder.numKnowledgeItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numKnowledgeItems] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numKnowledgeItems(numKnowledgeItems: JsonField<Long>) = apply {
            body.numKnowledgeItems(numKnowledgeItems)
        }

        /** The number of samples to generate for the reasoning agent. */
        fun numSamples(numSamples: Long?) = apply { body.numSamples(numSamples) }

        /**
         * Alias for [Builder.numSamples].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numSamples(numSamples: Long) = numSamples(numSamples as Long?)

        /** Alias for calling [Builder.numSamples] with `numSamples.orElse(null)`. */
        fun numSamples(numSamples: Optional<Long>) = numSamples(numSamples.getOrNull())

        /**
         * Sets [Builder.numSamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSamples] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numSamples(numSamples: JsonField<Long>) = apply { body.numSamples(numSamples) }

        /** The type of output format for the reasoning agent. */
        fun outputType(outputType: OutputType?) = apply { body.outputType(outputType) }

        /** Alias for calling [Builder.outputType] with `outputType.orElse(null)`. */
        fun outputType(outputType: Optional<OutputType>) = outputType(outputType.getOrNull())

        /**
         * Sets [Builder.outputType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputType] with a well-typed [OutputType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputType(outputType: JsonField<OutputType>) = apply { body.outputType(outputType) }

        /** The type of reasoning swarm to use (e.g., reasoning duo, self-consistency, IRE). */
        fun swarmType(swarmType: SwarmType?) = apply { body.swarmType(swarmType) }

        /** Alias for calling [Builder.swarmType] with `swarmType.orElse(null)`. */
        fun swarmType(swarmType: Optional<SwarmType>) = swarmType(swarmType.getOrNull())

        /**
         * Sets [Builder.swarmType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swarmType] with a well-typed [SwarmType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun swarmType(swarmType: JsonField<SwarmType>) = apply { body.swarmType(swarmType) }

        /** The initial instruction or context provided to the reasoning agent. */
        fun systemPrompt(systemPrompt: String?) = apply { body.systemPrompt(systemPrompt) }

        /** Alias for calling [Builder.systemPrompt] with `systemPrompt.orElse(null)`. */
        fun systemPrompt(systemPrompt: Optional<String>) = systemPrompt(systemPrompt.getOrNull())

        /**
         * Sets [Builder.systemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemPrompt(systemPrompt: JsonField<String>) = apply {
            body.systemPrompt(systemPrompt)
        }

        /** The task to be completed by the reasoning agent. */
        fun task(task: String?) = apply { body.task(task) }

        /** Alias for calling [Builder.task] with `task.orElse(null)`. */
        fun task(task: Optional<String>) = task(task.getOrNull())

        /**
         * Sets [Builder.task] to an arbitrary JSON value.
         *
         * You should usually call [Builder.task] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun task(task: JsonField<String>) = apply { body.task(task) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ReasoningAgentCreateCompletionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReasoningAgentCreateCompletionParams =
            ReasoningAgentCreateCompletionParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val agentName: JsonField<String>,
        private val description: JsonField<String>,
        private val maxLoops: JsonField<Long>,
        private val memoryCapacity: JsonField<Long>,
        private val modelName: JsonField<String>,
        private val numKnowledgeItems: JsonField<Long>,
        private val numSamples: JsonField<Long>,
        private val outputType: JsonField<OutputType>,
        private val swarmType: JsonField<SwarmType>,
        private val systemPrompt: JsonField<String>,
        private val task: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_name")
            @ExcludeMissing
            agentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_loops") @ExcludeMissing maxLoops: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("memory_capacity")
            @ExcludeMissing
            memoryCapacity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model_name")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("num_knowledge_items")
            @ExcludeMissing
            numKnowledgeItems: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("num_samples")
            @ExcludeMissing
            numSamples: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("output_type")
            @ExcludeMissing
            outputType: JsonField<OutputType> = JsonMissing.of(),
            @JsonProperty("swarm_type")
            @ExcludeMissing
            swarmType: JsonField<SwarmType> = JsonMissing.of(),
            @JsonProperty("system_prompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("task") @ExcludeMissing task: JsonField<String> = JsonMissing.of(),
        ) : this(
            agentName,
            description,
            maxLoops,
            memoryCapacity,
            modelName,
            numKnowledgeItems,
            numSamples,
            outputType,
            swarmType,
            systemPrompt,
            task,
            mutableMapOf(),
        )

        /**
         * The unique name assigned to the reasoning agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun agentName(): Optional<String> = agentName.getOptional("agent_name")

        /**
         * A detailed explanation of the reasoning agent's purpose and capabilities.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The maximum number of times the reasoning agent is allowed to repeat its task.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxLoops(): Optional<Long> = maxLoops.getOptional("max_loops")

        /**
         * The memory capacity for the reasoning agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun memoryCapacity(): Optional<Long> = memoryCapacity.getOptional("memory_capacity")

        /**
         * The name of the AI model that the reasoning agent will utilize.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun modelName(): Optional<String> = modelName.getOptional("model_name")

        /**
         * The number of knowledge items to use for the reasoning agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun numKnowledgeItems(): Optional<Long> =
            numKnowledgeItems.getOptional("num_knowledge_items")

        /**
         * The number of samples to generate for the reasoning agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun numSamples(): Optional<Long> = numSamples.getOptional("num_samples")

        /**
         * The type of output format for the reasoning agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun outputType(): Optional<OutputType> = outputType.getOptional("output_type")

        /**
         * The type of reasoning swarm to use (e.g., reasoning duo, self-consistency, IRE).
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun swarmType(): Optional<SwarmType> = swarmType.getOptional("swarm_type")

        /**
         * The initial instruction or context provided to the reasoning agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("system_prompt")

        /**
         * The task to be completed by the reasoning agent.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun task(): Optional<String> = task.getOptional("task")

        /**
         * Returns the raw JSON value of [agentName].
         *
         * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_name") @ExcludeMissing fun _agentName(): JsonField<String> = agentName

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [maxLoops].
         *
         * Unlike [maxLoops], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_loops") @ExcludeMissing fun _maxLoops(): JsonField<Long> = maxLoops

        /**
         * Returns the raw JSON value of [memoryCapacity].
         *
         * Unlike [memoryCapacity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("memory_capacity")
        @ExcludeMissing
        fun _memoryCapacity(): JsonField<Long> = memoryCapacity

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        /**
         * Returns the raw JSON value of [numKnowledgeItems].
         *
         * Unlike [numKnowledgeItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("num_knowledge_items")
        @ExcludeMissing
        fun _numKnowledgeItems(): JsonField<Long> = numKnowledgeItems

        /**
         * Returns the raw JSON value of [numSamples].
         *
         * Unlike [numSamples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_samples") @ExcludeMissing fun _numSamples(): JsonField<Long> = numSamples

        /**
         * Returns the raw JSON value of [outputType].
         *
         * Unlike [outputType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_type")
        @ExcludeMissing
        fun _outputType(): JsonField<OutputType> = outputType

        /**
         * Returns the raw JSON value of [swarmType].
         *
         * Unlike [swarmType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("swarm_type")
        @ExcludeMissing
        fun _swarmType(): JsonField<SwarmType> = swarmType

        /**
         * Returns the raw JSON value of [systemPrompt].
         *
         * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("system_prompt")
        @ExcludeMissing
        fun _systemPrompt(): JsonField<String> = systemPrompt

        /**
         * Returns the raw JSON value of [task].
         *
         * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<String> = task

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var agentName: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var maxLoops: JsonField<Long> = JsonMissing.of()
            private var memoryCapacity: JsonField<Long> = JsonMissing.of()
            private var modelName: JsonField<String> = JsonMissing.of()
            private var numKnowledgeItems: JsonField<Long> = JsonMissing.of()
            private var numSamples: JsonField<Long> = JsonMissing.of()
            private var outputType: JsonField<OutputType> = JsonMissing.of()
            private var swarmType: JsonField<SwarmType> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var task: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agentName = body.agentName
                description = body.description
                maxLoops = body.maxLoops
                memoryCapacity = body.memoryCapacity
                modelName = body.modelName
                numKnowledgeItems = body.numKnowledgeItems
                numSamples = body.numSamples
                outputType = body.outputType
                swarmType = body.swarmType
                systemPrompt = body.systemPrompt
                task = body.task
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The unique name assigned to the reasoning agent. */
            fun agentName(agentName: String?) = agentName(JsonField.ofNullable(agentName))

            /** Alias for calling [Builder.agentName] with `agentName.orElse(null)`. */
            fun agentName(agentName: Optional<String>) = agentName(agentName.getOrNull())

            /**
             * Sets [Builder.agentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

            /** A detailed explanation of the reasoning agent's purpose and capabilities. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The maximum number of times the reasoning agent is allowed to repeat its task. */
            fun maxLoops(maxLoops: Long?) = maxLoops(JsonField.ofNullable(maxLoops))

            /**
             * Alias for [Builder.maxLoops].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxLoops(maxLoops: Long) = maxLoops(maxLoops as Long?)

            /** Alias for calling [Builder.maxLoops] with `maxLoops.orElse(null)`. */
            fun maxLoops(maxLoops: Optional<Long>) = maxLoops(maxLoops.getOrNull())

            /**
             * Sets [Builder.maxLoops] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxLoops] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxLoops(maxLoops: JsonField<Long>) = apply { this.maxLoops = maxLoops }

            /** The memory capacity for the reasoning agent. */
            fun memoryCapacity(memoryCapacity: Long?) =
                memoryCapacity(JsonField.ofNullable(memoryCapacity))

            /**
             * Alias for [Builder.memoryCapacity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun memoryCapacity(memoryCapacity: Long) = memoryCapacity(memoryCapacity as Long?)

            /** Alias for calling [Builder.memoryCapacity] with `memoryCapacity.orElse(null)`. */
            fun memoryCapacity(memoryCapacity: Optional<Long>) =
                memoryCapacity(memoryCapacity.getOrNull())

            /**
             * Sets [Builder.memoryCapacity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryCapacity] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryCapacity(memoryCapacity: JsonField<Long>) = apply {
                this.memoryCapacity = memoryCapacity
            }

            /** The name of the AI model that the reasoning agent will utilize. */
            fun modelName(modelName: String?) = modelName(JsonField.ofNullable(modelName))

            /** Alias for calling [Builder.modelName] with `modelName.orElse(null)`. */
            fun modelName(modelName: Optional<String>) = modelName(modelName.getOrNull())

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /** The number of knowledge items to use for the reasoning agent. */
            fun numKnowledgeItems(numKnowledgeItems: Long?) =
                numKnowledgeItems(JsonField.ofNullable(numKnowledgeItems))

            /**
             * Alias for [Builder.numKnowledgeItems].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numKnowledgeItems(numKnowledgeItems: Long) =
                numKnowledgeItems(numKnowledgeItems as Long?)

            /**
             * Alias for calling [Builder.numKnowledgeItems] with `numKnowledgeItems.orElse(null)`.
             */
            fun numKnowledgeItems(numKnowledgeItems: Optional<Long>) =
                numKnowledgeItems(numKnowledgeItems.getOrNull())

            /**
             * Sets [Builder.numKnowledgeItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numKnowledgeItems] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numKnowledgeItems(numKnowledgeItems: JsonField<Long>) = apply {
                this.numKnowledgeItems = numKnowledgeItems
            }

            /** The number of samples to generate for the reasoning agent. */
            fun numSamples(numSamples: Long?) = numSamples(JsonField.ofNullable(numSamples))

            /**
             * Alias for [Builder.numSamples].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numSamples(numSamples: Long) = numSamples(numSamples as Long?)

            /** Alias for calling [Builder.numSamples] with `numSamples.orElse(null)`. */
            fun numSamples(numSamples: Optional<Long>) = numSamples(numSamples.getOrNull())

            /**
             * Sets [Builder.numSamples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numSamples] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numSamples(numSamples: JsonField<Long>) = apply { this.numSamples = numSamples }

            /** The type of output format for the reasoning agent. */
            fun outputType(outputType: OutputType?) = outputType(JsonField.ofNullable(outputType))

            /** Alias for calling [Builder.outputType] with `outputType.orElse(null)`. */
            fun outputType(outputType: Optional<OutputType>) = outputType(outputType.getOrNull())

            /**
             * Sets [Builder.outputType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputType] with a well-typed [OutputType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputType(outputType: JsonField<OutputType>) = apply {
                this.outputType = outputType
            }

            /** The type of reasoning swarm to use (e.g., reasoning duo, self-consistency, IRE). */
            fun swarmType(swarmType: SwarmType?) = swarmType(JsonField.ofNullable(swarmType))

            /** Alias for calling [Builder.swarmType] with `swarmType.orElse(null)`. */
            fun swarmType(swarmType: Optional<SwarmType>) = swarmType(swarmType.getOrNull())

            /**
             * Sets [Builder.swarmType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.swarmType] with a well-typed [SwarmType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun swarmType(swarmType: JsonField<SwarmType>) = apply { this.swarmType = swarmType }

            /** The initial instruction or context provided to the reasoning agent. */
            fun systemPrompt(systemPrompt: String?) =
                systemPrompt(JsonField.ofNullable(systemPrompt))

            /** Alias for calling [Builder.systemPrompt] with `systemPrompt.orElse(null)`. */
            fun systemPrompt(systemPrompt: Optional<String>) =
                systemPrompt(systemPrompt.getOrNull())

            /**
             * Sets [Builder.systemPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun systemPrompt(systemPrompt: JsonField<String>) = apply {
                this.systemPrompt = systemPrompt
            }

            /** The task to be completed by the reasoning agent. */
            fun task(task: String?) = task(JsonField.ofNullable(task))

            /** Alias for calling [Builder.task] with `task.orElse(null)`. */
            fun task(task: Optional<String>) = task(task.getOrNull())

            /**
             * Sets [Builder.task] to an arbitrary JSON value.
             *
             * You should usually call [Builder.task] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun task(task: JsonField<String>) = apply { this.task = task }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    agentName,
                    description,
                    maxLoops,
                    memoryCapacity,
                    modelName,
                    numKnowledgeItems,
                    numSamples,
                    outputType,
                    swarmType,
                    systemPrompt,
                    task,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            agentName()
            description()
            maxLoops()
            memoryCapacity()
            modelName()
            numKnowledgeItems()
            numSamples()
            outputType().ifPresent { it.validate() }
            swarmType().ifPresent { it.validate() }
            systemPrompt()
            task()
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
            (if (agentName.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (maxLoops.asKnown().isPresent) 1 else 0) +
                (if (memoryCapacity.asKnown().isPresent) 1 else 0) +
                (if (modelName.asKnown().isPresent) 1 else 0) +
                (if (numKnowledgeItems.asKnown().isPresent) 1 else 0) +
                (if (numSamples.asKnown().isPresent) 1 else 0) +
                (outputType.asKnown().getOrNull()?.validity() ?: 0) +
                (swarmType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0) +
                (if (task.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && agentName == other.agentName && description == other.description && maxLoops == other.maxLoops && memoryCapacity == other.memoryCapacity && modelName == other.modelName && numKnowledgeItems == other.numKnowledgeItems && numSamples == other.numSamples && outputType == other.outputType && swarmType == other.swarmType && systemPrompt == other.systemPrompt && task == other.task && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(agentName, description, maxLoops, memoryCapacity, modelName, numKnowledgeItems, numSamples, outputType, swarmType, systemPrompt, task, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agentName=$agentName, description=$description, maxLoops=$maxLoops, memoryCapacity=$memoryCapacity, modelName=$modelName, numKnowledgeItems=$numKnowledgeItems, numSamples=$numSamples, outputType=$outputType, swarmType=$swarmType, systemPrompt=$systemPrompt, task=$task, additionalProperties=$additionalProperties}"
    }

    /** The type of output format for the reasoning agent. */
    class OutputType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LIST = of("list")

            @JvmField val DICT = of("dict")

            @JvmField val DICTIONARY = of("dictionary")

            @JvmField val STRING = of("string")

            @JvmField val STR = of("str")

            @JvmField val FINAL = of("final")

            @JvmField val LAST = of("last")

            @JvmField val JSON = of("json")

            @JvmField val ALL = of("all")

            @JvmField val YAML = of("yaml")

            @JvmField val XML = of("xml")

            @JvmField val DICT_ALL_EXCEPT_FIRST = of("dict-all-except-first")

            @JvmField val STR_ALL_EXCEPT_FIRST = of("str-all-except-first")

            @JvmField val BASEMODEL = of("basemodel")

            @JvmField val DICT_FINAL = of("dict-final")

            @JvmField val LIST_FINAL = of("list-final")

            @JvmStatic fun of(value: String) = OutputType(JsonField.of(value))
        }

        /** An enum containing [OutputType]'s known values. */
        enum class Known {
            LIST,
            DICT,
            DICTIONARY,
            STRING,
            STR,
            FINAL,
            LAST,
            JSON,
            ALL,
            YAML,
            XML,
            DICT_ALL_EXCEPT_FIRST,
            STR_ALL_EXCEPT_FIRST,
            BASEMODEL,
            DICT_FINAL,
            LIST_FINAL,
        }

        /**
         * An enum containing [OutputType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OutputType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LIST,
            DICT,
            DICTIONARY,
            STRING,
            STR,
            FINAL,
            LAST,
            JSON,
            ALL,
            YAML,
            XML,
            DICT_ALL_EXCEPT_FIRST,
            STR_ALL_EXCEPT_FIRST,
            BASEMODEL,
            DICT_FINAL,
            LIST_FINAL,
            /**
             * An enum member indicating that [OutputType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LIST -> Value.LIST
                DICT -> Value.DICT
                DICTIONARY -> Value.DICTIONARY
                STRING -> Value.STRING
                STR -> Value.STR
                FINAL -> Value.FINAL
                LAST -> Value.LAST
                JSON -> Value.JSON
                ALL -> Value.ALL
                YAML -> Value.YAML
                XML -> Value.XML
                DICT_ALL_EXCEPT_FIRST -> Value.DICT_ALL_EXCEPT_FIRST
                STR_ALL_EXCEPT_FIRST -> Value.STR_ALL_EXCEPT_FIRST
                BASEMODEL -> Value.BASEMODEL
                DICT_FINAL -> Value.DICT_FINAL
                LIST_FINAL -> Value.LIST_FINAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SwarmsClientInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LIST -> Known.LIST
                DICT -> Known.DICT
                DICTIONARY -> Known.DICTIONARY
                STRING -> Known.STRING
                STR -> Known.STR
                FINAL -> Known.FINAL
                LAST -> Known.LAST
                JSON -> Known.JSON
                ALL -> Known.ALL
                YAML -> Known.YAML
                XML -> Known.XML
                DICT_ALL_EXCEPT_FIRST -> Known.DICT_ALL_EXCEPT_FIRST
                STR_ALL_EXCEPT_FIRST -> Known.STR_ALL_EXCEPT_FIRST
                BASEMODEL -> Known.BASEMODEL
                DICT_FINAL -> Known.DICT_FINAL
                LIST_FINAL -> Known.LIST_FINAL
                else -> throw SwarmsClientInvalidDataException("Unknown OutputType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SwarmsClientInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                SwarmsClientInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): OutputType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OutputType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of reasoning swarm to use (e.g., reasoning duo, self-consistency, IRE). */
    class SwarmType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val REASONING_DUO = of("reasoning-duo")

            @JvmField val SELF_CONSISTENCY = of("self-consistency")

            @JvmField val IRE = of("ire")

            @JvmField val REASONING_AGENT = of("reasoning-agent")

            @JvmField val CONSISTENCY_AGENT = of("consistency-agent")

            @JvmField val IRE_AGENT = of("ire-agent")

            @JvmField val REFLEXION_AGENT = of("ReflexionAgent")

            @JvmField val GKP_AGENT = of("GKPAgent")

            @JvmField val AGENT_JUDGE = of("AgentJudge")

            @JvmStatic fun of(value: String) = SwarmType(JsonField.of(value))
        }

        /** An enum containing [SwarmType]'s known values. */
        enum class Known {
            REASONING_DUO,
            SELF_CONSISTENCY,
            IRE,
            REASONING_AGENT,
            CONSISTENCY_AGENT,
            IRE_AGENT,
            REFLEXION_AGENT,
            GKP_AGENT,
            AGENT_JUDGE,
        }

        /**
         * An enum containing [SwarmType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SwarmType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REASONING_DUO,
            SELF_CONSISTENCY,
            IRE,
            REASONING_AGENT,
            CONSISTENCY_AGENT,
            IRE_AGENT,
            REFLEXION_AGENT,
            GKP_AGENT,
            AGENT_JUDGE,
            /**
             * An enum member indicating that [SwarmType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REASONING_DUO -> Value.REASONING_DUO
                SELF_CONSISTENCY -> Value.SELF_CONSISTENCY
                IRE -> Value.IRE
                REASONING_AGENT -> Value.REASONING_AGENT
                CONSISTENCY_AGENT -> Value.CONSISTENCY_AGENT
                IRE_AGENT -> Value.IRE_AGENT
                REFLEXION_AGENT -> Value.REFLEXION_AGENT
                GKP_AGENT -> Value.GKP_AGENT
                AGENT_JUDGE -> Value.AGENT_JUDGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SwarmsClientInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                REASONING_DUO -> Known.REASONING_DUO
                SELF_CONSISTENCY -> Known.SELF_CONSISTENCY
                IRE -> Known.IRE
                REASONING_AGENT -> Known.REASONING_AGENT
                CONSISTENCY_AGENT -> Known.CONSISTENCY_AGENT
                IRE_AGENT -> Known.IRE_AGENT
                REFLEXION_AGENT -> Known.REFLEXION_AGENT
                GKP_AGENT -> Known.GKP_AGENT
                AGENT_JUDGE -> Known.AGENT_JUDGE
                else -> throw SwarmsClientInvalidDataException("Unknown SwarmType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SwarmsClientInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                SwarmsClientInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): SwarmType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SwarmType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReasoningAgentCreateCompletionParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ReasoningAgentCreateCompletionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

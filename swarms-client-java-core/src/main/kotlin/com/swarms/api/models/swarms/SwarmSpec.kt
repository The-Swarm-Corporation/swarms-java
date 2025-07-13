// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.swarms

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.BaseDeserializer
import com.swarms.api.core.BaseSerializer
import com.swarms.api.core.Enum
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.allMaxBy
import com.swarms.api.core.checkKnown
import com.swarms.api.core.getOrThrow
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import com.swarms.api.models.agent.AgentSpec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SwarmSpec
private constructor(
    private val agents: JsonField<List<AgentSpec>>,
    private val description: JsonField<String>,
    private val img: JsonField<String>,
    private val maxLoops: JsonField<Long>,
    private val messages: JsonField<Messages>,
    private val name: JsonField<String>,
    private val rearrangeFlow: JsonField<String>,
    private val returnHistory: JsonField<Boolean>,
    private val rules: JsonField<String>,
    private val serviceTier: JsonField<String>,
    private val stream: JsonField<Boolean>,
    private val swarmType: JsonField<SwarmType>,
    private val task: JsonField<String>,
    private val tasks: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agents")
        @ExcludeMissing
        agents: JsonField<List<AgentSpec>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("img") @ExcludeMissing img: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_loops") @ExcludeMissing maxLoops: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("messages") @ExcludeMissing messages: JsonField<Messages> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rearrange_flow")
        @ExcludeMissing
        rearrangeFlow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_history")
        @ExcludeMissing
        returnHistory: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rules") @ExcludeMissing rules: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_tier")
        @ExcludeMissing
        serviceTier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("swarm_type")
        @ExcludeMissing
        swarmType: JsonField<SwarmType> = JsonMissing.of(),
        @JsonProperty("task") @ExcludeMissing task: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tasks") @ExcludeMissing tasks: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        agents,
        description,
        img,
        maxLoops,
        messages,
        name,
        rearrangeFlow,
        returnHistory,
        rules,
        serviceTier,
        stream,
        swarmType,
        task,
        tasks,
        mutableMapOf(),
    )

    /**
     * A list of agents or specifications that define the agents participating in the swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun agents(): Optional<List<AgentSpec>> = agents.getOptional("agents")

    /**
     * A comprehensive description of the swarm's objectives, capabilities, and intended outcomes.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * An optional image URL that may be associated with the swarm's task or representation.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun img(): Optional<String> = img.getOptional("img")

    /**
     * The maximum number of execution loops allowed for the swarm, enabling repeated processing if
     * needed.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxLoops(): Optional<Long> = maxLoops.getOptional("max_loops")

    /**
     * A list of messages that the swarm should complete.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun messages(): Optional<Messages> = messages.getOptional("messages")

    /**
     * The name of the swarm, which serves as an identifier for the group of agents and their
     * collective task.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Instructions on how to rearrange the flow of tasks among agents, if applicable.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rearrangeFlow(): Optional<String> = rearrangeFlow.getOptional("rearrange_flow")

    /**
     * A flag indicating whether the swarm should return its execution history along with the final
     * output.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnHistory(): Optional<Boolean> = returnHistory.getOptional("return_history")

    /**
     * Guidelines or constraints that govern the behavior and interactions of the agents within the
     * swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rules(): Optional<String> = rules.getOptional("rules")

    /**
     * The service tier to use for processing. Options: 'standard' (default) or 'flex' for lower
     * cost but slower processing.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun serviceTier(): Optional<String> = serviceTier.getOptional("service_tier")

    /**
     * A flag indicating whether the swarm should stream its output.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = stream.getOptional("stream")

    /**
     * The classification of the swarm, indicating its operational style and methodology.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun swarmType(): Optional<SwarmType> = swarmType.getOptional("swarm_type")

    /**
     * The specific task or objective that the swarm is designed to accomplish.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun task(): Optional<String> = task.getOptional("task")

    /**
     * A list of tasks that the swarm should complete.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tasks(): Optional<List<String>> = tasks.getOptional("tasks")

    /**
     * Returns the raw JSON value of [agents].
     *
     * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agents") @ExcludeMissing fun _agents(): JsonField<List<AgentSpec>> = agents

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [img].
     *
     * Unlike [img], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("img") @ExcludeMissing fun _img(): JsonField<String> = img

    /**
     * Returns the raw JSON value of [maxLoops].
     *
     * Unlike [maxLoops], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_loops") @ExcludeMissing fun _maxLoops(): JsonField<Long> = maxLoops

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages") @ExcludeMissing fun _messages(): JsonField<Messages> = messages

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [rearrangeFlow].
     *
     * Unlike [rearrangeFlow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rearrange_flow")
    @ExcludeMissing
    fun _rearrangeFlow(): JsonField<String> = rearrangeFlow

    /**
     * Returns the raw JSON value of [returnHistory].
     *
     * Unlike [returnHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("return_history")
    @ExcludeMissing
    fun _returnHistory(): JsonField<Boolean> = returnHistory

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<String> = rules

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_tier")
    @ExcludeMissing
    fun _serviceTier(): JsonField<String> = serviceTier

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

    /**
     * Returns the raw JSON value of [swarmType].
     *
     * Unlike [swarmType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swarm_type") @ExcludeMissing fun _swarmType(): JsonField<SwarmType> = swarmType

    /**
     * Returns the raw JSON value of [task].
     *
     * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<String> = task

    /**
     * Returns the raw JSON value of [tasks].
     *
     * Unlike [tasks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tasks") @ExcludeMissing fun _tasks(): JsonField<List<String>> = tasks

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

        /** Returns a mutable builder for constructing an instance of [SwarmSpec]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SwarmSpec]. */
    class Builder internal constructor() {

        private var agents: JsonField<MutableList<AgentSpec>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var img: JsonField<String> = JsonMissing.of()
        private var maxLoops: JsonField<Long> = JsonMissing.of()
        private var messages: JsonField<Messages> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var rearrangeFlow: JsonField<String> = JsonMissing.of()
        private var returnHistory: JsonField<Boolean> = JsonMissing.of()
        private var rules: JsonField<String> = JsonMissing.of()
        private var serviceTier: JsonField<String> = JsonMissing.of()
        private var stream: JsonField<Boolean> = JsonMissing.of()
        private var swarmType: JsonField<SwarmType> = JsonMissing.of()
        private var task: JsonField<String> = JsonMissing.of()
        private var tasks: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(swarmSpec: SwarmSpec) = apply {
            agents = swarmSpec.agents.map { it.toMutableList() }
            description = swarmSpec.description
            img = swarmSpec.img
            maxLoops = swarmSpec.maxLoops
            messages = swarmSpec.messages
            name = swarmSpec.name
            rearrangeFlow = swarmSpec.rearrangeFlow
            returnHistory = swarmSpec.returnHistory
            rules = swarmSpec.rules
            serviceTier = swarmSpec.serviceTier
            stream = swarmSpec.stream
            swarmType = swarmSpec.swarmType
            task = swarmSpec.task
            tasks = swarmSpec.tasks.map { it.toMutableList() }
            additionalProperties = swarmSpec.additionalProperties.toMutableMap()
        }

        /** A list of agents or specifications that define the agents participating in the swarm. */
        fun agents(agents: List<AgentSpec>?) = agents(JsonField.ofNullable(agents))

        /** Alias for calling [Builder.agents] with `agents.orElse(null)`. */
        fun agents(agents: Optional<List<AgentSpec>>) = agents(agents.getOrNull())

        /**
         * Sets [Builder.agents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agents] with a well-typed `List<AgentSpec>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agents(agents: JsonField<List<AgentSpec>>) = apply {
            this.agents = agents.map { it.toMutableList() }
        }

        /**
         * Adds a single [AgentSpec] to [agents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgent(agent: AgentSpec) = apply {
            agents =
                (agents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("agents", it).add(agent)
                }
        }

        /**
         * A comprehensive description of the swarm's objectives, capabilities, and intended
         * outcomes.
         */
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

        /** An optional image URL that may be associated with the swarm's task or representation. */
        fun img(img: String?) = img(JsonField.ofNullable(img))

        /** Alias for calling [Builder.img] with `img.orElse(null)`. */
        fun img(img: Optional<String>) = img(img.getOrNull())

        /**
         * Sets [Builder.img] to an arbitrary JSON value.
         *
         * You should usually call [Builder.img] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun img(img: JsonField<String>) = apply { this.img = img }

        /**
         * The maximum number of execution loops allowed for the swarm, enabling repeated processing
         * if needed.
         */
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
         * You should usually call [Builder.maxLoops] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxLoops(maxLoops: JsonField<Long>) = apply { this.maxLoops = maxLoops }

        /** A list of messages that the swarm should complete. */
        fun messages(messages: Messages?) = messages(JsonField.ofNullable(messages))

        /** Alias for calling [Builder.messages] with `messages.orElse(null)`. */
        fun messages(messages: Optional<Messages>) = messages(messages.getOrNull())

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed [Messages] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messages(messages: JsonField<Messages>) = apply { this.messages = messages }

        /**
         * Alias for calling [messages] with
         * `Messages.ofUnnamedSchemaWithArrayParent1s(unnamedSchemaWithArrayParent1s)`.
         */
        fun messagesOfUnnamedSchemaWithArrayParent1s(
            unnamedSchemaWithArrayParent1s: List<Messages.UnnamedSchemaWithArrayParent1>
        ) = messages(Messages.ofUnnamedSchemaWithArrayParent1s(unnamedSchemaWithArrayParent1s))

        /** Alias for calling [messages] with `Messages.ofUnionMember1(unionMember1)`. */
        fun messages(unionMember1: Messages.UnionMember1) =
            messages(Messages.ofUnionMember1(unionMember1))

        /**
         * The name of the swarm, which serves as an identifier for the group of agents and their
         * collective task.
         */
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

        /** Instructions on how to rearrange the flow of tasks among agents, if applicable. */
        fun rearrangeFlow(rearrangeFlow: String?) =
            rearrangeFlow(JsonField.ofNullable(rearrangeFlow))

        /** Alias for calling [Builder.rearrangeFlow] with `rearrangeFlow.orElse(null)`. */
        fun rearrangeFlow(rearrangeFlow: Optional<String>) =
            rearrangeFlow(rearrangeFlow.getOrNull())

        /**
         * Sets [Builder.rearrangeFlow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rearrangeFlow] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rearrangeFlow(rearrangeFlow: JsonField<String>) = apply {
            this.rearrangeFlow = rearrangeFlow
        }

        /**
         * A flag indicating whether the swarm should return its execution history along with the
         * final output.
         */
        fun returnHistory(returnHistory: Boolean?) =
            returnHistory(JsonField.ofNullable(returnHistory))

        /**
         * Alias for [Builder.returnHistory].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun returnHistory(returnHistory: Boolean) = returnHistory(returnHistory as Boolean?)

        /** Alias for calling [Builder.returnHistory] with `returnHistory.orElse(null)`. */
        fun returnHistory(returnHistory: Optional<Boolean>) =
            returnHistory(returnHistory.getOrNull())

        /**
         * Sets [Builder.returnHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnHistory] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnHistory(returnHistory: JsonField<Boolean>) = apply {
            this.returnHistory = returnHistory
        }

        /**
         * Guidelines or constraints that govern the behavior and interactions of the agents within
         * the swarm.
         */
        fun rules(rules: String?) = rules(JsonField.ofNullable(rules))

        /** Alias for calling [Builder.rules] with `rules.orElse(null)`. */
        fun rules(rules: Optional<String>) = rules(rules.getOrNull())

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rules(rules: JsonField<String>) = apply { this.rules = rules }

        /**
         * The service tier to use for processing. Options: 'standard' (default) or 'flex' for lower
         * cost but slower processing.
         */
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

        /** A flag indicating whether the swarm should stream its output. */
        fun stream(stream: Boolean?) = stream(JsonField.ofNullable(stream))

        /**
         * Alias for [Builder.stream].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stream(stream: Boolean) = stream(stream as Boolean?)

        /** Alias for calling [Builder.stream] with `stream.orElse(null)`. */
        fun stream(stream: Optional<Boolean>) = stream(stream.getOrNull())

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

        /** The classification of the swarm, indicating its operational style and methodology. */
        fun swarmType(swarmType: SwarmType?) = swarmType(JsonField.ofNullable(swarmType))

        /** Alias for calling [Builder.swarmType] with `swarmType.orElse(null)`. */
        fun swarmType(swarmType: Optional<SwarmType>) = swarmType(swarmType.getOrNull())

        /**
         * Sets [Builder.swarmType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swarmType] with a well-typed [SwarmType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun swarmType(swarmType: JsonField<SwarmType>) = apply { this.swarmType = swarmType }

        /** The specific task or objective that the swarm is designed to accomplish. */
        fun task(task: String?) = task(JsonField.ofNullable(task))

        /** Alias for calling [Builder.task] with `task.orElse(null)`. */
        fun task(task: Optional<String>) = task(task.getOrNull())

        /**
         * Sets [Builder.task] to an arbitrary JSON value.
         *
         * You should usually call [Builder.task] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun task(task: JsonField<String>) = apply { this.task = task }

        /** A list of tasks that the swarm should complete. */
        fun tasks(tasks: List<String>?) = tasks(JsonField.ofNullable(tasks))

        /** Alias for calling [Builder.tasks] with `tasks.orElse(null)`. */
        fun tasks(tasks: Optional<List<String>>) = tasks(tasks.getOrNull())

        /**
         * Sets [Builder.tasks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tasks] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tasks(tasks: JsonField<List<String>>) = apply {
            this.tasks = tasks.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tasks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTask(task: String) = apply {
            tasks =
                (tasks ?: JsonField.of(mutableListOf())).also { checkKnown("tasks", it).add(task) }
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
         * Returns an immutable instance of [SwarmSpec].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SwarmSpec =
            SwarmSpec(
                (agents ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                img,
                maxLoops,
                messages,
                name,
                rearrangeFlow,
                returnHistory,
                rules,
                serviceTier,
                stream,
                swarmType,
                task,
                (tasks ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SwarmSpec = apply {
        if (validated) {
            return@apply
        }

        agents().ifPresent { it.forEach { it.validate() } }
        description()
        img()
        maxLoops()
        messages().ifPresent { it.validate() }
        name()
        rearrangeFlow()
        returnHistory()
        rules()
        serviceTier()
        stream()
        swarmType().ifPresent { it.validate() }
        task()
        tasks()
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
        (agents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (img.asKnown().isPresent) 1 else 0) +
            (if (maxLoops.asKnown().isPresent) 1 else 0) +
            (messages.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (rearrangeFlow.asKnown().isPresent) 1 else 0) +
            (if (returnHistory.asKnown().isPresent) 1 else 0) +
            (if (rules.asKnown().isPresent) 1 else 0) +
            (if (serviceTier.asKnown().isPresent) 1 else 0) +
            (if (stream.asKnown().isPresent) 1 else 0) +
            (swarmType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (task.asKnown().isPresent) 1 else 0) +
            (tasks.asKnown().getOrNull()?.size ?: 0)

    /** A list of messages that the swarm should complete. */
    @JsonDeserialize(using = Messages.Deserializer::class)
    @JsonSerialize(using = Messages.Serializer::class)
    class Messages
    private constructor(
        private val unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unnamedSchemaWithArrayParent1s(): Optional<List<UnnamedSchemaWithArrayParent1>> =
            Optional.ofNullable(unnamedSchemaWithArrayParent1s)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isUnnamedSchemaWithArrayParent1s(): Boolean = unnamedSchemaWithArrayParent1s != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asUnnamedSchemaWithArrayParent1s(): List<UnnamedSchemaWithArrayParent1> =
            unnamedSchemaWithArrayParent1s.getOrThrow("unnamedSchemaWithArrayParent1s")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unnamedSchemaWithArrayParent1s != null ->
                    visitor.visitUnnamedSchemaWithArrayParent1s(unnamedSchemaWithArrayParent1s)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Messages = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnnamedSchemaWithArrayParent1s(
                        unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
                    ) {
                        unnamedSchemaWithArrayParent1s.forEach { it.validate() }
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnnamedSchemaWithArrayParent1s(
                        unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
                    ) = unnamedSchemaWithArrayParent1s.sumOf { it.validity().toInt() }

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Messages && unnamedSchemaWithArrayParent1s == other.unnamedSchemaWithArrayParent1s && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(unnamedSchemaWithArrayParent1s, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                unnamedSchemaWithArrayParent1s != null ->
                    "Messages{unnamedSchemaWithArrayParent1s=$unnamedSchemaWithArrayParent1s}"
                unionMember1 != null -> "Messages{unionMember1=$unionMember1}"
                _json != null -> "Messages{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Messages")
            }

        companion object {

            @JvmStatic
            fun ofUnnamedSchemaWithArrayParent1s(
                unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
            ) = Messages(unnamedSchemaWithArrayParent1s = unnamedSchemaWithArrayParent1s)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Messages(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [Messages] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnnamedSchemaWithArrayParent1s(
                unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1>
            ): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [Messages] to a value of type [T].
             *
             * An instance of [Messages] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws SwarmsClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SwarmsClientInvalidDataException("Unknown Messages: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Messages>(Messages::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Messages {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Messages(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<UnnamedSchemaWithArrayParent1>>(),
                                )
                                ?.let {
                                    Messages(unnamedSchemaWithArrayParent1s = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Messages(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Messages>(Messages::class) {

            override fun serialize(
                value: Messages,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unnamedSchemaWithArrayParent1s != null ->
                        generator.writeObject(value.unnamedSchemaWithArrayParent1s)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Messages")
                }
            }
        }

        class UnnamedSchemaWithArrayParent1
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [UnnamedSchemaWithArrayParent1].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnnamedSchemaWithArrayParent1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unnamedSchemaWithArrayParent1: UnnamedSchemaWithArrayParent1) =
                    apply {
                        additionalProperties =
                            unnamedSchemaWithArrayParent1.additionalProperties.toMutableMap()
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnnamedSchemaWithArrayParent1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnnamedSchemaWithArrayParent1 =
                    UnnamedSchemaWithArrayParent1(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnnamedSchemaWithArrayParent1 = apply {
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

                return /* spotless:off */ other is UnnamedSchemaWithArrayParent1 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnnamedSchemaWithArrayParent1{additionalProperties=$additionalProperties}"
        }

        class UnionMember1
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

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
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

                return /* spotless:off */ other is UnionMember1 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    /** The classification of the swarm, indicating its operational style and methodology. */
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

            @JvmField val AGENT_REARRANGE = of("AgentRearrange")

            @JvmField val MIXTURE_OF_AGENTS = of("MixtureOfAgents")

            @JvmField val SPREAD_SHEET_SWARM = of("SpreadSheetSwarm")

            @JvmField val SEQUENTIAL_WORKFLOW = of("SequentialWorkflow")

            @JvmField val CONCURRENT_WORKFLOW = of("ConcurrentWorkflow")

            @JvmField val GROUP_CHAT = of("GroupChat")

            @JvmField val MULTI_AGENT_ROUTER = of("MultiAgentRouter")

            @JvmField val AUTO_SWARM_BUILDER = of("AutoSwarmBuilder")

            @JvmField val HIEARCHICAL_SWARM = of("HiearchicalSwarm")

            @JvmField val AUTO = of("auto")

            @JvmField val MAJORITY_VOTING = of("MajorityVoting")

            @JvmField val MALT = of("MALT")

            @JvmField val DEEP_RESEARCH_SWARM = of("DeepResearchSwarm")

            @JvmField val COUNCIL_AS_A_JUDGE = of("CouncilAsAJudge")

            @JvmField val INTERACTIVE_GROUP_CHAT = of("InteractiveGroupChat")

            @JvmStatic fun of(value: String) = SwarmType(JsonField.of(value))
        }

        /** An enum containing [SwarmType]'s known values. */
        enum class Known {
            AGENT_REARRANGE,
            MIXTURE_OF_AGENTS,
            SPREAD_SHEET_SWARM,
            SEQUENTIAL_WORKFLOW,
            CONCURRENT_WORKFLOW,
            GROUP_CHAT,
            MULTI_AGENT_ROUTER,
            AUTO_SWARM_BUILDER,
            HIEARCHICAL_SWARM,
            AUTO,
            MAJORITY_VOTING,
            MALT,
            DEEP_RESEARCH_SWARM,
            COUNCIL_AS_A_JUDGE,
            INTERACTIVE_GROUP_CHAT,
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
            AGENT_REARRANGE,
            MIXTURE_OF_AGENTS,
            SPREAD_SHEET_SWARM,
            SEQUENTIAL_WORKFLOW,
            CONCURRENT_WORKFLOW,
            GROUP_CHAT,
            MULTI_AGENT_ROUTER,
            AUTO_SWARM_BUILDER,
            HIEARCHICAL_SWARM,
            AUTO,
            MAJORITY_VOTING,
            MALT,
            DEEP_RESEARCH_SWARM,
            COUNCIL_AS_A_JUDGE,
            INTERACTIVE_GROUP_CHAT,
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
                AGENT_REARRANGE -> Value.AGENT_REARRANGE
                MIXTURE_OF_AGENTS -> Value.MIXTURE_OF_AGENTS
                SPREAD_SHEET_SWARM -> Value.SPREAD_SHEET_SWARM
                SEQUENTIAL_WORKFLOW -> Value.SEQUENTIAL_WORKFLOW
                CONCURRENT_WORKFLOW -> Value.CONCURRENT_WORKFLOW
                GROUP_CHAT -> Value.GROUP_CHAT
                MULTI_AGENT_ROUTER -> Value.MULTI_AGENT_ROUTER
                AUTO_SWARM_BUILDER -> Value.AUTO_SWARM_BUILDER
                HIEARCHICAL_SWARM -> Value.HIEARCHICAL_SWARM
                AUTO -> Value.AUTO
                MAJORITY_VOTING -> Value.MAJORITY_VOTING
                MALT -> Value.MALT
                DEEP_RESEARCH_SWARM -> Value.DEEP_RESEARCH_SWARM
                COUNCIL_AS_A_JUDGE -> Value.COUNCIL_AS_A_JUDGE
                INTERACTIVE_GROUP_CHAT -> Value.INTERACTIVE_GROUP_CHAT
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
                AGENT_REARRANGE -> Known.AGENT_REARRANGE
                MIXTURE_OF_AGENTS -> Known.MIXTURE_OF_AGENTS
                SPREAD_SHEET_SWARM -> Known.SPREAD_SHEET_SWARM
                SEQUENTIAL_WORKFLOW -> Known.SEQUENTIAL_WORKFLOW
                CONCURRENT_WORKFLOW -> Known.CONCURRENT_WORKFLOW
                GROUP_CHAT -> Known.GROUP_CHAT
                MULTI_AGENT_ROUTER -> Known.MULTI_AGENT_ROUTER
                AUTO_SWARM_BUILDER -> Known.AUTO_SWARM_BUILDER
                HIEARCHICAL_SWARM -> Known.HIEARCHICAL_SWARM
                AUTO -> Known.AUTO
                MAJORITY_VOTING -> Known.MAJORITY_VOTING
                MALT -> Known.MALT
                DEEP_RESEARCH_SWARM -> Known.DEEP_RESEARCH_SWARM
                COUNCIL_AS_A_JUDGE -> Known.COUNCIL_AS_A_JUDGE
                INTERACTIVE_GROUP_CHAT -> Known.INTERACTIVE_GROUP_CHAT
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

        return /* spotless:off */ other is SwarmSpec && agents == other.agents && description == other.description && img == other.img && maxLoops == other.maxLoops && messages == other.messages && name == other.name && rearrangeFlow == other.rearrangeFlow && returnHistory == other.returnHistory && rules == other.rules && serviceTier == other.serviceTier && stream == other.stream && swarmType == other.swarmType && task == other.task && tasks == other.tasks && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(agents, description, img, maxLoops, messages, name, rearrangeFlow, returnHistory, rules, serviceTier, stream, swarmType, task, tasks, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SwarmSpec{agents=$agents, description=$description, img=$img, maxLoops=$maxLoops, messages=$messages, name=$name, rearrangeFlow=$rearrangeFlow, returnHistory=$returnHistory, rules=$rules, serviceTier=$serviceTier, stream=$stream, swarmType=$swarmType, task=$task, tasks=$tasks, additionalProperties=$additionalProperties}"
}

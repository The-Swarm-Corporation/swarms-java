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
import com.swarms.api.core.Params
import com.swarms.api.core.checkKnown
import com.swarms.api.core.http.Headers
import com.swarms.api.core.http.QueryParams
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import com.swarms.api.models.agent.AgentSpec
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Complete a batched grid workflow with the specified input data. Enables you to run a grid
 * workflow with multiple agents and tasks in a single request.
 */
class BatchedGridWorkflowCompleteWorkflowParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The agent completions to be completed by the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun agentCompletions(): Optional<List<AgentSpec>> = body.agentCompletions()

    /**
     * The description of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The images to be used by the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun imgs(): Optional<List<String>> = body.imgs()

    /**
     * The maximum number of loops to be completed by the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxLoops(): Optional<Long> = body.maxLoops()

    /**
     * The name of the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * The tasks to be completed by the batched grid workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tasks(): Optional<List<String>> = body.tasks()

    /**
     * Returns the raw JSON value of [agentCompletions].
     *
     * Unlike [agentCompletions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _agentCompletions(): JsonField<List<AgentSpec>> = body._agentCompletions()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [imgs].
     *
     * Unlike [imgs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _imgs(): JsonField<List<String>> = body._imgs()

    /**
     * Returns the raw JSON value of [maxLoops].
     *
     * Unlike [maxLoops], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxLoops(): JsonField<Long> = body._maxLoops()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [tasks].
     *
     * Unlike [tasks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tasks(): JsonField<List<String>> = body._tasks()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BatchedGridWorkflowCompleteWorkflowParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BatchedGridWorkflowCompleteWorkflowParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchedGridWorkflowCompleteWorkflowParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            batchedGridWorkflowCompleteWorkflowParams: BatchedGridWorkflowCompleteWorkflowParams
        ) = apply {
            body = batchedGridWorkflowCompleteWorkflowParams.body.toBuilder()
            additionalHeaders =
                batchedGridWorkflowCompleteWorkflowParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                batchedGridWorkflowCompleteWorkflowParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agentCompletions]
         * - [description]
         * - [imgs]
         * - [maxLoops]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The agent completions to be completed by the batched grid workflow. */
        fun agentCompletions(agentCompletions: List<AgentSpec>?) = apply {
            body.agentCompletions(agentCompletions)
        }

        /** Alias for calling [Builder.agentCompletions] with `agentCompletions.orElse(null)`. */
        fun agentCompletions(agentCompletions: Optional<List<AgentSpec>>) =
            agentCompletions(agentCompletions.getOrNull())

        /**
         * Sets [Builder.agentCompletions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentCompletions] with a well-typed `List<AgentSpec>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun agentCompletions(agentCompletions: JsonField<List<AgentSpec>>) = apply {
            body.agentCompletions(agentCompletions)
        }

        /**
         * Adds a single [AgentSpec] to [agentCompletions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgentCompletion(agentCompletion: AgentSpec) = apply {
            body.addAgentCompletion(agentCompletion)
        }

        /** The description of the batched grid workflow. */
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

        /** The images to be used by the batched grid workflow. */
        fun imgs(imgs: List<String>?) = apply { body.imgs(imgs) }

        /** Alias for calling [Builder.imgs] with `imgs.orElse(null)`. */
        fun imgs(imgs: Optional<List<String>>) = imgs(imgs.getOrNull())

        /**
         * Sets [Builder.imgs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imgs] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imgs(imgs: JsonField<List<String>>) = apply { body.imgs(imgs) }

        /**
         * Adds a single [String] to [imgs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addImg(img: String) = apply { body.addImg(img) }

        /** The maximum number of loops to be completed by the batched grid workflow. */
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

        /** The name of the batched grid workflow. */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The tasks to be completed by the batched grid workflow. */
        fun tasks(tasks: List<String>?) = apply { body.tasks(tasks) }

        /** Alias for calling [Builder.tasks] with `tasks.orElse(null)`. */
        fun tasks(tasks: Optional<List<String>>) = tasks(tasks.getOrNull())

        /**
         * Sets [Builder.tasks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tasks] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tasks(tasks: JsonField<List<String>>) = apply { body.tasks(tasks) }

        /**
         * Adds a single [String] to [tasks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTask(task: String) = apply { body.addTask(task) }

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
         * Returns an immutable instance of [BatchedGridWorkflowCompleteWorkflowParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BatchedGridWorkflowCompleteWorkflowParams =
            BatchedGridWorkflowCompleteWorkflowParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentCompletions: JsonField<List<AgentSpec>>,
        private val description: JsonField<String>,
        private val imgs: JsonField<List<String>>,
        private val maxLoops: JsonField<Long>,
        private val name: JsonField<String>,
        private val tasks: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_completions")
            @ExcludeMissing
            agentCompletions: JsonField<List<AgentSpec>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("imgs") @ExcludeMissing imgs: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("max_loops") @ExcludeMissing maxLoops: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tasks") @ExcludeMissing tasks: JsonField<List<String>> = JsonMissing.of(),
        ) : this(agentCompletions, description, imgs, maxLoops, name, tasks, mutableMapOf())

        /**
         * The agent completions to be completed by the batched grid workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun agentCompletions(): Optional<List<AgentSpec>> =
            agentCompletions.getOptional("agent_completions")

        /**
         * The description of the batched grid workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The images to be used by the batched grid workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun imgs(): Optional<List<String>> = imgs.getOptional("imgs")

        /**
         * The maximum number of loops to be completed by the batched grid workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxLoops(): Optional<Long> = maxLoops.getOptional("max_loops")

        /**
         * The name of the batched grid workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The tasks to be completed by the batched grid workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tasks(): Optional<List<String>> = tasks.getOptional("tasks")

        /**
         * Returns the raw JSON value of [agentCompletions].
         *
         * Unlike [agentCompletions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agent_completions")
        @ExcludeMissing
        fun _agentCompletions(): JsonField<List<AgentSpec>> = agentCompletions

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [imgs].
         *
         * Unlike [imgs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("imgs") @ExcludeMissing fun _imgs(): JsonField<List<String>> = imgs

        /**
         * Returns the raw JSON value of [maxLoops].
         *
         * Unlike [maxLoops], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_loops") @ExcludeMissing fun _maxLoops(): JsonField<Long> = maxLoops

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var agentCompletions: JsonField<MutableList<AgentSpec>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var imgs: JsonField<MutableList<String>>? = null
            private var maxLoops: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var tasks: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agentCompletions = body.agentCompletions.map { it.toMutableList() }
                description = body.description
                imgs = body.imgs.map { it.toMutableList() }
                maxLoops = body.maxLoops
                name = body.name
                tasks = body.tasks.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The agent completions to be completed by the batched grid workflow. */
            fun agentCompletions(agentCompletions: List<AgentSpec>?) =
                agentCompletions(JsonField.ofNullable(agentCompletions))

            /**
             * Alias for calling [Builder.agentCompletions] with `agentCompletions.orElse(null)`.
             */
            fun agentCompletions(agentCompletions: Optional<List<AgentSpec>>) =
                agentCompletions(agentCompletions.getOrNull())

            /**
             * Sets [Builder.agentCompletions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentCompletions] with a well-typed
             * `List<AgentSpec>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun agentCompletions(agentCompletions: JsonField<List<AgentSpec>>) = apply {
                this.agentCompletions = agentCompletions.map { it.toMutableList() }
            }

            /**
             * Adds a single [AgentSpec] to [agentCompletions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAgentCompletion(agentCompletion: AgentSpec) = apply {
                agentCompletions =
                    (agentCompletions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("agentCompletions", it).add(agentCompletion)
                    }
            }

            /** The description of the batched grid workflow. */
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

            /** The images to be used by the batched grid workflow. */
            fun imgs(imgs: List<String>?) = imgs(JsonField.ofNullable(imgs))

            /** Alias for calling [Builder.imgs] with `imgs.orElse(null)`. */
            fun imgs(imgs: Optional<List<String>>) = imgs(imgs.getOrNull())

            /**
             * Sets [Builder.imgs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imgs] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imgs(imgs: JsonField<List<String>>) = apply {
                this.imgs = imgs.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [imgs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addImg(img: String) = apply {
                imgs =
                    (imgs ?: JsonField.of(mutableListOf())).also { checkKnown("imgs", it).add(img) }
            }

            /** The maximum number of loops to be completed by the batched grid workflow. */
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

            /** The name of the batched grid workflow. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The tasks to be completed by the batched grid workflow. */
            fun tasks(tasks: List<String>?) = tasks(JsonField.ofNullable(tasks))

            /** Alias for calling [Builder.tasks] with `tasks.orElse(null)`. */
            fun tasks(tasks: Optional<List<String>>) = tasks(tasks.getOrNull())

            /**
             * Sets [Builder.tasks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tasks] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (tasks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tasks", it).add(task)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (agentCompletions ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    (imgs ?: JsonMissing.of()).map { it.toImmutable() },
                    maxLoops,
                    name,
                    (tasks ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            agentCompletions().ifPresent { it.forEach { it.validate() } }
            description()
            imgs()
            maxLoops()
            name()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (agentCompletions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (imgs.asKnown().getOrNull()?.size ?: 0) +
                (if (maxLoops.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (tasks.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agentCompletions == other.agentCompletions &&
                description == other.description &&
                imgs == other.imgs &&
                maxLoops == other.maxLoops &&
                name == other.name &&
                tasks == other.tasks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agentCompletions,
                description,
                imgs,
                maxLoops,
                name,
                tasks,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agentCompletions=$agentCompletions, description=$description, imgs=$imgs, maxLoops=$maxLoops, name=$name, tasks=$tasks, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchedGridWorkflowCompleteWorkflowParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BatchedGridWorkflowCompleteWorkflowParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

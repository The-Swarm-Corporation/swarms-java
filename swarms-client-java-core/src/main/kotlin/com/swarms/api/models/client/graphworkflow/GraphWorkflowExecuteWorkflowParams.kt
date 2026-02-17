// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.graphworkflow

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
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.Params
import com.swarms.api.core.allMaxBy
import com.swarms.api.core.checkKnown
import com.swarms.api.core.checkRequired
import com.swarms.api.core.getOrThrow
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
 * Execute a graph workflow with directed agent nodes and edges. Enables complex multi-agent
 * collaboration with parallel execution, automatic compilation, and comprehensive workflow
 * orchestration.
 */
class GraphWorkflowExecuteWorkflowParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of agent specifications to be used as nodes in the workflow graph.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun agents(): Optional<List<AgentSpec>> = body.agents()

    /**
     * Whether to automatically compile the workflow for optimization.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun autoCompile(): Optional<Boolean> = body.autoCompile()

    /**
     * The description of the graph workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * List of edges connecting nodes. Can be EdgeSpec objects or dictionaries with 'source' and
     * 'target' keys.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun edges(): Optional<List<Edge>> = body.edges()

    /**
     * List of node IDs that serve as ending points for the workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endPoints(): Optional<List<String>> = body.endPoints()

    /**
     * List of node IDs that serve as starting points for the workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun entryPoints(): Optional<List<String>> = body.entryPoints()

    /**
     * Optional image path for vision-enabled agents.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun img(): Optional<String> = body.img()

    /**
     * The maximum number of execution loops for the workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxLoops(): Optional<Long> = body.maxLoops()

    /**
     * The name of the graph workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * The task to be executed by the workflow.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun task(): Optional<String> = body.task()

    /**
     * Whether to enable detailed logging.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun verbose(): Optional<Boolean> = body.verbose()

    /**
     * Returns the raw JSON value of [agents].
     *
     * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agents(): JsonField<List<AgentSpec>> = body._agents()

    /**
     * Returns the raw JSON value of [autoCompile].
     *
     * Unlike [autoCompile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoCompile(): JsonField<Boolean> = body._autoCompile()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [edges].
     *
     * Unlike [edges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _edges(): JsonField<List<Edge>> = body._edges()

    /**
     * Returns the raw JSON value of [endPoints].
     *
     * Unlike [endPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endPoints(): JsonField<List<String>> = body._endPoints()

    /**
     * Returns the raw JSON value of [entryPoints].
     *
     * Unlike [entryPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entryPoints(): JsonField<List<String>> = body._entryPoints()

    /**
     * Returns the raw JSON value of [img].
     *
     * Unlike [img], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _img(): JsonField<String> = body._img()

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
     * Returns the raw JSON value of [task].
     *
     * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _task(): JsonField<String> = body._task()

    /**
     * Returns the raw JSON value of [verbose].
     *
     * Unlike [verbose], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _verbose(): JsonField<Boolean> = body._verbose()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): GraphWorkflowExecuteWorkflowParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [GraphWorkflowExecuteWorkflowParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GraphWorkflowExecuteWorkflowParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(graphWorkflowExecuteWorkflowParams: GraphWorkflowExecuteWorkflowParams) =
            apply {
                body = graphWorkflowExecuteWorkflowParams.body.toBuilder()
                additionalHeaders = graphWorkflowExecuteWorkflowParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    graphWorkflowExecuteWorkflowParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agents]
         * - [autoCompile]
         * - [description]
         * - [edges]
         * - [endPoints]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of agent specifications to be used as nodes in the workflow graph. */
        fun agents(agents: List<AgentSpec>?) = apply { body.agents(agents) }

        /** Alias for calling [Builder.agents] with `agents.orElse(null)`. */
        fun agents(agents: Optional<List<AgentSpec>>) = agents(agents.getOrNull())

        /**
         * Sets [Builder.agents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agents] with a well-typed `List<AgentSpec>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agents(agents: JsonField<List<AgentSpec>>) = apply { body.agents(agents) }

        /**
         * Adds a single [AgentSpec] to [agents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAgent(agent: AgentSpec) = apply { body.addAgent(agent) }

        /** Whether to automatically compile the workflow for optimization. */
        fun autoCompile(autoCompile: Boolean?) = apply { body.autoCompile(autoCompile) }

        /**
         * Alias for [Builder.autoCompile].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoCompile(autoCompile: Boolean) = autoCompile(autoCompile as Boolean?)

        /** Alias for calling [Builder.autoCompile] with `autoCompile.orElse(null)`. */
        fun autoCompile(autoCompile: Optional<Boolean>) = autoCompile(autoCompile.getOrNull())

        /**
         * Sets [Builder.autoCompile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCompile] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoCompile(autoCompile: JsonField<Boolean>) = apply { body.autoCompile(autoCompile) }

        /** The description of the graph workflow. */
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

        /**
         * List of edges connecting nodes. Can be EdgeSpec objects or dictionaries with 'source' and
         * 'target' keys.
         */
        fun edges(edges: List<Edge>?) = apply { body.edges(edges) }

        /** Alias for calling [Builder.edges] with `edges.orElse(null)`. */
        fun edges(edges: Optional<List<Edge>>) = edges(edges.getOrNull())

        /**
         * Sets [Builder.edges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edges] with a well-typed `List<Edge>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun edges(edges: JsonField<List<Edge>>) = apply { body.edges(edges) }

        /**
         * Adds a single [Edge] to [edges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEdge(edge: Edge) = apply { body.addEdge(edge) }

        /** Alias for calling [addEdge] with `Edge.ofSpec(spec)`. */
        fun addEdge(spec: Edge.EdgeSpec) = apply { body.addEdge(spec) }

        /** Alias for calling [addEdge] with `Edge.ofUnionMember1(unionMember1)`. */
        fun addEdge(unionMember1: Edge.UnionMember1) = apply { body.addEdge(unionMember1) }

        /** List of node IDs that serve as ending points for the workflow. */
        fun endPoints(endPoints: List<String>?) = apply { body.endPoints(endPoints) }

        /** Alias for calling [Builder.endPoints] with `endPoints.orElse(null)`. */
        fun endPoints(endPoints: Optional<List<String>>) = endPoints(endPoints.getOrNull())

        /**
         * Sets [Builder.endPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPoints] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endPoints(endPoints: JsonField<List<String>>) = apply { body.endPoints(endPoints) }

        /**
         * Adds a single [String] to [endPoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEndPoint(endPoint: String) = apply { body.addEndPoint(endPoint) }

        /** List of node IDs that serve as starting points for the workflow. */
        fun entryPoints(entryPoints: List<String>?) = apply { body.entryPoints(entryPoints) }

        /** Alias for calling [Builder.entryPoints] with `entryPoints.orElse(null)`. */
        fun entryPoints(entryPoints: Optional<List<String>>) = entryPoints(entryPoints.getOrNull())

        /**
         * Sets [Builder.entryPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entryPoints] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entryPoints(entryPoints: JsonField<List<String>>) = apply {
            body.entryPoints(entryPoints)
        }

        /**
         * Adds a single [String] to [entryPoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntryPoint(entryPoint: String) = apply { body.addEntryPoint(entryPoint) }

        /** Optional image path for vision-enabled agents. */
        fun img(img: String?) = apply { body.img(img) }

        /** Alias for calling [Builder.img] with `img.orElse(null)`. */
        fun img(img: Optional<String>) = img(img.getOrNull())

        /**
         * Sets [Builder.img] to an arbitrary JSON value.
         *
         * You should usually call [Builder.img] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun img(img: JsonField<String>) = apply { body.img(img) }

        /** The maximum number of execution loops for the workflow. */
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

        /** The name of the graph workflow. */
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

        /** The task to be executed by the workflow. */
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

        /** Whether to enable detailed logging. */
        fun verbose(verbose: Boolean?) = apply { body.verbose(verbose) }

        /**
         * Alias for [Builder.verbose].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun verbose(verbose: Boolean) = verbose(verbose as Boolean?)

        /** Alias for calling [Builder.verbose] with `verbose.orElse(null)`. */
        fun verbose(verbose: Optional<Boolean>) = verbose(verbose.getOrNull())

        /**
         * Sets [Builder.verbose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verbose] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun verbose(verbose: JsonField<Boolean>) = apply { body.verbose(verbose) }

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
         * Returns an immutable instance of [GraphWorkflowExecuteWorkflowParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GraphWorkflowExecuteWorkflowParams =
            GraphWorkflowExecuteWorkflowParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Input schema for GraphWorkflow completion requests. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agents: JsonField<List<AgentSpec>>,
        private val autoCompile: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val edges: JsonField<List<Edge>>,
        private val endPoints: JsonField<List<String>>,
        private val entryPoints: JsonField<List<String>>,
        private val img: JsonField<String>,
        private val maxLoops: JsonField<Long>,
        private val name: JsonField<String>,
        private val task: JsonField<String>,
        private val verbose: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agents")
            @ExcludeMissing
            agents: JsonField<List<AgentSpec>> = JsonMissing.of(),
            @JsonProperty("auto_compile")
            @ExcludeMissing
            autoCompile: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("edges") @ExcludeMissing edges: JsonField<List<Edge>> = JsonMissing.of(),
            @JsonProperty("end_points")
            @ExcludeMissing
            endPoints: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("entry_points")
            @ExcludeMissing
            entryPoints: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("img") @ExcludeMissing img: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_loops") @ExcludeMissing maxLoops: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("task") @ExcludeMissing task: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verbose") @ExcludeMissing verbose: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            agents,
            autoCompile,
            description,
            edges,
            endPoints,
            entryPoints,
            img,
            maxLoops,
            name,
            task,
            verbose,
            mutableMapOf(),
        )

        /**
         * List of agent specifications to be used as nodes in the workflow graph.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun agents(): Optional<List<AgentSpec>> = agents.getOptional("agents")

        /**
         * Whether to automatically compile the workflow for optimization.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun autoCompile(): Optional<Boolean> = autoCompile.getOptional("auto_compile")

        /**
         * The description of the graph workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * List of edges connecting nodes. Can be EdgeSpec objects or dictionaries with 'source' and
         * 'target' keys.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun edges(): Optional<List<Edge>> = edges.getOptional("edges")

        /**
         * List of node IDs that serve as ending points for the workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun endPoints(): Optional<List<String>> = endPoints.getOptional("end_points")

        /**
         * List of node IDs that serve as starting points for the workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun entryPoints(): Optional<List<String>> = entryPoints.getOptional("entry_points")

        /**
         * Optional image path for vision-enabled agents.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun img(): Optional<String> = img.getOptional("img")

        /**
         * The maximum number of execution loops for the workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxLoops(): Optional<Long> = maxLoops.getOptional("max_loops")

        /**
         * The name of the graph workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The task to be executed by the workflow.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun task(): Optional<String> = task.getOptional("task")

        /**
         * Whether to enable detailed logging.
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun verbose(): Optional<Boolean> = verbose.getOptional("verbose")

        /**
         * Returns the raw JSON value of [agents].
         *
         * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agents") @ExcludeMissing fun _agents(): JsonField<List<AgentSpec>> = agents

        /**
         * Returns the raw JSON value of [autoCompile].
         *
         * Unlike [autoCompile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auto_compile")
        @ExcludeMissing
        fun _autoCompile(): JsonField<Boolean> = autoCompile

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [edges].
         *
         * Unlike [edges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("edges") @ExcludeMissing fun _edges(): JsonField<List<Edge>> = edges

        /**
         * Returns the raw JSON value of [endPoints].
         *
         * Unlike [endPoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_points")
        @ExcludeMissing
        fun _endPoints(): JsonField<List<String>> = endPoints

        /**
         * Returns the raw JSON value of [entryPoints].
         *
         * Unlike [entryPoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_points")
        @ExcludeMissing
        fun _entryPoints(): JsonField<List<String>> = entryPoints

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [task].
         *
         * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<String> = task

        /**
         * Returns the raw JSON value of [verbose].
         *
         * Unlike [verbose], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verbose") @ExcludeMissing fun _verbose(): JsonField<Boolean> = verbose

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

            private var agents: JsonField<MutableList<AgentSpec>>? = null
            private var autoCompile: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var edges: JsonField<MutableList<Edge>>? = null
            private var endPoints: JsonField<MutableList<String>>? = null
            private var entryPoints: JsonField<MutableList<String>>? = null
            private var img: JsonField<String> = JsonMissing.of()
            private var maxLoops: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var task: JsonField<String> = JsonMissing.of()
            private var verbose: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agents = body.agents.map { it.toMutableList() }
                autoCompile = body.autoCompile
                description = body.description
                edges = body.edges.map { it.toMutableList() }
                endPoints = body.endPoints.map { it.toMutableList() }
                entryPoints = body.entryPoints.map { it.toMutableList() }
                img = body.img
                maxLoops = body.maxLoops
                name = body.name
                task = body.task
                verbose = body.verbose
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of agent specifications to be used as nodes in the workflow graph. */
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

            /** Whether to automatically compile the workflow for optimization. */
            fun autoCompile(autoCompile: Boolean?) = autoCompile(JsonField.ofNullable(autoCompile))

            /**
             * Alias for [Builder.autoCompile].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun autoCompile(autoCompile: Boolean) = autoCompile(autoCompile as Boolean?)

            /** Alias for calling [Builder.autoCompile] with `autoCompile.orElse(null)`. */
            fun autoCompile(autoCompile: Optional<Boolean>) = autoCompile(autoCompile.getOrNull())

            /**
             * Sets [Builder.autoCompile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoCompile] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoCompile(autoCompile: JsonField<Boolean>) = apply {
                this.autoCompile = autoCompile
            }

            /** The description of the graph workflow. */
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

            /**
             * List of edges connecting nodes. Can be EdgeSpec objects or dictionaries with 'source'
             * and 'target' keys.
             */
            fun edges(edges: List<Edge>?) = edges(JsonField.ofNullable(edges))

            /** Alias for calling [Builder.edges] with `edges.orElse(null)`. */
            fun edges(edges: Optional<List<Edge>>) = edges(edges.getOrNull())

            /**
             * Sets [Builder.edges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.edges] with a well-typed `List<Edge>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun edges(edges: JsonField<List<Edge>>) = apply {
                this.edges = edges.map { it.toMutableList() }
            }

            /**
             * Adds a single [Edge] to [edges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEdge(edge: Edge) = apply {
                edges =
                    (edges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("edges", it).add(edge)
                    }
            }

            /** Alias for calling [addEdge] with `Edge.ofSpec(spec)`. */
            fun addEdge(spec: Edge.EdgeSpec) = addEdge(Edge.ofSpec(spec))

            /** Alias for calling [addEdge] with `Edge.ofUnionMember1(unionMember1)`. */
            fun addEdge(unionMember1: Edge.UnionMember1) =
                addEdge(Edge.ofUnionMember1(unionMember1))

            /** List of node IDs that serve as ending points for the workflow. */
            fun endPoints(endPoints: List<String>?) = endPoints(JsonField.ofNullable(endPoints))

            /** Alias for calling [Builder.endPoints] with `endPoints.orElse(null)`. */
            fun endPoints(endPoints: Optional<List<String>>) = endPoints(endPoints.getOrNull())

            /**
             * Sets [Builder.endPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endPoints] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endPoints(endPoints: JsonField<List<String>>) = apply {
                this.endPoints = endPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [endPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEndPoint(endPoint: String) = apply {
                endPoints =
                    (endPoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("endPoints", it).add(endPoint)
                    }
            }

            /** List of node IDs that serve as starting points for the workflow. */
            fun entryPoints(entryPoints: List<String>?) =
                entryPoints(JsonField.ofNullable(entryPoints))

            /** Alias for calling [Builder.entryPoints] with `entryPoints.orElse(null)`. */
            fun entryPoints(entryPoints: Optional<List<String>>) =
                entryPoints(entryPoints.getOrNull())

            /**
             * Sets [Builder.entryPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryPoints] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryPoints(entryPoints: JsonField<List<String>>) = apply {
                this.entryPoints = entryPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [entryPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntryPoint(entryPoint: String) = apply {
                entryPoints =
                    (entryPoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entryPoints", it).add(entryPoint)
                    }
            }

            /** Optional image path for vision-enabled agents. */
            fun img(img: String?) = img(JsonField.ofNullable(img))

            /** Alias for calling [Builder.img] with `img.orElse(null)`. */
            fun img(img: Optional<String>) = img(img.getOrNull())

            /**
             * Sets [Builder.img] to an arbitrary JSON value.
             *
             * You should usually call [Builder.img] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun img(img: JsonField<String>) = apply { this.img = img }

            /** The maximum number of execution loops for the workflow. */
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

            /** The name of the graph workflow. */
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

            /** The task to be executed by the workflow. */
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

            /** Whether to enable detailed logging. */
            fun verbose(verbose: Boolean?) = verbose(JsonField.ofNullable(verbose))

            /**
             * Alias for [Builder.verbose].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun verbose(verbose: Boolean) = verbose(verbose as Boolean?)

            /** Alias for calling [Builder.verbose] with `verbose.orElse(null)`. */
            fun verbose(verbose: Optional<Boolean>) = verbose(verbose.getOrNull())

            /**
             * Sets [Builder.verbose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verbose] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verbose(verbose: JsonField<Boolean>) = apply { this.verbose = verbose }

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
                    (agents ?: JsonMissing.of()).map { it.toImmutable() },
                    autoCompile,
                    description,
                    (edges ?: JsonMissing.of()).map { it.toImmutable() },
                    (endPoints ?: JsonMissing.of()).map { it.toImmutable() },
                    (entryPoints ?: JsonMissing.of()).map { it.toImmutable() },
                    img,
                    maxLoops,
                    name,
                    task,
                    verbose,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            agents().ifPresent { it.forEach { it.validate() } }
            autoCompile()
            description()
            edges().ifPresent { it.forEach { it.validate() } }
            endPoints()
            entryPoints()
            img()
            maxLoops()
            name()
            task()
            verbose()
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
            (agents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (autoCompile.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (edges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (endPoints.asKnown().getOrNull()?.size ?: 0) +
                (entryPoints.asKnown().getOrNull()?.size ?: 0) +
                (if (img.asKnown().isPresent) 1 else 0) +
                (if (maxLoops.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (task.asKnown().isPresent) 1 else 0) +
                (if (verbose.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agents == other.agents &&
                autoCompile == other.autoCompile &&
                description == other.description &&
                edges == other.edges &&
                endPoints == other.endPoints &&
                entryPoints == other.entryPoints &&
                img == other.img &&
                maxLoops == other.maxLoops &&
                name == other.name &&
                task == other.task &&
                verbose == other.verbose &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agents,
                autoCompile,
                description,
                edges,
                endPoints,
                entryPoints,
                img,
                maxLoops,
                name,
                task,
                verbose,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agents=$agents, autoCompile=$autoCompile, description=$description, edges=$edges, endPoints=$endPoints, entryPoints=$entryPoints, img=$img, maxLoops=$maxLoops, name=$name, task=$task, verbose=$verbose, additionalProperties=$additionalProperties}"
    }

    /** Schema for defining an edge between nodes in the workflow graph. */
    @JsonDeserialize(using = Edge.Deserializer::class)
    @JsonSerialize(using = Edge.Serializer::class)
    class Edge
    private constructor(
        private val spec: EdgeSpec? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Schema for defining an edge between nodes in the workflow graph. */
        fun spec(): Optional<EdgeSpec> = Optional.ofNullable(spec)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isSpec(): Boolean = spec != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        /** Schema for defining an edge between nodes in the workflow graph. */
        fun asSpec(): EdgeSpec = spec.getOrThrow("spec")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                spec != null -> visitor.visitSpec(spec)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Edge = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitSpec(spec: EdgeSpec) {
                        spec.validate()
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
                    override fun visitSpec(spec: EdgeSpec) = spec.validity()

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Edge && spec == other.spec && unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(spec, unionMember1)

        override fun toString(): String =
            when {
                spec != null -> "Edge{spec=$spec}"
                unionMember1 != null -> "Edge{unionMember1=$unionMember1}"
                _json != null -> "Edge{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Edge")
            }

        companion object {

            /** Schema for defining an edge between nodes in the workflow graph. */
            @JvmStatic fun ofSpec(spec: EdgeSpec) = Edge(spec = spec)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Edge(unionMember1 = unionMember1)
        }

        /** An interface that defines how to map each variant of [Edge] to a value of type [T]. */
        interface Visitor<out T> {

            /** Schema for defining an edge between nodes in the workflow graph. */
            fun visitSpec(spec: EdgeSpec): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [Edge] to a value of type [T].
             *
             * An instance of [Edge] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws SwarmsClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SwarmsClientInvalidDataException("Unknown Edge: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Edge>(Edge::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Edge {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<EdgeSpec>())?.let {
                                Edge(spec = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Edge(unionMember1 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Edge(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Edge>(Edge::class) {

            override fun serialize(
                value: Edge,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.spec != null -> generator.writeObject(value.spec)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Edge")
                }
            }
        }

        /** Schema for defining an edge between nodes in the workflow graph. */
        class EdgeSpec
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val source: JsonField<String>,
            private val target: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("target")
                @ExcludeMissing
                target: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(source, target, metadata, mutableMapOf())

            /**
             * The source node ID.
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun source(): String = source.getRequired("source")

            /**
             * The target node ID.
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun target(): String = target.getRequired("target")

            /**
             * Optional metadata for the edge.
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

            /**
             * Returns the raw JSON value of [target].
             *
             * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<String> = target

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [EdgeSpec].
                 *
                 * The following fields are required:
                 * ```java
                 * .source()
                 * .target()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EdgeSpec]. */
            class Builder internal constructor() {

                private var source: JsonField<String>? = null
                private var target: JsonField<String>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(edgeSpec: EdgeSpec) = apply {
                    source = edgeSpec.source
                    target = edgeSpec.target
                    metadata = edgeSpec.metadata
                    additionalProperties = edgeSpec.additionalProperties.toMutableMap()
                }

                /** The source node ID. */
                fun source(source: String) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /** The target node ID. */
                fun target(target: String) = target(JsonField.of(target))

                /**
                 * Sets [Builder.target] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.target] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun target(target: JsonField<String>) = apply { this.target = target }

                /** Optional metadata for the edge. */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
                fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                 * Returns an immutable instance of [EdgeSpec].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .source()
                 * .target()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EdgeSpec =
                    EdgeSpec(
                        checkRequired("source", source),
                        checkRequired("target", target),
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EdgeSpec = apply {
                if (validated) {
                    return@apply
                }

                source()
                target()
                metadata().ifPresent { it.validate() }
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
                (if (source.asKnown().isPresent) 1 else 0) +
                    (if (target.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0)

            /** Optional metadata for the edge. */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EdgeSpec &&
                    source == other.source &&
                    target == other.target &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(source, target, metadata, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EdgeSpec{source=$source, target=$target, metadata=$metadata, additionalProperties=$additionalProperties}"
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

                return other is UnionMember1 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GraphWorkflowExecuteWorkflowParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "GraphWorkflowExecuteWorkflowParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

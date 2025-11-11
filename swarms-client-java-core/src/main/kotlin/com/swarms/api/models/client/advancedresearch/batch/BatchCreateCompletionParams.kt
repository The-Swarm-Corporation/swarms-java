// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.advancedresearch.batch

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
import com.swarms.api.core.checkRequired
import com.swarms.api.core.http.Headers
import com.swarms.api.core.http.QueryParams
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Execute multiple advanced research sessions concurrently with independent configurations for
 * high-throughput research workflows.
 */
class BatchCreateCompletionParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The input schemas for the advanced research
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun inputSchemas(): Optional<List<InputSchema>> = body.inputSchemas()

    /**
     * Returns the raw JSON value of [inputSchemas].
     *
     * Unlike [inputSchemas], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputSchemas(): JsonField<List<InputSchema>> = body._inputSchemas()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchCreateCompletionParams].
         *
         * The following fields are required:
         * ```java
         * .inputSchemas()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchCreateCompletionParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchCreateCompletionParams: BatchCreateCompletionParams) = apply {
            body = batchCreateCompletionParams.body.toBuilder()
            additionalHeaders = batchCreateCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchCreateCompletionParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [inputSchemas]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The input schemas for the advanced research */
        fun inputSchemas(inputSchemas: List<InputSchema>?) = apply {
            body.inputSchemas(inputSchemas)
        }

        /** Alias for calling [Builder.inputSchemas] with `inputSchemas.orElse(null)`. */
        fun inputSchemas(inputSchemas: Optional<List<InputSchema>>) =
            inputSchemas(inputSchemas.getOrNull())

        /**
         * Sets [Builder.inputSchemas] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputSchemas] with a well-typed `List<InputSchema>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputSchemas(inputSchemas: JsonField<List<InputSchema>>) = apply {
            body.inputSchemas(inputSchemas)
        }

        /**
         * Adds a single [InputSchema] to [inputSchemas].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputSchema(inputSchema: InputSchema) = apply { body.addInputSchema(inputSchema) }

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
         * Returns an immutable instance of [BatchCreateCompletionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputSchemas()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchCreateCompletionParams =
            BatchCreateCompletionParams(
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
        private val inputSchemas: JsonField<List<InputSchema>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input_schemas")
            @ExcludeMissing
            inputSchemas: JsonField<List<InputSchema>> = JsonMissing.of()
        ) : this(inputSchemas, mutableMapOf())

        /**
         * The input schemas for the advanced research
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun inputSchemas(): Optional<List<InputSchema>> = inputSchemas.getOptional("input_schemas")

        /**
         * Returns the raw JSON value of [inputSchemas].
         *
         * Unlike [inputSchemas], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_schemas")
        @ExcludeMissing
        fun _inputSchemas(): JsonField<List<InputSchema>> = inputSchemas

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .inputSchemas()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inputSchemas: JsonField<MutableList<InputSchema>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                inputSchemas = body.inputSchemas.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The input schemas for the advanced research */
            fun inputSchemas(inputSchemas: List<InputSchema>?) =
                inputSchemas(JsonField.ofNullable(inputSchemas))

            /** Alias for calling [Builder.inputSchemas] with `inputSchemas.orElse(null)`. */
            fun inputSchemas(inputSchemas: Optional<List<InputSchema>>) =
                inputSchemas(inputSchemas.getOrNull())

            /**
             * Sets [Builder.inputSchemas] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputSchemas] with a well-typed `List<InputSchema>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputSchemas(inputSchemas: JsonField<List<InputSchema>>) = apply {
                this.inputSchemas = inputSchemas.map { it.toMutableList() }
            }

            /**
             * Adds a single [InputSchema] to [inputSchemas].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInputSchema(inputSchema: InputSchema) = apply {
                inputSchemas =
                    (inputSchemas ?: JsonField.of(mutableListOf())).also {
                        checkKnown("inputSchemas", it).add(inputSchema)
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
             *
             * The following fields are required:
             * ```java
             * .inputSchemas()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("inputSchemas", inputSchemas).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            inputSchemas().ifPresent { it.forEach { it.validate() } }
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
            (inputSchemas.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                inputSchemas == other.inputSchemas &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(inputSchemas, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{inputSchemas=$inputSchemas, additionalProperties=$additionalProperties}"
    }

    class InputSchema
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val config: JsonField<Config>,
        private val task: JsonField<String>,
        private val img: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
            @JsonProperty("task") @ExcludeMissing task: JsonField<String> = JsonMissing.of(),
            @JsonProperty("img") @ExcludeMissing img: JsonField<String> = JsonMissing.of(),
        ) : this(config, task, img, mutableMapOf())

        /**
         * The configuration for the advanced research
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun config(): Optional<Config> = config.getOptional("config")

        /**
         * The task to be completed
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun task(): Optional<String> = task.getOptional("task")

        /**
         * The image to be used for the advanced research
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun img(): Optional<String> = img.getOptional("img")

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

        /**
         * Returns the raw JSON value of [task].
         *
         * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<String> = task

        /**
         * Returns the raw JSON value of [img].
         *
         * Unlike [img], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("img") @ExcludeMissing fun _img(): JsonField<String> = img

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
             * Returns a mutable builder for constructing an instance of [InputSchema].
             *
             * The following fields are required:
             * ```java
             * .config()
             * .task()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputSchema]. */
        class Builder internal constructor() {

            private var config: JsonField<Config>? = null
            private var task: JsonField<String>? = null
            private var img: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputSchema: InputSchema) = apply {
                config = inputSchema.config
                task = inputSchema.task
                img = inputSchema.img
                additionalProperties = inputSchema.additionalProperties.toMutableMap()
            }

            /** The configuration for the advanced research */
            fun config(config: Config?) = config(JsonField.ofNullable(config))

            /** Alias for calling [Builder.config] with `config.orElse(null)`. */
            fun config(config: Optional<Config>) = config(config.getOrNull())

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [Config] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

            /** The task to be completed */
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

            /** The image to be used for the advanced research */
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
             * Returns an immutable instance of [InputSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .config()
             * .task()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InputSchema =
                InputSchema(
                    checkRequired("config", config),
                    checkRequired("task", task),
                    img,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InputSchema = apply {
            if (validated) {
                return@apply
            }

            config().ifPresent { it.validate() }
            task()
            img()
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
            (config.asKnown().getOrNull()?.validity() ?: 0) +
                (if (task.asKnown().isPresent) 1 else 0) +
                (if (img.asKnown().isPresent) 1 else 0)

        /** The configuration for the advanced research */
        class Config
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val directorAgentName: JsonField<String>,
            private val directorMaxLoops: JsonField<Long>,
            private val directorMaxTokens: JsonField<Long>,
            private val directorModelName: JsonField<String>,
            private val exaSearchMaxCharacters: JsonField<Long>,
            private val exaSearchNumResults: JsonField<Long>,
            private val maxLoops: JsonField<Long>,
            private val name: JsonField<String>,
            private val workerModelName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("director_agent_name")
                @ExcludeMissing
                directorAgentName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("director_max_loops")
                @ExcludeMissing
                directorMaxLoops: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("director_max_tokens")
                @ExcludeMissing
                directorMaxTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("director_model_name")
                @ExcludeMissing
                directorModelName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("exa_search_max_characters")
                @ExcludeMissing
                exaSearchMaxCharacters: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("exa_search_num_results")
                @ExcludeMissing
                exaSearchNumResults: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_loops")
                @ExcludeMissing
                maxLoops: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("worker_model_name")
                @ExcludeMissing
                workerModelName: JsonField<String> = JsonMissing.of(),
            ) : this(
                description,
                directorAgentName,
                directorMaxLoops,
                directorMaxTokens,
                directorModelName,
                exaSearchMaxCharacters,
                exaSearchNumResults,
                maxLoops,
                name,
                workerModelName,
                mutableMapOf(),
            )

            /**
             * Description of the advanced research session
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Name of the director agent
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun directorAgentName(): Optional<String> =
                directorAgentName.getOptional("director_agent_name")

            /**
             * Maximum loops for the director agent
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun directorMaxLoops(): Optional<Long> =
                directorMaxLoops.getOptional("director_max_loops")

            /**
             * Maximum tokens for the director agent's output
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun directorMaxTokens(): Optional<Long> =
                directorMaxTokens.getOptional("director_max_tokens")

            /**
             * Model name for the director agent
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun directorModelName(): Optional<String> =
                directorModelName.getOptional("director_model_name")

            /**
             * Maximum characters to return from the Exa search tool
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun exaSearchMaxCharacters(): Optional<Long> =
                exaSearchMaxCharacters.getOptional("exa_search_max_characters")

            /**
             * Number of results to return from the Exa search tool
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun exaSearchNumResults(): Optional<Long> =
                exaSearchNumResults.getOptional("exa_search_num_results")

            /**
             * Number of research loops to run
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxLoops(): Optional<Long> = maxLoops.getOptional("max_loops")

            /**
             * Name of the advanced research session
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Model name for worker agents
             *
             * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun workerModelName(): Optional<String> =
                workerModelName.getOptional("worker_model_name")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [directorAgentName].
             *
             * Unlike [directorAgentName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("director_agent_name")
            @ExcludeMissing
            fun _directorAgentName(): JsonField<String> = directorAgentName

            /**
             * Returns the raw JSON value of [directorMaxLoops].
             *
             * Unlike [directorMaxLoops], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("director_max_loops")
            @ExcludeMissing
            fun _directorMaxLoops(): JsonField<Long> = directorMaxLoops

            /**
             * Returns the raw JSON value of [directorMaxTokens].
             *
             * Unlike [directorMaxTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("director_max_tokens")
            @ExcludeMissing
            fun _directorMaxTokens(): JsonField<Long> = directorMaxTokens

            /**
             * Returns the raw JSON value of [directorModelName].
             *
             * Unlike [directorModelName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("director_model_name")
            @ExcludeMissing
            fun _directorModelName(): JsonField<String> = directorModelName

            /**
             * Returns the raw JSON value of [exaSearchMaxCharacters].
             *
             * Unlike [exaSearchMaxCharacters], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("exa_search_max_characters")
            @ExcludeMissing
            fun _exaSearchMaxCharacters(): JsonField<Long> = exaSearchMaxCharacters

            /**
             * Returns the raw JSON value of [exaSearchNumResults].
             *
             * Unlike [exaSearchNumResults], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("exa_search_num_results")
            @ExcludeMissing
            fun _exaSearchNumResults(): JsonField<Long> = exaSearchNumResults

            /**
             * Returns the raw JSON value of [maxLoops].
             *
             * Unlike [maxLoops], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_loops") @ExcludeMissing fun _maxLoops(): JsonField<Long> = maxLoops

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [workerModelName].
             *
             * Unlike [workerModelName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("worker_model_name")
            @ExcludeMissing
            fun _workerModelName(): JsonField<String> = workerModelName

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

                /** Returns a mutable builder for constructing an instance of [Config]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Config]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var directorAgentName: JsonField<String> = JsonMissing.of()
                private var directorMaxLoops: JsonField<Long> = JsonMissing.of()
                private var directorMaxTokens: JsonField<Long> = JsonMissing.of()
                private var directorModelName: JsonField<String> = JsonMissing.of()
                private var exaSearchMaxCharacters: JsonField<Long> = JsonMissing.of()
                private var exaSearchNumResults: JsonField<Long> = JsonMissing.of()
                private var maxLoops: JsonField<Long> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var workerModelName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(config: Config) = apply {
                    description = config.description
                    directorAgentName = config.directorAgentName
                    directorMaxLoops = config.directorMaxLoops
                    directorMaxTokens = config.directorMaxTokens
                    directorModelName = config.directorModelName
                    exaSearchMaxCharacters = config.exaSearchMaxCharacters
                    exaSearchNumResults = config.exaSearchNumResults
                    maxLoops = config.maxLoops
                    name = config.name
                    workerModelName = config.workerModelName
                    additionalProperties = config.additionalProperties.toMutableMap()
                }

                /** Description of the advanced research session */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Name of the director agent */
                fun directorAgentName(directorAgentName: String?) =
                    directorAgentName(JsonField.ofNullable(directorAgentName))

                /**
                 * Alias for calling [Builder.directorAgentName] with
                 * `directorAgentName.orElse(null)`.
                 */
                fun directorAgentName(directorAgentName: Optional<String>) =
                    directorAgentName(directorAgentName.getOrNull())

                /**
                 * Sets [Builder.directorAgentName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.directorAgentName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun directorAgentName(directorAgentName: JsonField<String>) = apply {
                    this.directorAgentName = directorAgentName
                }

                /** Maximum loops for the director agent */
                fun directorMaxLoops(directorMaxLoops: Long?) =
                    directorMaxLoops(JsonField.ofNullable(directorMaxLoops))

                /**
                 * Alias for [Builder.directorMaxLoops].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun directorMaxLoops(directorMaxLoops: Long) =
                    directorMaxLoops(directorMaxLoops as Long?)

                /**
                 * Alias for calling [Builder.directorMaxLoops] with
                 * `directorMaxLoops.orElse(null)`.
                 */
                fun directorMaxLoops(directorMaxLoops: Optional<Long>) =
                    directorMaxLoops(directorMaxLoops.getOrNull())

                /**
                 * Sets [Builder.directorMaxLoops] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.directorMaxLoops] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun directorMaxLoops(directorMaxLoops: JsonField<Long>) = apply {
                    this.directorMaxLoops = directorMaxLoops
                }

                /** Maximum tokens for the director agent's output */
                fun directorMaxTokens(directorMaxTokens: Long?) =
                    directorMaxTokens(JsonField.ofNullable(directorMaxTokens))

                /**
                 * Alias for [Builder.directorMaxTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun directorMaxTokens(directorMaxTokens: Long) =
                    directorMaxTokens(directorMaxTokens as Long?)

                /**
                 * Alias for calling [Builder.directorMaxTokens] with
                 * `directorMaxTokens.orElse(null)`.
                 */
                fun directorMaxTokens(directorMaxTokens: Optional<Long>) =
                    directorMaxTokens(directorMaxTokens.getOrNull())

                /**
                 * Sets [Builder.directorMaxTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.directorMaxTokens] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun directorMaxTokens(directorMaxTokens: JsonField<Long>) = apply {
                    this.directorMaxTokens = directorMaxTokens
                }

                /** Model name for the director agent */
                fun directorModelName(directorModelName: String?) =
                    directorModelName(JsonField.ofNullable(directorModelName))

                /**
                 * Alias for calling [Builder.directorModelName] with
                 * `directorModelName.orElse(null)`.
                 */
                fun directorModelName(directorModelName: Optional<String>) =
                    directorModelName(directorModelName.getOrNull())

                /**
                 * Sets [Builder.directorModelName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.directorModelName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun directorModelName(directorModelName: JsonField<String>) = apply {
                    this.directorModelName = directorModelName
                }

                /** Maximum characters to return from the Exa search tool */
                fun exaSearchMaxCharacters(exaSearchMaxCharacters: Long?) =
                    exaSearchMaxCharacters(JsonField.ofNullable(exaSearchMaxCharacters))

                /**
                 * Alias for [Builder.exaSearchMaxCharacters].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun exaSearchMaxCharacters(exaSearchMaxCharacters: Long) =
                    exaSearchMaxCharacters(exaSearchMaxCharacters as Long?)

                /**
                 * Alias for calling [Builder.exaSearchMaxCharacters] with
                 * `exaSearchMaxCharacters.orElse(null)`.
                 */
                fun exaSearchMaxCharacters(exaSearchMaxCharacters: Optional<Long>) =
                    exaSearchMaxCharacters(exaSearchMaxCharacters.getOrNull())

                /**
                 * Sets [Builder.exaSearchMaxCharacters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exaSearchMaxCharacters] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun exaSearchMaxCharacters(exaSearchMaxCharacters: JsonField<Long>) = apply {
                    this.exaSearchMaxCharacters = exaSearchMaxCharacters
                }

                /** Number of results to return from the Exa search tool */
                fun exaSearchNumResults(exaSearchNumResults: Long?) =
                    exaSearchNumResults(JsonField.ofNullable(exaSearchNumResults))

                /**
                 * Alias for [Builder.exaSearchNumResults].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun exaSearchNumResults(exaSearchNumResults: Long) =
                    exaSearchNumResults(exaSearchNumResults as Long?)

                /**
                 * Alias for calling [Builder.exaSearchNumResults] with
                 * `exaSearchNumResults.orElse(null)`.
                 */
                fun exaSearchNumResults(exaSearchNumResults: Optional<Long>) =
                    exaSearchNumResults(exaSearchNumResults.getOrNull())

                /**
                 * Sets [Builder.exaSearchNumResults] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exaSearchNumResults] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun exaSearchNumResults(exaSearchNumResults: JsonField<Long>) = apply {
                    this.exaSearchNumResults = exaSearchNumResults
                }

                /** Number of research loops to run */
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
                 * You should usually call [Builder.maxLoops] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxLoops(maxLoops: JsonField<Long>) = apply { this.maxLoops = maxLoops }

                /** Name of the advanced research session */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Model name for worker agents */
                fun workerModelName(workerModelName: String?) =
                    workerModelName(JsonField.ofNullable(workerModelName))

                /**
                 * Alias for calling [Builder.workerModelName] with `workerModelName.orElse(null)`.
                 */
                fun workerModelName(workerModelName: Optional<String>) =
                    workerModelName(workerModelName.getOrNull())

                /**
                 * Sets [Builder.workerModelName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.workerModelName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun workerModelName(workerModelName: JsonField<String>) = apply {
                    this.workerModelName = workerModelName
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
                 * Returns an immutable instance of [Config].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Config =
                    Config(
                        description,
                        directorAgentName,
                        directorMaxLoops,
                        directorMaxTokens,
                        directorModelName,
                        exaSearchMaxCharacters,
                        exaSearchNumResults,
                        maxLoops,
                        name,
                        workerModelName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Config = apply {
                if (validated) {
                    return@apply
                }

                description()
                directorAgentName()
                directorMaxLoops()
                directorMaxTokens()
                directorModelName()
                exaSearchMaxCharacters()
                exaSearchNumResults()
                maxLoops()
                name()
                workerModelName()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                    (if (directorAgentName.asKnown().isPresent) 1 else 0) +
                    (if (directorMaxLoops.asKnown().isPresent) 1 else 0) +
                    (if (directorMaxTokens.asKnown().isPresent) 1 else 0) +
                    (if (directorModelName.asKnown().isPresent) 1 else 0) +
                    (if (exaSearchMaxCharacters.asKnown().isPresent) 1 else 0) +
                    (if (exaSearchNumResults.asKnown().isPresent) 1 else 0) +
                    (if (maxLoops.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (workerModelName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Config &&
                    description == other.description &&
                    directorAgentName == other.directorAgentName &&
                    directorMaxLoops == other.directorMaxLoops &&
                    directorMaxTokens == other.directorMaxTokens &&
                    directorModelName == other.directorModelName &&
                    exaSearchMaxCharacters == other.exaSearchMaxCharacters &&
                    exaSearchNumResults == other.exaSearchNumResults &&
                    maxLoops == other.maxLoops &&
                    name == other.name &&
                    workerModelName == other.workerModelName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    description,
                    directorAgentName,
                    directorMaxLoops,
                    directorMaxTokens,
                    directorModelName,
                    exaSearchMaxCharacters,
                    exaSearchNumResults,
                    maxLoops,
                    name,
                    workerModelName,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Config{description=$description, directorAgentName=$directorAgentName, directorMaxLoops=$directorMaxLoops, directorMaxTokens=$directorMaxTokens, directorModelName=$directorModelName, exaSearchMaxCharacters=$exaSearchMaxCharacters, exaSearchNumResults=$exaSearchNumResults, maxLoops=$maxLoops, name=$name, workerModelName=$workerModelName, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputSchema &&
                config == other.config &&
                task == other.task &&
                img == other.img &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(config, task, img, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InputSchema{config=$config, task=$task, img=$img, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchCreateCompletionParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BatchCreateCompletionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

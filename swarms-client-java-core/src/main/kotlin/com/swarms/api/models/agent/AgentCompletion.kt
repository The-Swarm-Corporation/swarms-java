// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

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
import com.swarms.api.core.allMaxBy
import com.swarms.api.core.checkKnown
import com.swarms.api.core.getOrThrow
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentCompletion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentConfig: JsonField<AgentSpec>,
    private val history: JsonField<History>,
    private val img: JsonField<String>,
    private val imgs: JsonField<List<String>>,
    private val task: JsonField<String>,
    private val toolsEnabled: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent_config")
        @ExcludeMissing
        agentConfig: JsonField<AgentSpec> = JsonMissing.of(),
        @JsonProperty("history") @ExcludeMissing history: JsonField<History> = JsonMissing.of(),
        @JsonProperty("img") @ExcludeMissing img: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imgs") @ExcludeMissing imgs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("task") @ExcludeMissing task: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tools_enabled")
        @ExcludeMissing
        toolsEnabled: JsonField<List<String>> = JsonMissing.of(),
    ) : this(agentConfig, history, img, imgs, task, toolsEnabled, mutableMapOf())

    /**
     * The configuration of the agent to be completed.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun agentConfig(): Optional<AgentSpec> = agentConfig.getOptional("agent_config")

    /**
     * The history of the agent's previous tasks and responses. Can be either a dictionary or a list
     * of message objects.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun history(): Optional<History> = history.getOptional("history")

    /**
     * An optional image URL that may be associated with the agent's task or representation.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun img(): Optional<String> = img.getOptional("img")

    /**
     * A list of image URLs that may be associated with the agent's task or representation.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun imgs(): Optional<List<String>> = imgs.getOptional("imgs")

    /**
     * The task to be completed by the agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun task(): Optional<String> = task.getOptional("task")

    /**
     * A list of tools that the agent should use to complete its task.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun toolsEnabled(): Optional<List<String>> = toolsEnabled.getOptional("tools_enabled")

    /**
     * Returns the raw JSON value of [agentConfig].
     *
     * Unlike [agentConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_config")
    @ExcludeMissing
    fun _agentConfig(): JsonField<AgentSpec> = agentConfig

    /**
     * Returns the raw JSON value of [history].
     *
     * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<History> = history

    /**
     * Returns the raw JSON value of [img].
     *
     * Unlike [img], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("img") @ExcludeMissing fun _img(): JsonField<String> = img

    /**
     * Returns the raw JSON value of [imgs].
     *
     * Unlike [imgs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imgs") @ExcludeMissing fun _imgs(): JsonField<List<String>> = imgs

    /**
     * Returns the raw JSON value of [task].
     *
     * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<String> = task

    /**
     * Returns the raw JSON value of [toolsEnabled].
     *
     * Unlike [toolsEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tools_enabled")
    @ExcludeMissing
    fun _toolsEnabled(): JsonField<List<String>> = toolsEnabled

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

        /** Returns a mutable builder for constructing an instance of [AgentCompletion]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentCompletion]. */
    class Builder internal constructor() {

        private var agentConfig: JsonField<AgentSpec> = JsonMissing.of()
        private var history: JsonField<History> = JsonMissing.of()
        private var img: JsonField<String> = JsonMissing.of()
        private var imgs: JsonField<MutableList<String>>? = null
        private var task: JsonField<String> = JsonMissing.of()
        private var toolsEnabled: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentCompletion: AgentCompletion) = apply {
            agentConfig = agentCompletion.agentConfig
            history = agentCompletion.history
            img = agentCompletion.img
            imgs = agentCompletion.imgs.map { it.toMutableList() }
            task = agentCompletion.task
            toolsEnabled = agentCompletion.toolsEnabled.map { it.toMutableList() }
            additionalProperties = agentCompletion.additionalProperties.toMutableMap()
        }

        /** The configuration of the agent to be completed. */
        fun agentConfig(agentConfig: AgentSpec?) = agentConfig(JsonField.ofNullable(agentConfig))

        /** Alias for calling [Builder.agentConfig] with `agentConfig.orElse(null)`. */
        fun agentConfig(agentConfig: Optional<AgentSpec>) = agentConfig(agentConfig.getOrNull())

        /**
         * Sets [Builder.agentConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentConfig] with a well-typed [AgentSpec] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentConfig(agentConfig: JsonField<AgentSpec>) = apply {
            this.agentConfig = agentConfig
        }

        /**
         * The history of the agent's previous tasks and responses. Can be either a dictionary or a
         * list of message objects.
         */
        fun history(history: History?) = history(JsonField.ofNullable(history))

        /** Alias for calling [Builder.history] with `history.orElse(null)`. */
        fun history(history: Optional<History>) = history(history.getOrNull())

        /**
         * Sets [Builder.history] to an arbitrary JSON value.
         *
         * You should usually call [Builder.history] with a well-typed [History] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun history(history: JsonField<History>) = apply { this.history = history }

        /** Alias for calling [history] with `History.ofUnionMember0(unionMember0)`. */
        fun history(unionMember0: History.UnionMember0) =
            history(History.ofUnionMember0(unionMember0))

        /**
         * Alias for calling [history] with
         * `History.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)`.
         */
        fun historyOfUnnamedSchemaWithArrayParent0s(
            unnamedSchemaWithArrayParent0s: List<History.UnnamedSchemaWithArrayParent0>
        ) = history(History.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s))

        /** An optional image URL that may be associated with the agent's task or representation. */
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

        /** A list of image URLs that may be associated with the agent's task or representation. */
        fun imgs(imgs: List<String>?) = imgs(JsonField.ofNullable(imgs))

        /** Alias for calling [Builder.imgs] with `imgs.orElse(null)`. */
        fun imgs(imgs: Optional<List<String>>) = imgs(imgs.getOrNull())

        /**
         * Sets [Builder.imgs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imgs] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            imgs = (imgs ?: JsonField.of(mutableListOf())).also { checkKnown("imgs", it).add(img) }
        }

        /** The task to be completed by the agent. */
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

        /** A list of tools that the agent should use to complete its task. */
        fun toolsEnabled(toolsEnabled: List<String>?) =
            toolsEnabled(JsonField.ofNullable(toolsEnabled))

        /** Alias for calling [Builder.toolsEnabled] with `toolsEnabled.orElse(null)`. */
        fun toolsEnabled(toolsEnabled: Optional<List<String>>) =
            toolsEnabled(toolsEnabled.getOrNull())

        /**
         * Sets [Builder.toolsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolsEnabled] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolsEnabled(toolsEnabled: JsonField<List<String>>) = apply {
            this.toolsEnabled = toolsEnabled.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.toolsEnabled].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolsEnabled(toolsEnabled: String) = apply {
            this.toolsEnabled =
                (this.toolsEnabled ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolsEnabled", it).add(toolsEnabled)
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
         * Returns an immutable instance of [AgentCompletion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AgentCompletion =
            AgentCompletion(
                agentConfig,
                history,
                img,
                (imgs ?: JsonMissing.of()).map { it.toImmutable() },
                task,
                (toolsEnabled ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AgentCompletion = apply {
        if (validated) {
            return@apply
        }

        agentConfig().ifPresent { it.validate() }
        history().ifPresent { it.validate() }
        img()
        imgs()
        task()
        toolsEnabled()
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
        (agentConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (history.asKnown().getOrNull()?.validity() ?: 0) +
            (if (img.asKnown().isPresent) 1 else 0) +
            (imgs.asKnown().getOrNull()?.size ?: 0) +
            (if (task.asKnown().isPresent) 1 else 0) +
            (toolsEnabled.asKnown().getOrNull()?.size ?: 0)

    /**
     * The history of the agent's previous tasks and responses. Can be either a dictionary or a list
     * of message objects.
     */
    @JsonDeserialize(using = History.Deserializer::class)
    @JsonSerialize(using = History.Serializer::class)
    class History
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unnamedSchemaWithArrayParent0s(): Optional<List<UnnamedSchemaWithArrayParent0>> =
            Optional.ofNullable(unnamedSchemaWithArrayParent0s)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnnamedSchemaWithArrayParent0s(): Boolean = unnamedSchemaWithArrayParent0s != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnnamedSchemaWithArrayParent0s(): List<UnnamedSchemaWithArrayParent0> =
            unnamedSchemaWithArrayParent0s.getOrThrow("unnamedSchemaWithArrayParent0s")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unnamedSchemaWithArrayParent0s != null ->
                    visitor.visitUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): History = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ) {
                        unnamedSchemaWithArrayParent0s.forEach { it.validate() }
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitUnnamedSchemaWithArrayParent0s(
                        unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                    ) = unnamedSchemaWithArrayParent0s.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is History &&
                unionMember0 == other.unionMember0 &&
                unnamedSchemaWithArrayParent0s == other.unnamedSchemaWithArrayParent0s
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unnamedSchemaWithArrayParent0s)

        override fun toString(): String =
            when {
                unionMember0 != null -> "History{unionMember0=$unionMember0}"
                unnamedSchemaWithArrayParent0s != null ->
                    "History{unnamedSchemaWithArrayParent0s=$unnamedSchemaWithArrayParent0s}"
                _json != null -> "History{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid History")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = History(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ) =
                History(
                    unnamedSchemaWithArrayParent0s = unnamedSchemaWithArrayParent0s.toImmutable()
                )
        }

        /**
         * An interface that defines how to map each variant of [History] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ): T

            /**
             * Maps an unknown variant of [History] to a value of type [T].
             *
             * An instance of [History] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws SwarmsClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SwarmsClientInvalidDataException("Unknown History: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<History>(History::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): History {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                History(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>(),
                                )
                                ?.let { History(unnamedSchemaWithArrayParent0s = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> History(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<History>(History::class) {

            override fun serialize(
                value: History,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unnamedSchemaWithArrayParent0s != null ->
                        generator.writeObject(value.unnamedSchemaWithArrayParent0s)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid History")
                }
            }
        }

        class UnionMember0
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

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
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

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }

        class UnnamedSchemaWithArrayParent0
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
                 * [UnnamedSchemaWithArrayParent0].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnnamedSchemaWithArrayParent0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unnamedSchemaWithArrayParent0: UnnamedSchemaWithArrayParent0) =
                    apply {
                        additionalProperties =
                            unnamedSchemaWithArrayParent0.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnnamedSchemaWithArrayParent0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnnamedSchemaWithArrayParent0 =
                    UnnamedSchemaWithArrayParent0(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnnamedSchemaWithArrayParent0 = apply {
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

                return other is UnnamedSchemaWithArrayParent0 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnnamedSchemaWithArrayParent0{additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentCompletion &&
            agentConfig == other.agentConfig &&
            history == other.history &&
            img == other.img &&
            imgs == other.imgs &&
            task == other.task &&
            toolsEnabled == other.toolsEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(agentConfig, history, img, imgs, task, toolsEnabled, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentCompletion{agentConfig=$agentConfig, history=$history, img=$img, imgs=$imgs, task=$task, toolsEnabled=$toolsEnabled, additionalProperties=$additionalProperties}"
}

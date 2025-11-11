// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.client.marketplace

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
import com.swarms.api.core.checkRequired
import com.swarms.api.core.getOrThrow
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response schema for marketplace prompts endpoint. */
class MarketplaceListAgentsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val prompts: JsonField<List<Prompt>>,
    private val totalCount: JsonField<Long>,
    private val status: JsonField<String>,
    private val timestamp: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("prompts")
        @ExcludeMissing
        prompts: JsonField<List<Prompt>> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
    ) : this(prompts, totalCount, status, timestamp, mutableMapOf())

    /**
     * List of marketplace prompts
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompts(): List<Prompt> = prompts.getRequired("prompts")

    /**
     * Total number of prompts available
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalCount(): Long = totalCount.getRequired("total_count")

    /**
     * The status of the marketplace prompts response.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * The timestamp of the marketplace prompts response.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

    /**
     * Returns the raw JSON value of [prompts].
     *
     * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompts") @ExcludeMissing fun _prompts(): JsonField<List<Prompt>> = prompts

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

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
         * [MarketplaceListAgentsResponse].
         *
         * The following fields are required:
         * ```java
         * .prompts()
         * .totalCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketplaceListAgentsResponse]. */
    class Builder internal constructor() {

        private var prompts: JsonField<MutableList<Prompt>>? = null
        private var totalCount: JsonField<Long>? = null
        private var status: JsonField<String> = JsonMissing.of()
        private var timestamp: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketplaceListAgentsResponse: MarketplaceListAgentsResponse) = apply {
            prompts = marketplaceListAgentsResponse.prompts.map { it.toMutableList() }
            totalCount = marketplaceListAgentsResponse.totalCount
            status = marketplaceListAgentsResponse.status
            timestamp = marketplaceListAgentsResponse.timestamp
            additionalProperties = marketplaceListAgentsResponse.additionalProperties.toMutableMap()
        }

        /** List of marketplace prompts */
        fun prompts(prompts: List<Prompt>) = prompts(JsonField.of(prompts))

        /**
         * Sets [Builder.prompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompts] with a well-typed `List<Prompt>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prompts(prompts: JsonField<List<Prompt>>) = apply {
            this.prompts = prompts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Prompt] to [prompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrompt(prompt: Prompt) = apply {
            prompts =
                (prompts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prompts", it).add(prompt)
                }
        }

        /** Total number of prompts available */
        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        /** The status of the marketplace prompts response. */
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

        /** The timestamp of the marketplace prompts response. */
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
         * Returns an immutable instance of [MarketplaceListAgentsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .prompts()
         * .totalCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketplaceListAgentsResponse =
            MarketplaceListAgentsResponse(
                checkRequired("prompts", prompts).map { it.toImmutable() },
                checkRequired("totalCount", totalCount),
                status,
                timestamp,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketplaceListAgentsResponse = apply {
        if (validated) {
            return@apply
        }

        prompts().forEach { it.validate() }
        totalCount()
        status()
        timestamp()
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
        (prompts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0)

    /** Schema for marketplace prompts from the swarms_cloud_prompts table. */
    class Prompt
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val userId: JsonField<String>,
        private val category: JsonField<Category>,
        private val description: JsonField<String>,
        private val links: JsonField<Links>,
        private val name: JsonField<String>,
        private val prompt: JsonField<String>,
        private val status: JsonField<String>,
        private val tags: JsonField<String>,
        private val useCases: JsonField<UseCases>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<String> = JsonMissing.of(),
            @JsonProperty("use_cases")
            @ExcludeMissing
            useCases: JsonField<UseCases> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            userId,
            category,
            description,
            links,
            name,
            prompt,
            status,
            tags,
            useCases,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the prompt
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Timestamp when the prompt was created
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): String = createdAt.getRequired("created_at")

        /**
         * ID of the user who created the prompt
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * Category name(s) - can be string or list
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun category(): Optional<Category> = category.getOptional("category")

        /**
         * Description of the prompt
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Associated links - can be list of dicts or strings
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun links(): Optional<Links> = links.getOptional("links")

        /**
         * Name of the prompt
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The actual prompt text
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun prompt(): Optional<String> = prompt.getOptional("prompt")

        /**
         * Status of the prompt
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Tags associated with the prompt
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tags(): Optional<String> = tags.getOptional("tags")

        /**
         * Use cases - can be dict or list of dicts
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun useCases(): Optional<UseCases> = useCases.getOptional("use_cases")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [links].
         *
         * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<String> = tags

        /**
         * Returns the raw JSON value of [useCases].
         *
         * Unlike [useCases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("use_cases") @ExcludeMissing fun _useCases(): JsonField<UseCases> = useCases

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
             * Returns a mutable builder for constructing an instance of [Prompt].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Prompt]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<String>? = null
            private var userId: JsonField<String>? = null
            private var category: JsonField<Category> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var links: JsonField<Links> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var prompt: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<String> = JsonMissing.of()
            private var useCases: JsonField<UseCases> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prompt: Prompt) = apply {
                id = prompt.id
                createdAt = prompt.createdAt
                userId = prompt.userId
                category = prompt.category
                description = prompt.description
                links = prompt.links
                name = prompt.name
                this.prompt = prompt.prompt
                status = prompt.status
                tags = prompt.tags
                useCases = prompt.useCases
                additionalProperties = prompt.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the prompt */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Timestamp when the prompt was created */
            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            /** ID of the user who created the prompt */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** Category name(s) - can be string or list */
            fun category(category: Category?) = category(JsonField.ofNullable(category))

            /** Alias for calling [Builder.category] with `category.orElse(null)`. */
            fun category(category: Optional<Category>) = category(category.getOrNull())

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Alias for calling [category] with `Category.ofString(string)`. */
            fun category(string: String) = category(Category.ofString(string))

            /** Alias for calling [category] with `Category.ofStrings(strings)`. */
            fun categoryOfStrings(strings: List<String>) = category(Category.ofStrings(strings))

            /** Description of the prompt */
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

            /** Associated links - can be list of dicts or strings */
            fun links(links: Links?) = links(JsonField.ofNullable(links))

            /** Alias for calling [Builder.links] with `links.orElse(null)`. */
            fun links(links: Optional<Links>) = links(links.getOrNull())

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [Links] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun links(links: JsonField<Links>) = apply { this.links = links }

            /**
             * Alias for calling [links] with
             * `Links.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)`.
             */
            fun linksOfUnnamedSchemaWithArrayParent2s(
                unnamedSchemaWithArrayParent2s: List<Links.UnnamedSchemaWithArrayParent2>
            ) = links(Links.ofUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s))

            /** Alias for calling [links] with `Links.ofStrings(strings)`. */
            fun linksOfStrings(strings: List<String>) = links(Links.ofStrings(strings))

            /** Name of the prompt */
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

            /** The actual prompt text */
            fun prompt(prompt: String?) = prompt(JsonField.ofNullable(prompt))

            /** Alias for calling [Builder.prompt] with `prompt.orElse(null)`. */
            fun prompt(prompt: Optional<String>) = prompt(prompt.getOrNull())

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

            /** Status of the prompt */
            fun status(status: String?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<String>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Tags associated with the prompt */
            fun tags(tags: String?) = tags(JsonField.ofNullable(tags))

            /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
            fun tags(tags: Optional<String>) = tags(tags.getOrNull())

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<String>) = apply { this.tags = tags }

            /** Use cases - can be dict or list of dicts */
            fun useCases(useCases: UseCases?) = useCases(JsonField.ofNullable(useCases))

            /** Alias for calling [Builder.useCases] with `useCases.orElse(null)`. */
            fun useCases(useCases: Optional<UseCases>) = useCases(useCases.getOrNull())

            /**
             * Sets [Builder.useCases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useCases] with a well-typed [UseCases] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useCases(useCases: JsonField<UseCases>) = apply { this.useCases = useCases }

            /** Alias for calling [useCases] with `UseCases.ofUnionMember0(unionMember0)`. */
            fun useCases(unionMember0: UseCases.UnionMember0) =
                useCases(UseCases.ofUnionMember0(unionMember0))

            /**
             * Alias for calling [useCases] with
             * `UseCases.ofUnnamedSchemaWithArrayParent3s(unnamedSchemaWithArrayParent3s)`.
             */
            fun useCasesOfUnnamedSchemaWithArrayParent3s(
                unnamedSchemaWithArrayParent3s: List<UseCases.UnnamedSchemaWithArrayParent3>
            ) = useCases(UseCases.ofUnnamedSchemaWithArrayParent3s(unnamedSchemaWithArrayParent3s))

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
             * Returns an immutable instance of [Prompt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Prompt =
                Prompt(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("userId", userId),
                    category,
                    description,
                    links,
                    name,
                    prompt,
                    status,
                    tags,
                    useCases,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Prompt = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            userId()
            category().ifPresent { it.validate() }
            description()
            links().ifPresent { it.validate() }
            name()
            prompt()
            status()
            tags()
            useCases().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (links.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (prompt.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (tags.asKnown().isPresent) 1 else 0) +
                (useCases.asKnown().getOrNull()?.validity() ?: 0)

        /** Category name(s) - can be string or list */
        @JsonDeserialize(using = Category.Deserializer::class)
        @JsonSerialize(using = Category.Serializer::class)
        class Category
        private constructor(
            private val string: String? = null,
            private val strings: List<String>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

            fun isString(): Boolean = string != null

            fun isStrings(): Boolean = strings != null

            fun asString(): String = string.getOrThrow("string")

            fun asStrings(): List<String> = strings.getOrThrow("strings")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    strings != null -> visitor.visitStrings(strings)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Category = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitStrings(strings: List<String>) {}
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
                        override fun visitString(string: String) = 1

                        override fun visitStrings(strings: List<String>) = strings.size

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && string == other.string && strings == other.strings
            }

            override fun hashCode(): Int = Objects.hash(string, strings)

            override fun toString(): String =
                when {
                    string != null -> "Category{string=$string}"
                    strings != null -> "Category{strings=$strings}"
                    _json != null -> "Category{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Category")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = Category(string = string)

                @JvmStatic
                fun ofStrings(strings: List<String>) = Category(strings = strings.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [Category] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitStrings(strings: List<String>): T

                /**
                 * Maps an unknown variant of [Category] to a value of type [T].
                 *
                 * An instance of [Category] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws SwarmsClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw SwarmsClientInvalidDataException("Unknown Category: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Category>(Category::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Category {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Category(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    Category(strings = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Category(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Category>(Category::class) {

                override fun serialize(
                    value: Category,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.strings != null -> generator.writeObject(value.strings)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Category")
                    }
                }
            }
        }

        /** Associated links - can be list of dicts or strings */
        @JsonDeserialize(using = Links.Deserializer::class)
        @JsonSerialize(using = Links.Serializer::class)
        class Links
        private constructor(
            private val unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>? = null,
            private val strings: List<String>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unnamedSchemaWithArrayParent2s(): Optional<List<UnnamedSchemaWithArrayParent2>> =
                Optional.ofNullable(unnamedSchemaWithArrayParent2s)

            fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

            fun isUnnamedSchemaWithArrayParent2s(): Boolean = unnamedSchemaWithArrayParent2s != null

            fun isStrings(): Boolean = strings != null

            fun asUnnamedSchemaWithArrayParent2s(): List<UnnamedSchemaWithArrayParent2> =
                unnamedSchemaWithArrayParent2s.getOrThrow("unnamedSchemaWithArrayParent2s")

            fun asStrings(): List<String> = strings.getOrThrow("strings")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unnamedSchemaWithArrayParent2s != null ->
                        visitor.visitUnnamedSchemaWithArrayParent2s(unnamedSchemaWithArrayParent2s)
                    strings != null -> visitor.visitStrings(strings)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Links = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnnamedSchemaWithArrayParent2s(
                            unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                        ) {
                            unnamedSchemaWithArrayParent2s.forEach { it.validate() }
                        }

                        override fun visitStrings(strings: List<String>) {}
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
                        override fun visitUnnamedSchemaWithArrayParent2s(
                            unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                        ) = unnamedSchemaWithArrayParent2s.sumOf { it.validity().toInt() }

                        override fun visitStrings(strings: List<String>) = strings.size

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Links &&
                    unnamedSchemaWithArrayParent2s == other.unnamedSchemaWithArrayParent2s &&
                    strings == other.strings
            }

            override fun hashCode(): Int = Objects.hash(unnamedSchemaWithArrayParent2s, strings)

            override fun toString(): String =
                when {
                    unnamedSchemaWithArrayParent2s != null ->
                        "Links{unnamedSchemaWithArrayParent2s=$unnamedSchemaWithArrayParent2s}"
                    strings != null -> "Links{strings=$strings}"
                    _json != null -> "Links{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Links")
                }

            companion object {

                @JvmStatic
                fun ofUnnamedSchemaWithArrayParent2s(
                    unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                ) =
                    Links(
                        unnamedSchemaWithArrayParent2s =
                            unnamedSchemaWithArrayParent2s.toImmutable()
                    )

                @JvmStatic
                fun ofStrings(strings: List<String>) = Links(strings = strings.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [Links] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnnamedSchemaWithArrayParent2s(
                    unnamedSchemaWithArrayParent2s: List<UnnamedSchemaWithArrayParent2>
                ): T

                fun visitStrings(strings: List<String>): T

                /**
                 * Maps an unknown variant of [Links] to a value of type [T].
                 *
                 * An instance of [Links] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws SwarmsClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw SwarmsClientInvalidDataException("Unknown Links: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Links>(Links::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Links {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<List<UnnamedSchemaWithArrayParent2>>(),
                                    )
                                    ?.let {
                                        Links(unnamedSchemaWithArrayParent2s = it, _json = json)
                                    },
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    Links(strings = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Links(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Links>(Links::class) {

                override fun serialize(
                    value: Links,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unnamedSchemaWithArrayParent2s != null ->
                            generator.writeObject(value.unnamedSchemaWithArrayParent2s)
                        value.strings != null -> generator.writeObject(value.strings)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Links")
                    }
                }
            }

            class UnnamedSchemaWithArrayParent2
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
                     * [UnnamedSchemaWithArrayParent2].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UnnamedSchemaWithArrayParent2]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        unnamedSchemaWithArrayParent2: UnnamedSchemaWithArrayParent2
                    ) = apply {
                        additionalProperties =
                            unnamedSchemaWithArrayParent2.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [UnnamedSchemaWithArrayParent2].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): UnnamedSchemaWithArrayParent2 =
                        UnnamedSchemaWithArrayParent2(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): UnnamedSchemaWithArrayParent2 = apply {
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

                    return other is UnnamedSchemaWithArrayParent2 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UnnamedSchemaWithArrayParent2{additionalProperties=$additionalProperties}"
            }
        }

        /** Use cases - can be dict or list of dicts */
        @JsonDeserialize(using = UseCases.Deserializer::class)
        @JsonSerialize(using = UseCases.Serializer::class)
        class UseCases
        private constructor(
            private val unionMember0: UnionMember0? = null,
            private val unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

            fun unnamedSchemaWithArrayParent3s(): Optional<List<UnnamedSchemaWithArrayParent3>> =
                Optional.ofNullable(unnamedSchemaWithArrayParent3s)

            fun isUnionMember0(): Boolean = unionMember0 != null

            fun isUnnamedSchemaWithArrayParent3s(): Boolean = unnamedSchemaWithArrayParent3s != null

            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

            fun asUnnamedSchemaWithArrayParent3s(): List<UnnamedSchemaWithArrayParent3> =
                unnamedSchemaWithArrayParent3s.getOrThrow("unnamedSchemaWithArrayParent3s")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                    unnamedSchemaWithArrayParent3s != null ->
                        visitor.visitUnnamedSchemaWithArrayParent3s(unnamedSchemaWithArrayParent3s)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): UseCases = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnionMember0(unionMember0: UnionMember0) {
                            unionMember0.validate()
                        }

                        override fun visitUnnamedSchemaWithArrayParent3s(
                            unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                        ) {
                            unnamedSchemaWithArrayParent3s.forEach { it.validate() }
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

                        override fun visitUnnamedSchemaWithArrayParent3s(
                            unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                        ) = unnamedSchemaWithArrayParent3s.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UseCases &&
                    unionMember0 == other.unionMember0 &&
                    unnamedSchemaWithArrayParent3s == other.unnamedSchemaWithArrayParent3s
            }

            override fun hashCode(): Int =
                Objects.hash(unionMember0, unnamedSchemaWithArrayParent3s)

            override fun toString(): String =
                when {
                    unionMember0 != null -> "UseCases{unionMember0=$unionMember0}"
                    unnamedSchemaWithArrayParent3s != null ->
                        "UseCases{unnamedSchemaWithArrayParent3s=$unnamedSchemaWithArrayParent3s}"
                    _json != null -> "UseCases{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid UseCases")
                }

            companion object {

                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) =
                    UseCases(unionMember0 = unionMember0)

                @JvmStatic
                fun ofUnnamedSchemaWithArrayParent3s(
                    unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                ) =
                    UseCases(
                        unnamedSchemaWithArrayParent3s =
                            unnamedSchemaWithArrayParent3s.toImmutable()
                    )
            }

            /**
             * An interface that defines how to map each variant of [UseCases] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitUnionMember0(unionMember0: UnionMember0): T

                fun visitUnnamedSchemaWithArrayParent3s(
                    unnamedSchemaWithArrayParent3s: List<UnnamedSchemaWithArrayParent3>
                ): T

                /**
                 * Maps an unknown variant of [UseCases] to a value of type [T].
                 *
                 * An instance of [UseCases] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws SwarmsClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw SwarmsClientInvalidDataException("Unknown UseCases: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<UseCases>(UseCases::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): UseCases {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                    UseCases(unionMember0 = it, _json = json)
                                },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<List<UnnamedSchemaWithArrayParent3>>(),
                                    )
                                    ?.let {
                                        UseCases(unnamedSchemaWithArrayParent3s = it, _json = json)
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> UseCases(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<UseCases>(UseCases::class) {

                override fun serialize(
                    value: UseCases,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                        value.unnamedSchemaWithArrayParent3s != null ->
                            generator.writeObject(value.unnamedSchemaWithArrayParent3s)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid UseCases")
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnionMember0 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
            }

            class UnnamedSchemaWithArrayParent3
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
                     * [UnnamedSchemaWithArrayParent3].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UnnamedSchemaWithArrayParent3]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        unnamedSchemaWithArrayParent3: UnnamedSchemaWithArrayParent3
                    ) = apply {
                        additionalProperties =
                            unnamedSchemaWithArrayParent3.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [UnnamedSchemaWithArrayParent3].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): UnnamedSchemaWithArrayParent3 =
                        UnnamedSchemaWithArrayParent3(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): UnnamedSchemaWithArrayParent3 = apply {
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

                    return other is UnnamedSchemaWithArrayParent3 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UnnamedSchemaWithArrayParent3{additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Prompt &&
                id == other.id &&
                createdAt == other.createdAt &&
                userId == other.userId &&
                category == other.category &&
                description == other.description &&
                links == other.links &&
                name == other.name &&
                prompt == other.prompt &&
                status == other.status &&
                tags == other.tags &&
                useCases == other.useCases &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                userId,
                category,
                description,
                links,
                name,
                prompt,
                status,
                tags,
                useCases,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Prompt{id=$id, createdAt=$createdAt, userId=$userId, category=$category, description=$description, links=$links, name=$name, prompt=$prompt, status=$status, tags=$tags, useCases=$useCases, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketplaceListAgentsResponse &&
            prompts == other.prompts &&
            totalCount == other.totalCount &&
            status == other.status &&
            timestamp == other.timestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(prompts, totalCount, status, timestamp, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketplaceListAgentsResponse{prompts=$prompts, totalCount=$totalCount, status=$status, timestamp=$timestamp, additionalProperties=$additionalProperties}"
}

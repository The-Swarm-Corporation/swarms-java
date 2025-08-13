// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ModelListAvailableResponse
private constructor(
    private val models: JsonValue,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("models") @ExcludeMissing models: JsonValue = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(models, success, mutableMapOf())

    @JsonProperty("models") @ExcludeMissing fun _models(): JsonValue = models

    /**
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

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
         * Returns a mutable builder for constructing an instance of [ModelListAvailableResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelListAvailableResponse]. */
    class Builder internal constructor() {

        private var models: JsonValue = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modelListAvailableResponse: ModelListAvailableResponse) = apply {
            models = modelListAvailableResponse.models
            success = modelListAvailableResponse.success
            additionalProperties = modelListAvailableResponse.additionalProperties.toMutableMap()
        }

        fun models(models: JsonValue) = apply { this.models = models }

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
         * Returns an immutable instance of [ModelListAvailableResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelListAvailableResponse =
            ModelListAvailableResponse(models, success, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ModelListAvailableResponse = apply {
        if (validated) {
            return@apply
        }

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
    @JvmSynthetic internal fun validity(): Int = (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelListAvailableResponse &&
            models == other.models &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(models, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelListAvailableResponse{models=$models, success=$success, additionalProperties=$additionalProperties}"
}

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
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SwarmCheckAvailableResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val success: JsonField<Boolean>,
    private val swarmTypes: JsonField<Void>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("swarm_types") @ExcludeMissing swarmTypes: JsonField<Void> = JsonMissing.of(),
    ) : this(success, swarmTypes, mutableMapOf())

    /**
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun swarmTypes(): Optional<Void> = swarmTypes.getOptional("swarm_types")

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [swarmTypes].
     *
     * Unlike [swarmTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swarm_types") @ExcludeMissing fun _swarmTypes(): JsonField<Void> = swarmTypes

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
         * Returns a mutable builder for constructing an instance of [SwarmCheckAvailableResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SwarmCheckAvailableResponse]. */
    class Builder internal constructor() {

        private var success: JsonField<Boolean> = JsonMissing.of()
        private var swarmTypes: JsonField<Void> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(swarmCheckAvailableResponse: SwarmCheckAvailableResponse) = apply {
            success = swarmCheckAvailableResponse.success
            swarmTypes = swarmCheckAvailableResponse.swarmTypes
            additionalProperties = swarmCheckAvailableResponse.additionalProperties.toMutableMap()
        }

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

        fun swarmTypes(swarmTypes: Void?) = swarmTypes(JsonField.ofNullable(swarmTypes))

        /** Alias for calling [Builder.swarmTypes] with `swarmTypes.orElse(null)`. */
        fun swarmTypes(swarmTypes: Optional<Void>) = swarmTypes(swarmTypes.getOrNull())

        /**
         * Sets [Builder.swarmTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swarmTypes] with a well-typed [Void] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun swarmTypes(swarmTypes: JsonField<Void>) = apply { this.swarmTypes = swarmTypes }

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
         * Returns an immutable instance of [SwarmCheckAvailableResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SwarmCheckAvailableResponse =
            SwarmCheckAvailableResponse(success, swarmTypes, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SwarmCheckAvailableResponse = apply {
        if (validated) {
            return@apply
        }

        success()
        swarmTypes()
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
        (if (success.asKnown().isPresent) 1 else 0) + (if (swarmTypes.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SwarmCheckAvailableResponse &&
            success == other.success &&
            swarmTypes == other.swarmTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(success, swarmTypes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SwarmCheckAvailableResponse{success=$success, swarmTypes=$swarmTypes, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects

class ClientGetRootResponse
private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

    @JsonCreator private constructor() : this(mutableMapOf())

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

        /** Returns a mutable builder for constructing an instance of [ClientGetRootResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClientGetRootResponse]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clientGetRootResponse: ClientGetRootResponse) = apply {
            additionalProperties = clientGetRootResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ClientGetRootResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClientGetRootResponse =
            ClientGetRootResponse(additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ClientGetRootResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ClientGetRootResponse && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "ClientGetRootResponse{additionalProperties=$additionalProperties}"
}

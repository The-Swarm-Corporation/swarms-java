// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.errors

import com.swarms.api.core.JsonValue
import com.swarms.api.core.http.Headers

abstract class SwarmsClientServiceException
protected constructor(message: String, cause: Throwable? = null) :
    SwarmsClientException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}

package com.swarms.api.errors

open class SwarmsClientException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)

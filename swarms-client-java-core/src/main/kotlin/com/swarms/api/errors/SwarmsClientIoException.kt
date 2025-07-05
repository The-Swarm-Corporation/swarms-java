package com.swarms.api.errors

class SwarmsClientIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    SwarmsClientException(message, cause)

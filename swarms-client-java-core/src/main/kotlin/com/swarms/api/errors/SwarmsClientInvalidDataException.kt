package com.swarms.api.errors

class SwarmsClientInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    SwarmsClientException(message, cause)

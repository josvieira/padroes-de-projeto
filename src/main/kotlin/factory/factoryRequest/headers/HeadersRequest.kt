package org.example.factory.factoryRequest.headers

import okhttp3.Headers
import okhttp3.Headers.Companion.toHeaders

//Cabe uma refatoração
class HeadersRequest {
    fun construirHeaders(cpf: String): Headers {
        return mapOf(
            "Authorization" to "Bearer token",
            "correlationId" to "12345",
            "api-key" to "your-api-key",
            "customerId" to cpf
        ).toHeaders()
    }

    fun construirHeaders(): Headers {
        return mapOf(
            "Authorization" to "Bearer token",
            "correlationId" to "12345",
            "api-key" to "your-api-key"
        ).toHeaders()
    }
}
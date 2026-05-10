package org.example.factory.factoryRequest

import okhttp3.Headers
import org.example.factory.factoryHeaders.GetMethod
import org.example.factory.factoryHeaders.HttpRequest


class HttpRequestFactory {
    fun create(
        method: String,
        url: String,
        headers: Headers,
        body: String? = null
    ): HttpRequest? {

        return when (method) {
            "GET" -> GetMethod(url, headers)

            "POST" -> PostMethod(url, headers, body ?: "")

            else -> null
        }
    }
}
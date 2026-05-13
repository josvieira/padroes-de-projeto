package org.example.factory.factoryHeaders

import okhttp3.Headers
import okhttp3.OkHttpClient
import okhttp3.Request

class GetMethod(
    private val url: String,
    private val headers: Headers
): HttpRequest {

    override fun execute(): Request {

        return Request.Builder()
            .url(url)
            .headers(headers)
            .build()
    }
}
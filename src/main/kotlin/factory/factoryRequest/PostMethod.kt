package org.example.factory.factoryRequest

import okhttp3.Headers
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.example.factory.factoryHeaders.HttpRequest

class PostMethod(
    val url: String,
    val headers: Headers,
    val dody: String
) : HttpRequest{

    override fun execute(): Request {

       return Request.Builder()
            .url(url)
            .headers(headers)
            .post(dody.toRequestBody("application/json".toMediaTypeOrNull()))
            .build()
    }
}
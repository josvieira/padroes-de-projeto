package org.example.factory.`sem-padrao`

import okhttp3.Headers
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import java.sql.DriverManager.println

class PostMethod {

    fun postData(url: String, headers: Headers, body: String) {
        val client = okhttp3.OkHttpClient()
        val requestBody = body.toRequestBody("application/json".toMediaTypeOrNull())
        val request = okhttp3.Request.Builder()
            .url(url)
            .headers(headers)
            .post(requestBody)
            .build()

        val response = client.newCall(request).execute()
        if (response.isSuccessful) {
            val responseData = response.body?.string()
            println("Response: $responseData")
        } else {
            println("Request failed with code: ${response.code}")
        }


    }
}
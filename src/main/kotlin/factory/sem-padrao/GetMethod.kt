package org.example.factory.`sem-padrao`

import okhttp3.Headers
import okhttp3.OkHttpClient
import java.sql.DriverManager.println


class GetMethod {

    fun getData(url: String, headers: Headers){

        val client = OkHttpClient()
        val request = okhttp3.Request.Builder()
            .url(url)
            .headers(headers)
            .get()
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
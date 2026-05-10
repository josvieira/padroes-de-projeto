package org.example.factory.factoryHeaders

import okhttp3.OkHttpClient
import okhttp3.Request

interface HttpRequest {

    fun execute()

    fun executeRequest(client: OkHttpClient, request: Request){
            val response = client.newCall(request).execute()
            if (response.isSuccessful) {
                val responseData = response.body?.string()
                println("Response: $responseData")
            } else {
                println("Request failed with code: ${response.code}")
            }
    }
}
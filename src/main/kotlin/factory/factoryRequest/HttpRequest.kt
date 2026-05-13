package org.example.factory.factoryHeaders

import okhttp3.OkHttpClient
import okhttp3.Request

interface HttpRequest {

    fun execute(): Request

    fun executeCall(request: Request){
//        val client = OkHttpClient()
//        val response = client.newCall(request).execute()
//
//        if (response.isSuccessful) {
//            val responseData = response.body?.string()
//            println("Response: $responseData")
//        } else {
//            println("Request failed with code: ${response.code}")
//        }

        println("Chamada executada para a request: $request")
    }
}
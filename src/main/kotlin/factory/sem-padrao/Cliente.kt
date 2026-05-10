package org.example.factory.`sem-padrao`

import okhttp3.Headers
import okhttp3.Headers.Companion.toHeaders
import java.sql.DriverManager.println

class Cliente {

    fun buscaCliente(cpf: String){

        val headers = constroiHeadersGet(cpf)

        val getMethod = GetMethod().getData("https://api.example.com/clientes/$cpf", headers)

        println("Busca cliente com CPF: $cpf: $getMethod")

    }

    fun cadastrarCliente(cpf: String, nome: String){

        val headers = constroiHeadersPost()

        val body = """
            {
                "cpf": "$cpf",
                "nome": "$nome"
            }
        """.trimIndent()

        val postMethod = PostMethod().postData("https://api.example.com/clientes", headers, body)

        println("Cadastro cliente com CPF: $cpf e nome: $nome: $postMethod")

    }

    private fun constroiHeadersGet(cpf: String): Headers {
        return mapOf(
               "Authorization" to "Bearer token",
               "correlationId" to "12345",
               "api-key" to "your-api-key",
               "customerId" to cpf
           ).toHeaders()
    }

    private fun constroiHeadersPost(): Headers {
        return mapOf(
            "Authorization" to "Bearer token",
            "correlationId" to "12345",
            "api-key" to "your-api-key"
        ).toHeaders()
    }
}
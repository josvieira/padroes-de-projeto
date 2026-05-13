package org.example.factory.factoryRequest

import okhttp3.Headers
import okhttp3.Headers.Companion.toHeaders
import org.example.factory.factoryRequest.headers.HeadersRequest
import java.sql.DriverManager

class Cliente {

    fun buscaCliente(cpf: String){

        val headers = HeadersRequest().construirHeaders(cpf)

        val getMethod = HttpRequestFactory().create("GET","https://api.example.com/clientes/$cpf", headers)

        val request = getMethod?.execute()

        getMethod?.executeCall(request!!)

        DriverManager.println("Busca cliente com CPF: $cpf: $getMethod")

    }

    fun cadastrarCliente(cpf: String, nome: String){

        val headers = HeadersRequest().construirHeaders()

        val body = createBody(cpf, nome)

        val postMethod = HttpRequestFactory().create("POST","https://api.example.com/clientes", headers, body)

        val request = postMethod?.execute()

        postMethod?.executeCall(request!!)

        DriverManager.println("Cadastro cliente com CPF: $cpf e nome: $nome: $postMethod")

    }

    private fun createBody(cpf: String, nome: String): String {
        val body = """
                {
                    "cpf": "$cpf",
                    "nome": "$nome"
                }
            """.trimIndent()
        return body
    }
}
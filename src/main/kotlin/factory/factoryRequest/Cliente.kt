package org.example.factory.factoryRequest

import okhttp3.Headers
import okhttp3.Headers.Companion.toHeaders
import org.example.factory.factoryRequest.headers.HeadersRequest
import java.sql.DriverManager

class Cliente {

    fun buscaCliente(cpf: String){

        val headers = HeadersRequest().construirHeaders(cpf)

        val getMethod = HttpRequestFactory().create("GET","https://api.example.com/clientes/$cpf", headers)

        DriverManager.println("Busca cliente com CPF: $cpf: $getMethod")

    }

    fun cadastrarCliente(cpf: String, nome: String){

        val headers = HeadersRequest().construirHeaders()

        val body = """
            {
                "cpf": "$cpf",
                "nome": "$nome"
            }
        """.trimIndent()

        val postMethod = HttpRequestFactory().create("POST","https://api.example.com/clientes", headers, body)

        DriverManager.println("Cadastro cliente com CPF: $cpf e nome: $nome: $postMethod")

    }
}
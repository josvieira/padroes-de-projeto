package org.example.TemplateMethod

import org.example.factory.factoryRequest.headers.HeadersRequest

interface TemplateIntegration {

    fun <T> execute(parametros: Object){

            buildUrl()

            createHeaders("123456789")

            createBody()

            createRequest()

            executeCall()

            verifyResponse()
        return

    }

    fun buildUrl()

    fun createHeaders(cpf: String){
        HeadersRequest().construirHeaders(cpf)
    }

    fun createBody()

    fun createRequest()

    fun executeCall()

    fun verifyResponse()


}


package TemplateMethod

import org.example.TemplateMethod.TemplateIntegration

class SearchClienteIntegration : TemplateIntegration {
    override fun buildUrl() {
        println("Construindo URL para a integração do cliente Search ")
    }

    override fun createHeaders(cpf: String) {
        println("create Headers Search")
    }

    override fun createBody() {
        println("create body Search")
    }

    override fun createRequest() {
        println("create Request Search")
    }

    override fun executeCall() {
        println("execute call Search")
    }

    override fun verifyResponse() {
        println("verify response Search")
    }
}
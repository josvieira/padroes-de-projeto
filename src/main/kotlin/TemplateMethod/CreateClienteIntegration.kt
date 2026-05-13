package TemplateMethod

import org.example.TemplateMethod.TemplateIntegration

class CreateClienteIntegration : TemplateIntegration {
    override fun buildUrl() {
        println("Construindo URL para a integração do cliente Post ")
    }

    override fun createHeaders(cpf: String) {
        println("create Headers Post")
    }

    override fun createBody() {
        println("create body Post")
    }

    override fun createRequest() {
        println("create Request Post")
    }

    override fun executeCall() {
        println("execute call Post")
    }

    override fun verifyResponse() {
        println("verify response Post")
    }
}
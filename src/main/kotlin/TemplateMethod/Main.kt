package TemplateMethod

fun main(){
    val createClienteIntegration = CreateClienteIntegration()
    val parametro = Object()
    createClienteIntegration.execute<String>(parametro)

    println("--------------------------------------------------")

    val searchClienteIntegration = SearchClienteIntegration()
    searchClienteIntegration.execute<String>(parametro)
}
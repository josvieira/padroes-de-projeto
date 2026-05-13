package org.example.factory.factoryRequest

fun main(){
    val cliente: Cliente = Cliente()

    cliente.buscaCliente("12345678900")
    cliente.cadastrarCliente("12345678900", "João Silva")
}
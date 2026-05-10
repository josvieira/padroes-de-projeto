package org.example.strategy

fun main() {
    val motivoA = "Motivo A"
    val motivoB = "Motivo B"

    val validacaoA = ValidacaoMotivoA()
    val validacaoB = ValidacaoMotivoB()

    val service = ServiceValidation(listOf(validacaoA, validacaoB))
    service.validar(motivoA)
    service.validar(motivoB)

}
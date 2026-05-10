package org.example.strategy

class ServiceValidation(
    val validations: List<ValidacaoStrategy> /*Caso fosse uma service usando o framework Spring por exemplo a lista de validações seria injetada*/
) {

    fun validar(motivo: String){

        val validationsToApply = validations.filter { it.match(motivo) } // Aplica apenas as validações que deram match

        validationsToApply.forEach { it.validate(motivo) }
    }
}
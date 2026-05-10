package org.example.strategy

class ValidacaoMotivoA: ValidacaoStrategy {

    override fun match(motivo: String): Boolean {
        return motivo == "Motivo A"
    }

    override fun validate(motivo: String) {

        println("Validando motivo A")
    }


}
package org.example.strategy

class ValidacaoMotivoB: ValidacaoStrategy {

    override fun match(motivo: String): Boolean {
        return motivo == "Motivo B"
    }

    override fun validate(motivo: String) {
        println("Validando motivo B")
    }
}
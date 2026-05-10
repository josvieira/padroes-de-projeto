package org.example.strategy

interface ValidacaoStrategy {

    fun match(motivo: String): Boolean

    fun validate(motivo: String)
}
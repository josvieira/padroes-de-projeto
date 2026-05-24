package adapter

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

interface UserGateway {

    fun getUser(email: String): User

    fun calcularIdade(dataNascimento: String): Int {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val nascimento = LocalDate.parse(dataNascimento, formatter)
        val hoje = LocalDate.now()
        return Period.between(nascimento, hoje).years
    }
}
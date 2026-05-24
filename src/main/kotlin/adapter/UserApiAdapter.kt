package adapter

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class UserApiAdapter : UserGateway {

    override fun getUser(email: String): User {
        // Simulando uma chamada a uma API externa para obter os dados do usuário
        println("Chamando API externa para obter dados do usuário com email: $email")
        val userAPiResponse = UserApi()
        return User(
            name = userAPiResponse.name_cliente,
            email = userAPiResponse.email_cliente,
            age = calcularIdade(userAPiResponse.data_nascimento_cliente))
    }


}

class UserApi(
    val name_cliente: String = "John Doe",
    val email_cliente: String = "cliente@email.com",
    val data_nascimento_cliente: String = "01/01/1990"
)
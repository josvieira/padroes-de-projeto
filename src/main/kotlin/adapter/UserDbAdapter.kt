package adapter

class UserDbAdapter : UserGateway {

    override fun getUser(email: String): User {
        // Simulando uma consulta a um banco de dados para obter os dados do usuário
        println("Consultando banco de dados para obter dados do usuário com email: $email")
        val userOptionalEntity = UserDb()
        return User(
            name = userOptionalEntity.nom_cli,
            email = userOptionalEntity.txt_corr_eltr,
            age = calcularIdade(userOptionalEntity.dt_nasc_cli))
    }
}

class UserDb(
    val nom_cli: String = "John Doe",
    val txt_corr_eltr: String = "cliente@email.com",
    val dt_nasc_cli: String = "01/01/1990"
)

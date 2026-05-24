package adapter

fun main(){
    val user: UserGateway = UserApiAdapter()
    val cliente = user.getUser("cliente@email.com")

    val userDb: UserGateway = UserDbAdapter()
    val clienteDb = userDb.getUser("cliente@email.com")
}
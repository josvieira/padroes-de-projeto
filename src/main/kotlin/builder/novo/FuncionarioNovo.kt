package builder.novo

import java.time.LocalDateTime
import java.util.*

//Dessa forma funcionaria para um sistema novo, mas se fosse um sistema já existente,
// onde a classe Funcionario já tivesse sido utilizada em diversos lugares do código,
// seria necessário criar uma nova classe FuncionarioBuilder para implementar o padrão Builder,
// e a classe Funcionario continuaria existindo com seus construtores tradicionais. Dessa forma,
// o código que já utiliza a classe Funcionario não precisaria ser alterado,
// e os novos objetos poderiam ser criados utilizando o FuncionarioBuilder.
//Talvez nem precise dessa construção como um builder e seria possível usar ó o valor padrão direto no construtor
//e o set que já tem para o nome e email por ser var
class Funcionario(
    var nome: String = "",
    var email: String = "",
    val idade: Int = 0,
    val cargo: String = "Analista",
    val salario: Double = 3000.0,
    val dataAdmissao: LocalDateTime = LocalDateTime.now(),
    val departamento: String = "TI"
) {

    fun comNome(nome: String): Funcionario {
        this.nome = nome
        return this
    }

    fun comEmail(): Funcionario {
        this.email = nome.lowercase(Locale.getDefault()).replace(" ", ".") + "@empresa.com"
        return this
    }
}
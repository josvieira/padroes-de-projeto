package builder.novo

fun main(){
    val funcionario = Funcionario()
        .comNome("João Silva")
        .comEmail()

    println("Nome: ${funcionario.nome}")
    println("Email: ${funcionario.email}")
    println("Idade: ${funcionario.idade}")
    println("Cargo: ${funcionario.cargo}")
    println("Salário: ${funcionario.salario}")
    println("Data de Admissão: ${funcionario.dataAdmissao}")
    println("Departamento: ${funcionario.departamento}")}
package builder.existente

class FuncionarioBuilder {
    private var nome: String = ""
    private var email: String = ""
    private var idade: Int = 0
    private var cargo: String = "Analista"
    private var salario: Double = 3000.0
    private var dataAdmissao: String = "01/01/2024"
    private var departamento: String = "TI"

    fun comNome(nome: String) : FuncionarioBuilder {
        this.nome = nome
        return this
    }
    fun comEmail(email: String) : FuncionarioBuilder {
        this.email = email
        return this
    }
    fun comIdade(idade: Int) : FuncionarioBuilder {
        this.idade = idade
        return this
    }
    fun comCargo(cargo: String) : FuncionarioBuilder {
        this.cargo = cargo
        return this
    }
    fun comSalario(salario: Double) : FuncionarioBuilder {
        this.salario = salario
        return this
    }
    fun comDataAdmissao(dataAdmissao: String) : FuncionarioBuilder {
        this.dataAdmissao = dataAdmissao
        return this
    }
    fun comDepartamento(departamento: String) : FuncionarioBuilder {
        this.departamento = departamento
        return this
    }

    fun build() =
        Funcionario(nome, email, idade, cargo, salario, dataAdmissao, departamento)
 }
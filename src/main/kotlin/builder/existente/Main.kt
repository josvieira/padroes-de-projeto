package builder.existente

fun main(){
    val funcionarioBuilder = FuncionarioBuilder()
        .comNome("João Silva")
        .comEmail("")

    val funcionario = funcionarioBuilder.build()
}
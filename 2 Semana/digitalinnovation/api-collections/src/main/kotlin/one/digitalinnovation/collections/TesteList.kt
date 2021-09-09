package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario(nome = "Ana Paula", salario = 3000.0 )
    val bia = Funcionario(nome = "Bianca", salario = 3100.0 )
    val pedro = Funcionario(nome =  "Pedro" , salario = 3200.0 )

    val funcionarios = listOf(ana, bia, pedro)

    funcionarios.forEach { println(it) }
    // Buscando só a Ana
    println("==============")
    println(funcionarios.find { it.nome =="Ana Paula" })

}

data class Funcionario(
    val nome:String,
    val salario:Double
){
    override fun toString(): String ="""
        Nome: $nome
        Salario: $salario
    """.trimIndent()
    }

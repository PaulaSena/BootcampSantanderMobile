package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario(nome = "Ana Paula", salario = 6000.0, tipoContratacao = "PJ" )
    val bia = Funcionario(nome = "Bianca", salario = 9100.0,tipoContratacao = "CLT" )
    val pedro = Funcionario(nome =  "Pedro" , salario = 5200.0,tipoContratacao = "CLT" )

    val funcionarios = listOf(ana, bia, pedro)

    funcionarios.forEach { println(it) }
    // Buscando só a Ana
    println("==============")
    println(funcionarios.find { it.nome =="Ana Paula" })

    println("===== sortedBy =========")
    funcionarios
        .sortedBy { it.salario } // Ordenando o objeto por salario do menor para o maior
        .forEach { println(it) } // finaliza todas as operações
    println("===== groupBy =========")
    funcionarios
        .groupBy { it.tipoContratacao } // Agrupando o objeto por tipo de contratação
        .forEach { println(it) } // finaliza todas as operações
}
data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
){
    override fun toString(): String ="""
        Nome: $nome
        Salario: $salario
    """.trimIndent()
    }

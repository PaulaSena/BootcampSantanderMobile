package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1900.0,2200.0, 3700.0, 5100.0)

    for(salario in salarios){
        println(salario)
    }
    println("==============")
    println("Maior salario : ${salarios.maxOrNull()}")
    println("Menor salario : ${salarios.minOrNull()}")
    println("Média salarial : ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0} // se verdade executa
    println("==============")
    println("Salarios acima de 2500.0")

    salariosMaiorQue2500.forEach { println(it) }
}
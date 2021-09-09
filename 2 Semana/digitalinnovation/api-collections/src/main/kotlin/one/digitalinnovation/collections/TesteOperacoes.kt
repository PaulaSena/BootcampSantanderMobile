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

    // Operações com Arrays count, find e any

    println("==============")
    println("Quantos salarios estao entre 2000.0 e 5000.0 dentro do array")

    // Quantos salarios estao entre 2000.0 e 5000.0 dentro do array Range
    println(salarios.count{it in 2000.0..5000.0 }) //range realiza a contagem

    println("==============")
    println("Encontre esse valor")

    println(salarios.find{it ==3700.0 }) //find encontra o valor exato
    println(salarios.find{it ==700.0 }) //find encontra o valor exato

    println("==============")
    println("Encontre qualqr valor verdadeiro")

    println(salarios.any{it ==3700.0 }) //any encontra o valor true ou false
    println(salarios.any{it ==700.0 }) //any encontra o  valor true ou false

}
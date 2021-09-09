package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(size = 3)
    salarios [0] = 1000.0
    salarios [1] = 3000.0
    salarios [2] = 5000.0

    salarios.forEach { println(it) } // for lambda

    println("===============")

    // caso queira modificar o valor da posicion para almentar o salario podemos usar o forEach Indexado pa

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1 // pega o objeto salario para dar 10% de almento

    }
    salarios.forEach { println(it) }

    println("===============")

    val salarios2 = doubleArrayOf(1500.0, 1258.0, 3741.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}
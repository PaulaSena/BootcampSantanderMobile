package one.digitalinnovation.collections

fun main() {
    val nomes= Array<String>(size = 3){""}
    nomes [0] = "Theo"
    nomes [1] = "Sofia"
    nomes [2] = "Pedro"

    for (nome in nomes){
        println(nome)
    }

    println("===========")

    nomes.sort() // ordenando
    nomes.forEach { println(it) } // lambda não precisa declarar o objeto pois tem apenas um escopo

    println("===========")

    val nomes2= arrayOf("Ana", "Pedro", "Bianca")
    nomes2.sort() // ordenando
    nomes2.forEach { println(it) } // lambda não precisa declarar o objeto pois tem apenas um escopo


    println("===========")
}
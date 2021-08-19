package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    ClienteTipo.values().forEach { elemento ->
   //   println("${elemento.name} - $elemento") // Iterar
        println("${elemento.name} - ${elemento.descricao}") // Iterar
    }

    ClienteTipo.values().forEach {
       // println("${it.name} - $1t") // Iterar
        println("${it.name} - ${it.descricao}") // Iterar

    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} -  ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pf.name} -  ${pj.descricao}")
}



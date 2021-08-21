package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.testes.TesteAutenticacao

fun main() {
    val elisabete = Cliente(
        nome = "Elisabete Sena",
        cpf = "55478236",
        clienteTipo = "PJ",
        senha = "123456" )
    println(elisabete)
    TesteAutenticacao().autentica(elisabete)
}


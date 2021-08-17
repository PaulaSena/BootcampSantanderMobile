package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ana Paula Sena"
    var cpf: String = "012.345.678.90"
}

fun main() {
    val paulaSena = Pessoa()  //Variable que recibe la instancia de una persona

    println(paulaSena.nome)
    println(paulaSena.cpf)
}

// Commit Ctrl + K ...
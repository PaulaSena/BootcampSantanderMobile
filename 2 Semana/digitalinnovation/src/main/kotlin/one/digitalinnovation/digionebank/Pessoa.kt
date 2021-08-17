package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ana Paula Sena"
    var cpf: String = "012.345.678.90"

inner class Endereco{   // Clase interna
        var rua: String = "Rua tal"
    }
}
fun main() {
    val paulaSena = Pessoa()  //Variable que recibe la instancia de una persona

    println(paulaSena.nome)
    println(paulaSena.cpf)
    println(paulaSena.Endereco().rua)  // Instanciar una Clase interna
}

// Commit Ctrl + K ...
// En la clase interna es posible realizar una integración de uma API usando o Json creando un Objeto de Response (Dividido) parcial.

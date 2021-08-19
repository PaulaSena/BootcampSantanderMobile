package one.digitalinnovation.digionebank

open class Pessoa(
    open val nome: String,
    open val cpf: String
)


// Agregado Open para herdar de outra classe


 /*       private set // Esta función evita cambiar el valor cpf
    /* *
inner class Endereco{   // Clase interna
        var rua: String = "Rua tal"
    }
*/
    constructor() // Miembros de la clase

    fun pessoaInfo () = "$nome e $cpf"

}
// **** refatorado Teste Pessoa ****

// Commit Ctrl + K ...

/* En la clase interna es posible realizar una integración de uma
 * API usando o Json creando un Objeto de Response (Dividido) parcial..
 */
*/
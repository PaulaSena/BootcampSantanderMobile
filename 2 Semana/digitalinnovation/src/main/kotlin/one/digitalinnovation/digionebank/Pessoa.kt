package one.digitalinnovation.digionebank

abstract class Pessoa(
     open val nome: String,
     open val cpf: String
)
// Transformando la clase Open Pessoa en Abstrata "la clase madre | hija" y regresando el tipo el tipo para val

// Eliminada la propiedad OPEN de VAL

// Agregado OPEN para heredar de otra clase


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
package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome="DigiOne",numero=12) // val digiOneBank = Banco(nome:"DigiOne",numero:12) ** Parametros de entrada ** || Argumentos Nomeaveis

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome="Banco2")

    println(banco2.nome)
    println(banco2.numero)

    //digiOneBank.nome="teste"
}
/*  Para (asignar)Atribuir valor fuera del parámetro debe cambiar(alterar) de val a var
*
*/
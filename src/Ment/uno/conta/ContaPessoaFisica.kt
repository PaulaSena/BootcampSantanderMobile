package Ment.uno.conta

//Mentoria1
class ContaPessoaFisica (
numero:Int,
agencia:String
) {
    private val _numeroConta = numero
    private val _agencia = agencia

    init {
        println("_numeroConta: $numero - _agencia: $agencia")
    }
}
fun main() {
    val conta1 = ContaPessoaFisica(numero = 123, agencia = "001")

    var conta2 = ContaPessoaFisica(numero = 124,agencia = "002")

    var conta3 = ContaPessoaFisica(numero = 125,agencia = "001")

//Ejecutado con Encapsulamento.
}
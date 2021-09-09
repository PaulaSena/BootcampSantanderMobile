package digitalinnovation.src.conta

    class ContaPessoaFisica(
        numero:Int,
        agencia:String
    ) {
        init {
            println("nun: $numero - agencia: $agencia")
        }
    }
    fun main() {
        val conta1 = ContaPessoaFisica(numero = 123, agencia = "001")

        var conta2 = ContaPessoaFisica(numero = 124,agencia = "002")

        var conta3 = ContaPessoaFisica(numero = 125,agencia = "001")

    }


package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

// Instanciando, un empleado Gerente


fun main(){

    val Pedro = Gerente(nome = "Pedro Daurelio Sena", cpf = "883456789", salario = (3000.0))
    imprimeRelatorio(Pedro)
}
fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

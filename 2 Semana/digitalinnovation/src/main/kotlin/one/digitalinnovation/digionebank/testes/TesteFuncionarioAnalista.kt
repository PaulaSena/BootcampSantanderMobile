package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

// Instanciando, un empleado


fun main(){

    val theo =  Analista(nome = "Theo", cpf = "1234567899", salario = (2000.0))
    imprimeRelatorio(theo)
}
fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

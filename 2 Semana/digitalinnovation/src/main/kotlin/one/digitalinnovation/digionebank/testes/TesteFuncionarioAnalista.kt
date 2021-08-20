package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

// Instanciando, un empleado


fun main(){

    val theo =  Analista(nome = "Theo", cpf = "1234567899", salario = (2000.0))
    ImprimeRelatorioFuncionario.imprime(theo)
}
//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

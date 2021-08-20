package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

// Instanciando, un empleado Gerente


fun main(){

    val pedro = Gerente(nome = "Pedro Daurelio Sena", cpf = "883456789", salario = (5000.0))
    ImprimeRelatorioFuncionario.imprime(pedro)
}
//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

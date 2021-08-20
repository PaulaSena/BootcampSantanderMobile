package one.digitalinnovation.digionebank

class Gerente(nome: String, cpf: String, salario: Double) : Funcionario(nome = nome, cpf=cpf, salario=salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
}

// gerente és una especializacion debes receber la fun de la classe abstrata
//Crear la classe testGerente
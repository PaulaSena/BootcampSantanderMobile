package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String

) : Funcionario(nome = nome, cpf=cpf, salario=salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean ="12345" == senha
}

// gerente és una especializacion debes receber la fun de la classe abstrata
//Crear la classe testGerente
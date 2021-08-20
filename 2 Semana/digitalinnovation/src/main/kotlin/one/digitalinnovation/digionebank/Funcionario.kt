package one.digitalinnovation.digionebank

abstract class Funcionario (
    override val nome: String,
    override val cpf: String,
    val salario:Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double;

    override fun toString(): String ="""
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()} 
        
    """.trimIndent()

}
// Usando el modificador Protected para ser usado somente en LA CLASSES HIJAS

// Transformando la clase Open Funcionario en Abstrata  para ser la "Clase hija de la Persona"

// Herencia
// Agregado OVERRIDE para heredar de la clase Persona

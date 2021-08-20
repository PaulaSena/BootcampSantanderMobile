package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario (
    override val nome: String,
    override val cpf: String,
    val salario:BigDecimal
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio(); // LA CLASE DE PRUEBA SE QUEDARÁ AQUÍ
}

// Transformando la clase Open Funcionario en Abstrata  para ser la "Clase hija de la Persona"

// Herencia
// Agregado OVERRIDE para heredar de la clase Persona

package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta (
    val agencia: String,
    val numero: String,
    val saldo:BigDecimal
){
    fun deposito (valor: BigDecimal){

    }
    fun saque(valor: BigDecimal){

    }
}

/*
* Miembros constructores primarios y secundarios
* modificadores de val solo para clases
* */

// Ctrl + k GIT
package one.digitalinnovation.collections

import java.math.BigDecimal

// Função que nao precisa ser herdada

    fun Array<BigDecimal>.somatoria()=this.reduce{ // Essa fun reduz o valor da soma
        acc, valor -> acc + valor
    }
    fun Array<BigDecimal>.media()= // Essa fun realiza o calculo de media
        if(this.isEmpty())BigDecimal.ZERO
        else this.somatoria() / this.size.toBigDecimal()

// realizando TesteFuncoesEstendidas sem herdar
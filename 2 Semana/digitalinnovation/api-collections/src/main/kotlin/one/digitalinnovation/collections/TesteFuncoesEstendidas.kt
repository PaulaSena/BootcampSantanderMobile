package one.digitalinnovation.collections
// array de bigdecimal
fun main() {
    val salarios = arrayOf(
        "3500".toBigDecimal(),
        "4000".toBigDecimal(),
        "5000".toBigDecimal()
    )
    println("==== Realizando uso da Funcao estendida somatoria ====")
    println(salarios.somatoria())


    println("==== Realizando uso da Funcao estendida media ======")
    println(salarios.media())
}
package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario(nome = "Ana Paula", salario = 6000.0, tipoContratacao = "PJ")
    val bia = Funcionario(nome = "Bianca", salario = 9100.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 5200.0, tipoContratacao = "CLT")
// set conjuntos
    val funcionarios1 = setOf(ana) // conjunto 1
    val funcionarios2 = setOf(bia, pedro) // conjunto  2

    println("==== union =====")
    // gerando relatorio com todos os funcionarios
    val resultUnion=funcionarios1.union(funcionarios2) // Uniao dos conjuntos
    resultUnion.forEach{ println(it)}

    println("==== subtract =====")
    // Subtraindo dos conjuntos
    val funcionario3 = setOf(pedro,bia,ana)
    val resultSubtract=funcionario3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it)}

    println("==== intersect =====")
    // Busca resultado em comum nos conjuntos
    val funcionario4 = setOf(pedro,bia,ana)
    val resultIntersect=funcionario4.intersect(funcionarios2)
    resultSubtract.forEach{ println(it)}
}
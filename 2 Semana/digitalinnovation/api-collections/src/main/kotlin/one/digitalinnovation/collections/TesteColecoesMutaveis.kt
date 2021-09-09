package one.digitalinnovation.collections

fun main() {
      val ana = Funcionario(nome = "Ana Paula", salario = 6000.0, tipoContratacao = "PJ" )
      val bia = Funcionario(nome = "Bianca", salario = 9100.0,tipoContratacao = "CLT" )
      val pedro = Funcionario(nome =  "Pedro" , salario = 5200.0,tipoContratacao = "CLT" )

      val funcionarios = mutableListOf(ana, bia)
      funcionarios.forEach {  println(it)}
// Apos a inicialização é possivel realizar alterações nela.
    println("====== ADD =====")
    funcionarios.add(pedro)
    funcionarios.forEach {  println(it)}


    println("====== REMOVE =====")
    funcionarios.remove(ana)
    funcionarios.forEach {  println(it)}

    println("====== SET =====")
    val funcionarioSet = mutableSetOf(ana) // Adicionando ana Utiliando o SetOf
    funcionarioSet.forEach {  println(it)}

    println("====== SetADD =====")
    funcionarioSet.add(ana)
    funcionarioSet.add(bia)
    funcionarioSet.forEach {  println(it)}
}
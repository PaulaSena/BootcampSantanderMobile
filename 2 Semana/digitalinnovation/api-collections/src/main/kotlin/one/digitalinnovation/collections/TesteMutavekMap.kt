package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario(nome = "Ana Paula", salario = 6000.0, tipoContratacao = "PJ")
    val bia = Funcionario(nome = "Bianca", salario = 9100.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 5200.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()
    // pegar os dados da classe repositorio para criar
    repositorio.create(pedro.nome, pedro)
    repositorio.create(ana.nome, ana)
    repositorio.create(bia.nome, bia)

    println(repositorio.findById(bia.nome))

    println("====== findAll- Todos os elementos gravados no mapa =========")
    repositorio.findAll().forEach{println(it)}

    println("====== remove - Remover um elemento do mapa =========")
    repositorio.remove(ana.nome)
    repositorio.findAll().forEach{println(it)}

}
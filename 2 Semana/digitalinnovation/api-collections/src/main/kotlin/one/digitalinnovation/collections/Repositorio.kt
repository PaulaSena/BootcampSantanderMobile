package one.digitalinnovation.collections

class Repositorio<T>{
    private val map = mutableMapOf<String, T>()

    //Simulador de banco de dados
    fun create(id: String, value: T){ // T recebe funcionario de testeMutavelMap
         map[id] = value
    }

    fun remove(id: String) = map.remove(id) // removera dados do mapa

    fun findById(id: String) = map [id]

    fun findAll()=map.values // buscara todos os "T" todos os funcionarios
}
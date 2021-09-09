package one.digitalinnovation.collections

class Repositorio<T>{
    private val map = mutableMapOf<String, T>()

    //Simulador de banco de dados
    fun create(id: String, value: T){ // T recebe funcionario de testeMutavelMap
         map[id] = value
    }

    fun findById(id: String) = map [id]
}
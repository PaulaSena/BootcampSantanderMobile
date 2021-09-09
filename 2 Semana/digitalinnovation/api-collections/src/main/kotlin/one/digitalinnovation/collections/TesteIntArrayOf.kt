package one.digitalinnovation.collections
// Ese da a opcion de crear un array sin ter que pasar todas las instancias inmediatamente
fun main() {
    val values = intArrayOf(2,3,4,1,10,7)
//Lambda
    values.forEach {
        println(it)
    }
// iterando ordenado con values.sort()
    println("===============")
    values.sort()
    values.forEach {
        println(it)
    }
}
package one.digitalinnovation.collections

fun main() {
    val values = IntArray(size = 5)
    values[0]=1
    values[1]=7
    values[2]=6
    values[3]=3
    values[4]=2

    // na iteração temos o valor da variavel e o array em values enquanto estiver
    //valor em size imprima


    for(valor in values){
        println(valor)
    }

    println("==============")
// No forEach o it realiza o papel da variavel valor
    values.forEach {
        println(it)
    }
    println("==============")


// For index realiza a iteração sobre os indices do arrays busca o valor da posição especifica
    for(index in values.indices){
        println(values[index])
    }


    println("==============")
// values.sort() for(valor in values){  realiza a iteração do menor para o maior antes de realizar a impressao atraves do recurso sort()

    values.sort()
    for(valor in values){
        println(valor)
    }

}
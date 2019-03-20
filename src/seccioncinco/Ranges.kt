package seccioncinco

/**
 * Created by User on 21/09/2017.
 */
fun main(args: Array<String>){
    val nums = 1..50
    for(elemento in nums){
        println("elemento $elemento")
    }
    println("--------------------")
    for(elemento in nums step 2){ //de dos en dos step 2  incremento
        println("elemento $elemento")
    }
    println("--------------------")
    for(elemento in nums.reversed()){ //de50 hasta el 1 decremento
        println("elemento $elemento")
    }
    println("--------------------")
    val nums2 = 15 downTo 1

    for(elemento in 15 downTo 3){ //decremento de tres en tres
        println("elemento $elemento")
    }
    println("--------------------")
    for(elemento in 1 until  16){ //no imprime el 16 incrementa de uno en uno
        println("elemento $elemento")
    }
    println("--------------------")
    val nums3 = 1 until 15
    for(elemento in nums3){
        println("El conteo es de ${nums3.count()} elemento")
    }
    println("--------------------")
    var chars = 'A'..'Z'
    for(elementos in chars){
        println(elementos)
    }
}
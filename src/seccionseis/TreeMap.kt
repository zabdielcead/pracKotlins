package seccionseis

import java.util.*

/**
 * Created by User on 25/09/2017.
 */
fun main(args: Array<String>) {
    val nums = listOf(1,2,3,4,5)

    for(elementos in nums){
        println(elementos)
    }

    for((indice,elemento) in nums.withIndex()){ //vamos imprimir indice del array y el elemento que contiene
        println("$indice : $elemento")
    }

    val map = TreeMap<String,Int>()

    map["SEVE"]=27
    map["Alo"]=36

    for((nombre,edad) in map){
        println("$nombre : $edad")
    }
}
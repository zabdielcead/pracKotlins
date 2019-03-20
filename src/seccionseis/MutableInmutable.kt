package seccionseis

/**
 * Created by User on 25/09/2017.
 */
fun main(args: Array<String>) {
    val nums = mutableListOf(0, 1, 2, -12, -24) //listof sea mutable le agregamos podemos modificcar ese arreglo

    nums[2]= 5

    for (elemento in nums) {
        println(elemento)
    }

    val inmutable =  setOf(1,1,4,0,50) //solo lectura no se puede añadir ningun elemento, no muestra valores repetidos

    for (elemento in inmutable){
        println(elemento)
    }

    val mutable = mutableSetOf(51,2,2,33)//  no muestra valores repetidos y podemos añadir

    mutable.add(40)
    for (elemento in mutable){
        println(elemento)
    }

}
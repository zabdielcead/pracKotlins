package seccionnueve

/**
 * Created by User on 06/10/2017.
 */


fun main(args: Array<String>) {
    try {
        println("Ingresa un numero")
        var num1 = readLine()!!.toInt()
        var division = 50 / num1

        println("la division es $division")
    }catch (e:Exception){
        println(e.message)
        println("no se pueden hacer divisiones entre cero")
    }
        println("Aplicacion finalizada")
}
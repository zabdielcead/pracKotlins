package secciondos

fun main(args: Array<String>){


    println("Cuál es tu nombre?")
    val nombre = readLine() // usuario ingrese por consola y ese valor asignarlo a la variable

    println(nombre)

    println("Cuál es tu edad?")
    val edad :Int = readLine()!!.toInt()
    println(edad)



}


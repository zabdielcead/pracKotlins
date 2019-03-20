package seccionseis

/**
 * Created by User on 21/09/2017.
 */
fun main(args: Array<String>){


    val arrayUno = Array<Int>(5){0}


    arrayUno[1] = 1
    arrayUno[2] = 2
    arrayUno[3] = 3
    arrayUno[4] = 100

    println("Array en la posicion 3 es : "+ arrayUno[0])

    for(elemento in arrayUno){
        println(elemento)
    }
    println("se termino el primer for")
    for(indice in 0..4){
        println(arrayUno[indice])
    }


    val fruta = Array<String>(2){""}

    for(indice in 0..1){
        println("Ingresa la fruta del inidice[$indice]")
        fruta[indice]= readLine()!!
    }
    for(indice in 0..1) {
        println("La fruta en el indice [$indice] es : "+ fruta[indice])
    }


}



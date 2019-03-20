package seccionseis

/**
 * Created by User on 22/09/2017.
 */

fun main(args: Array<String>){
    //array lsit se usa cuando no se sabe el tamaño y no cmo el array que si se define el tamaño
    val arrayList = ArrayList<String>()
    arrayList.add("uva")
    arrayList.add("kiwi")
    arrayList.add("platano")
    arrayList.add("papaya")
    println("el elemento en la posicion 3 es: "+arrayList[2])

    for (elemento in arrayList){
        println(elemento)
    }
    println("Elemenots por indice")
    for(frutita in 0..arrayList.size-1){
        println(arrayList[frutita])
    }


    arrayList[1]= "fresa"
    arrayList.set(0,"melon")

    println(arrayList)

    if(arrayList.contains("papaya")){
        println("se ha encontrado")
    }else{
        println("NO se ha encontrado")
    }

}
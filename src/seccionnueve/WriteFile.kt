package seccionnueve

import java.io.FileReader
import java.io.FileWriter

/**
 * Created by User on 06/10/2017.
 */
fun main(args: Array<String>) {
    println("Opcion 1 para leer \n Opcion 2 para escribir")
    var opcion = readLine()!!.toInt()

    when(opcion){
        1 -> {leerArchivo()}
        2 -> {
            println("Escribe tu txto")
            var texto: String = readLine()!!.toString()
            escribirArchivo(texto)
        }

    }




}

fun escribirArchivo(texto:String){
    try {
        var archivo = FileWriter("prueba.txt",true) //para gargar otro texto ,true

        archivo.write(texto+"\n")
        archivo.close()
        println("Se ha guardado correctamente")
    }catch (ex:Exception){
        println(ex.message)

    }

}

fun leerArchivo(){
    try{
        var leer = FileReader("prueba.txt")//

        var caracter : Int?

        do{
            caracter = leer.read()

            print(caracter.toChar())
        }while (caracter != -1)
    }catch(ex:Exception){
        println(ex.message)
    }
}

package seccioncuatro

/**
 * Created by User on 13/09/2017.
 */


fun main(args: Array<String>){
    println("¿cual es el sueldo?")
    val sueldo : Double = readLine()!!.toDouble();

    if(sueldo > 1000){
        println("debe pagar impuestos")
    }


}

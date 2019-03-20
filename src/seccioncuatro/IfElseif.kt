package seccioncuatro

/**
 * Created by User on 14/09/2017.
 */


fun main(args: Array<String>){

    println("¿Que calificacion obtuvo en variables")
    val caliVariables : Int = readLine()!!.toInt()
    println("¿Que calificacion obtuvo en operaciones mat?")
    val caliOperMatematica : Int = readLine()!!.toInt()
    println("¿Que calificacion obtuvo en operadores lógicos")
    val caliOperLogicos : Int = readLine()!!.toInt()
    println("¿Que calificacion obtuvo en condiciones")
    val caliCondiciones : Int = readLine()!!.toInt()

    val promedio = (caliVariables+caliOperMatematica+caliOperLogicos+caliCondiciones)/4

    if(promedio == 10){
        println("tu resultado es excelente, tu promedio es $promedio")
    }else if(promedio == 9){
        println("tu resultado es bueno, tu promedio es $promedio")
    }else if(promedio >= 6 && promedio <= 8){
        println("tu resultado es suficiente, tu promedio es $promedio")
    }else{
        println("tu resultado es INsuficiente, tu promedio es $promedio")
    }
}
package seccionocho

/**
 * Created by User on 05/10/2017.
 */
class Numeros<T>(numero: T){
    init{
        println(numero)
    }
}

fun <T> imprimir(texto:T){
    println(texto)
}

fun main(args:Array<String>){
    var num1= Numeros<Int>(23)
    var num2= Numeros<Double>(23.45)
    var num3 = Numeros<Float>(23.12f)

    imprimir<Int>(22)
    imprimir<String>("Hola mundo")
}
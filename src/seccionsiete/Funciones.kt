package seccionsiete

/**
 * Created by User on 26/09/2017.
 */


fun main(args: Array<String>){

    // fun nombre_funcion(x: Int) Int{} -> x:Int tipo y dato a recibir tipo de, dato a retornar
    //para el llamado de función  val result = double(2)
    //si la funcion no retorna valor se pone : Unit  es opcional

    val resultado = suma(1,2)
   println(resultado)
    sinParametro()
}

fun suma(num1:Int , num2:Int):Int{

    val suma = num1 + num2
    return  suma

}

fun sinParametro(): Unit{
    println("Hola soy un metodo sin parametros")
}
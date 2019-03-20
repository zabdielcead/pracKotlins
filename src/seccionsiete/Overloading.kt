package seccionsiete

/**
 * Created by User on 26/09/2017.
 */

fun main(args: Array<String>){
    //sobrecarga de funciones vamos a tener esta misma funcion pero con diferentes parametos

    var resultado = sumas(5,7)
        println(resultado)

        resultado = sumas(3,2,1)
        println(resultado)

        resultado = sumas(5,4,6,9)
        println(resultado)
}
fun sumas(num1:Int , num2:Int):Int{

    val suma = num1 + num2
    return  suma

}
fun sumas(num1:Int , num2:Int, num3:Int):Int{

    val suma = num1 + num2 + num3
    return  suma

}
fun sumas(num1:Int , num2:Int, num3:Int, num4:Int):Int{

    val suma = num1 + num2 + num3 + num4
    return  suma

}
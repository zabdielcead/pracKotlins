package seccionsiete

/**
 * Created by User on 27/09/2017.
 */
fun main(args: Array<String>){
    val resultado = sumar(3,9)
    println(resultado)

    val result = summa(2,7)
    println(result)

    val resulta = maxim(15,19)
    println(resulta)
    val resultax = maxx(150,19)
    println(resultax)
}

fun sumar(a:Int , b:Int):Int{
    //println(a+b);
    return a+b
}
fun summa(a:Int, b:Int):Int = a+b //inline function no necesitamos hacer el return
fun maxim (num1:Int, num2:Int):Int{
    if(num1>num2)
        return num1
    else
        return num2

}

fun maxx(num:Int , num2:Int): Int = if(num>num2) num else num2
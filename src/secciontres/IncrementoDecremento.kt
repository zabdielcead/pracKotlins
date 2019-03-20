package secciontres

/**
 * Created by User on 12/09/2017.
 */



/*
    prioridades
    1 ()
    2 ++ -- (antes de la variable)
    3 ^
    4 * /
    5 + -
    6 % mod
    7 =
    8 ++ -- despues de la variable

 */
fun main(args: Array<String>){

    var num1 = 10
    val num2 = 5
    val num3 = 2

    val resultado : Int ?

    resultado =  ++num1 + num2
    println("el resultado es $resultado")

}
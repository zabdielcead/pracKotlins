package secciondos

/**
 * Created by User on 11/09/2017.
 */
fun main(args: Array<String>){
    var num1 : Int = 5
    var num2 : Int = 10
    var strnumero : String = "19"
    var num3 : Float   //creamos la varible especificamos tipo de dato pero no inicilaizamos la variable var num1 :  var num3 : Float? = 12.5f

    num1 = num2
    num1 = strnumero.toInt()
    println(num1)
    num3 = num1.toFloat()
    println(num3)

    var strnumero2 : String?
    strnumero2 = num2.toString();
    println(strnumero2)

    var doble: Double

    doble = num3.toDouble()
    println(doble)
}
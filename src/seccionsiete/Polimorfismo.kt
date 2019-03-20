package seccionsiete

/**
 * Created by User on 27/09/2017.
 */

fun main(args: Array<String>){
    polimorfismo(12121)
    polimorfismo(12121.55525)
    polimorfismo(12.345f)
    polimorfismo("seve")
}

//polimorfismo varias funciones con el mismo nombre con el mismo  numero de parametroa pero de diferente tipo de dato esos parametros
fun polimorfismo (num1:Int):Unit{
    println("elnumero es $num1")
}
fun polimorfismo (num1:Double):Unit{
    println("elnumero es $num1")
}

fun polimorfismo (num1:Float):Unit{
    println("elnumero es $num1")
}
fun polimorfismo (num1:String):Unit{
    println("elnumero es $num1")
}
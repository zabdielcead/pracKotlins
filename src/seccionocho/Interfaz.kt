package seccionocho

/**
 * Created by User on 03/10/2017.
 */
interface Operacion{

    fun suma(num1:Int, num2:Int):Int
    fun div(num1:Int, num2:Int):Unit
    fun multiplicar(num1:Int, num2:Int):Int{
        return num1*num2
    }
}


class Oper: Operacion {
    override fun suma(num1: Int, num2: Int): Int {
        return (num1 + num2)*3
    }

    override fun div(num1: Int, num2: Int) {
        println("la division es: "+num1/num2)
    }

}


fun main(args: Array<String>){
    var aoperacion = Oper()
    var miOperacion =  aoperacion.multiplicar(3,5)
    println(miOperacion)
}


//abstracto esta definido pero no tiene cuerpo  nombre recibe parametros y definimos si tiene devolucionde parametros
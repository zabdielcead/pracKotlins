package seccionocho

/**
 * Created by User on 03/10/2017.
 */
open class Human(){

    var palabra : String ? = null  //por defecto todas las variables que creamos son publicass


    open fun saludo(){ //open para sobrescribir la funcion
        println("hola a todos")
    }
}


class Perr(): Human(){ // extiende de : Humano  pero no puede extender a más de una clase por ejemplo gato no puede


     override fun saludo(){ //gracias al open de saludo podemos sobreescribir la funcion override
        println("Soy un perro, Hola a todos")
    }

    fun ladrido(){
        println("Guauuuuu")
    }


    fun getpalabra(){
        super.palabra
    }
}



fun main(args: Array<String>) {

    //herencia en una clase tiene propiedades y metodos y la herencia es que podamos usar esos metodos desde otra parte
    var persona = Human()
    var juanito = persona.saludo()

    var perrito = Perr()
    var coco = perrito.saludo()





    //protected no podemos instanciar la variable
    //private solo la clase puede ver la variable
}
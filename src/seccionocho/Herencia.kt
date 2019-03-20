package seccionocho

/**
 * Created by User on 02/10/2017.
 */
open class Humano(){

    var palabra : String ? = null  //por defecto todas las variables que creamos son publicass


    fun saludo(){
        println("hola a todos")
    }
}


class Perro(): Humano(){ // extiende de : Humano  pero no puede extender a más de una clase por ejemplo gato no puede

    fun ladrido(){
        println("Guauuuuu")
    }

    fun getpalabra(){
        super.palabra
    }
}

class Gato(){
    fun maullido(){
        println("Miauuuuuuuuuuu")
    }
}

fun main(args: Array<String>) {

    //herencia en una clase tiene propiedades y metodos y la herencia es que podamos usar esos metodos desde otra parte
    var persona = Humano()
    var juanito = persona.saludo()

    var perrito = Perro()
    var coco = perrito.saludo()


    println(persona.palabra)


    //protected no podemos instanciar la variable
    //private solo la clase puede ver la variable
}
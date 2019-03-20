package seccionocho



/**
 * Created by User on 06/10/2017.
 */



class Externa{

    private val nombre:String? = null
    //si nosotros quisiaramos aceder a esta varible privada desde la class Anidada añadimos la palabra inner
    inner class Anidada{
            fun mostrar(){
                println("Soy una clase anidada"+nombre)
            }
    }
}




fun main(args: Array<String>) {
    var externa = Externa()
    //var anidada = Externa.Anidada()

    var anidada = Externa().Anidada()
    anidada.mostrar()
}
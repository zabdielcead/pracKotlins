package secciondos

/**
 * Created by User on 12/09/2017.
 */
fun main(args: Array<String>){
    /* null safety !! ->

       si tenemos una variable string o de cualquier otro tipo y recibe null tronara
       para que nuestra variable pueda o no tener variable nulos podemos agregar el signo de pregunta ?(le pueden llgar nulos o no nulos)
        println(nombre!!) estamos diciendo que nombre necesariamente tiene que contener un valor
     */

    val nombre :  String ?
    nombre = null
    println(nombre)}

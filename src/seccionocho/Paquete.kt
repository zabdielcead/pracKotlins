package seccionocho

/**
 * Created by User on 06/10/2017.
 */


fun main(args: Array<String>){
    //no se pueden crear clase y funciones con el mismo nombre pero en el mismo paquete
    var person = Persona("Beto",27,1.71,58.5,"cafes","M")
    println(person.GetNombre())
}


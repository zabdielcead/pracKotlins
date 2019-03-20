package seccionocho

/**
 * Created by User on 28/09/2017.
 */

class Persona(nombre:String, edad: Int, altura:Double, peso:Double,
              colorOjos:String, genero:String){

    var nombre : String? = null
    var edad : Int? = null
    var altura : Double? = null
    var peso : Double? = null
    var colorOjos: String? = null
    var genero: String? = null

     //inicializar, cuando se instancia un objeto de nuestra clase utilizamos la palabra reservada init que se ejecutara automaticamente
    init{//se ejecuta automaticamente cuando se crea un instancia de la clase
         //println("nombre: $nombre")
         this.nombre = nombre
         this.edad = edad
         this.altura = altura
         this.peso = peso
         this.colorOjos = colorOjos
         this.genero = genero


     }

    //xcomportamiento se traduce a funciones
    fun GetNombre (): String?{
        return this.nombre
    }
}


fun main(args: Array<String>){

    var person = Persona("Beto",27,1.71,58.5,"cafes","M")
    println(person.GetNombre())
}
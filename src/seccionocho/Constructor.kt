package seccionocho


class Person(){

    var nombre : String? = null
    var edad : Int? = null
    var altura : Double? = null
    var peso : Double? = null
    var colorOjos: String? = null
    var genero: String? = null
        //person() se considera constructor
    constructor(nombre:String, edad: Int, altura:Double, peso:Double,
                 colorOjos:String, genero:String) : this() {// :this lo primero que se ejecuta carga nuestra clase persona cargar lo de la clase variables de persona
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
    fun GetGenero (): String?{
        return this.genero
    }
}


fun main(args: Array<String>){

    var person = Person("Beto",27,1.71,58.5,"cafes","M")
    println(person.GetNombre()+" genero es: "+ person.GetGenero())
}
package seccionocho

/**
 * Created by User on 03/10/2017.
 */


enum class Meses{

    ENE, FEB, MAR,ABR, MAY, JUN, JUL,AGO, SEPT, OCT, NOV, DIC


}

fun main(args: Array<String>){
    var sextoMes = Meses.JUN
    var primerMes = Meses.ENE

    println("Nombre: "+sextoMes.name)
    println("Posicion: "+sextoMes.ordinal)

    println("Posicion: "+primerMes.ordinal)
    println("Comparar: "+sextoMes.compareTo(primerMes))
    println("Comparar: "+primerMes.compareTo(sextoMes))
    println("inicia for")
    for(item in Meses.values()){
        println(item)
    }

}

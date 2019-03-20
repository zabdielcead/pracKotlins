package seccioncuatro

/**
 * Created by User on 14/09/2017.
 */
fun main(args: Array<String>){
    print("Ingresa la medida en metros: ")
    val medida : Double = readLine()!!.toDouble()

    if(medida >= 1.00){
        if(medida >= 5.00){
            println("la medida $medida sobrepasa los límites aceptados")

        }else{
            println("la medida $medida es aceptable")
        }
    }else{
        println("lo siento no es aceptable")
    }

}
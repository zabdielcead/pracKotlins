package seccioncuatro

/**
 * Created by User on 15/09/2017.
 */
fun main(args: Array<String>){
    val x = 4

    when(x){

        1 -> {
            println("el valor es 1")
        }
        2 -> {
            println("el valor es 2")
        }
        3 ->{
            println("el valor es tres")
        }
        in 5..15 -> println("El valor esta entre 5 y 15")
        !in 5..15 -> println("El valor NO esta entre 5 y 15")
        else -> println("El valor está fuera de rango")


    }


    val promedio = 10
    val resultado = when(promedio){
        10 -> "tu resultado es excelente, tu promedio es $promedio"
        9 -> "tu resultado es bueno, tu promedio es $promedio"
        in 6..8 -> "tu resultado es suficiente, tu promedio es $promedio"
        //6,7,8 -> println("tu resultado es suficiente, tu promedio es $promedio"
        else ->  "tu resultado es INsuficiente, tu promedio es $promedio"
    }
    println(resultado)
}
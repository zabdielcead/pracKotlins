package seccioncinco

/**
 * Created by User on 21/09/2017.
 */


fun main(args: Array<String>){
    for (elemento in 1..5){
        if(elemento == 3) {
           continue //lo de abajo de cotinue no lo hace se va al inico del for
            //break rompe el ciclo
        }
        println(elemento)
    }


    loop@for (contador1 in 1..2){
        println("contador1: $contador1")
        for (contador2 in 1..5){
            println("contador2: $contador2")
                if(contador2 == 2){
                    //break //solo rompe el ciclo del for hijo
                   break@loop //si queremos que se rompa el for padre es decir el ciclo padre e hijo
                }
        }
    }
}
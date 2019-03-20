package seccionseis

/**
 * Created by User on 22/09/2017.
 */
fun main(args: Array<String>){

     val hashMap = hashMapOf(1 to "seve", 2 to "Alondra")
         hashMap.put(3,"Alo")

         println(hashMap[2])


    val letras = arrayOf("a","b","c")
    println(letras[1])

    val nums = listOf(0,1,2,-12,-24) //es una conexion inmutable no pdemos cambiar los valores

    for(elemento in nums){
         println(elemento)
    }

}
package seccionseis

/**
 * Created by User on 22/09/2017.
 */
fun main(args: Array<String>){
    val hashMap = HashMap<Int,String>()
    hashMap.put(1,"Merida")
    hashMap.put(2,"CDMX")
    hashMap.put(50,"PUEBLA")

    println(hashMap[2])

    for(clave in hashMap.keys){
        println(hashMap[clave])
    }
}
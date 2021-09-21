import kotlin.collections.List as List1

fun main (){
    val countries = listOf("USA","JAPAN","USE")

    val capital = arrayListOf<String>()

    for(i in countries){
        println("enter the Capital  of $i :")
        capital.add(readLine()!!)
    }


    for(i in 0..2){
        println("The capital of ${countries[i]} is ${capital[i]}.")
    }

}



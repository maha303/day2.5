import kotlin.collections.List as List1

fun main (){
    var usa = arrayListOf("usa","")
    var uk = arrayListOf("uk","")
    var ksa = arrayListOf("ksa","")


    println("enter the capital  of USA")
    var userinput1 = readLine()!!.toString()
  
    usa.add(userinput1)

    println("enter the capital  of UK")
    var userinput2 = readLine()!!.toString()
   uk.add(userinput2)

    println("enter the capital  of KSA")
    var userinput3 = readLine()!!.toString()
  ksa.add(userinput3)

    val a = ArrayList<ArrayList<String>>()
    a.add(ArrayList(usa))
    a.add(ArrayList(uk))
    a.add(ArrayList(ksa))

    for (i in a ){
        println(i)
    }

}



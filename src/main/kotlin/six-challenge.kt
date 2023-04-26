

fun main(){
    println("Die Sechserreihe ...")


    var punkte = 0
    for (i in 1..10){
        println("$i * 6 = ")
        val input = readLine()!!.toInt()
        val result = i * 6

        if (input == result){
            punkte = punkte + 1
        }
    }

    println("Deine Punkte sind: $punkte")


}
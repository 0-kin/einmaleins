

fun main(){
    println("Die Sechserreihe ...")


    var punkte = 0
    for (i in 1..10){

        val zahl = (1 .. 10).random()

        println("$zahl * 6 = ")

        var input = readLine()!!.toInt()

        var ergebnis = zahl * 6

        if(input == ergebnis) {
            punkte = punkte + 1
        }

    }

    println("Deine Punkte sind: $punkte")


}
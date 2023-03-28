fun main(args: Array<String>) {
    println("Willkommen zur Einmaleins Challenge Niko")

    for(a in 1..10){
        var b = 1
        while (b < 11) {
            try {
                println("$b * $a =")
                val ergebnis = a * b
                val eingabe = readLine()!!.toInt()
                if (ergebnis == eingabe) {
                    println("Richtig gerechnet du Genie")
                    b = b + 1
                } else {
                    println("Falsch gerechnet du Dummkopf")
                }
            } catch (e: Exception) {
                println("Gib eine gültige Zahl ein")
            }
        }
        println("------------------------------------------------")
    }
}
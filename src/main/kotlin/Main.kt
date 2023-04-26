import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

fun main(args: Array<String>) {
    println("Willkommen zur Einmaleins Challenge by Niko")

    println("Welche Reihe möchtest du haben?")

    val reihe = readLine()!!.toInt()

    val timeMillis = measureTimeMillis {

    // for(reihe in 1..10){
        var b = 1
        while (b < 11) {
            try {
                println("$b * $reihe =")
                val ergebnis = reihe * b
                val eingabe = readLine()!!.toInt()
                if (ergebnis == eingabe) {
                    println("Richtig gerechnet du Genie!")
                    b = b + 1
                } else {
                    println("Falsch gerechnet. Probier es nochmal:")
                }
            } catch (e: Exception) {
                println("Gib eine gültige Zahl ein")
            }
        }
        println("Du bist super!!")
        println("           ___\n" +
                "     _..--\"\\  `|`\"\"--.._\n" +
                "  .-'       \\  |        `'-.\n" +
                " /           \\_|___...----'`\\\n" +
                "|__,,..--\"\"``(_)--..__      |\n" +
                "'\\     _.--'`.I._     ''--..'\n" +
                "  `''\"`,#JGS/_|_\\###,---'`\n" +
                "    ,#'  _.:`___`:-._ '#,\n" +
                "   #'  ,~'-;(oIo);-'~, '#\n" +
                "   #   `~-(  |    )=~`  #\n" +
                "   #       | |_  |      #\n" +
                "   #       ; ._. ;      #\n" +
                "   #  _..-;|\\ - /|;-._  #\n" +
                "   #-'   /_ \\\\_// _\\  '-#\n" +
                " /`#    ; /__\\-'__\\;    #`\\\n" +
                ";  #\\.--|  |O  O   |'-./#  ;\n" +
                "|__#/   \\ _;O__O___/   \\#__|\n" +
                " | #\\    [I_[_]__I]    /# |\n" +
                " \\_(#   /  |O  O   \\   #)_/\n" +
                "       /   |        \\\n" +
                "      /    |         \\\n" +
                "     /    /\\          \\\n" +
                "    /     | `\\         ;\n" +
                "   ;      \\   '.       |\n" +
                "    \\-._.__\\     \\_..-'/\n" +
                "     '.\\  \\-.._.-/  /'`\n" +
                "        \\_.\\    /._/\n" +
                "         \\_.;  ;._/\n" +
                "       .-'-./  \\.-'-.\n" +
                "      (___.'    '.___)")
   // }
    }

    val sec = (timeMillis/1000).toInt()

    println("-> Du hast: $sec Sekunden benötigt <-")
}
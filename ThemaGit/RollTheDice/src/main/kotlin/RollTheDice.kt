
import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241129
 */

fun main() {

    // Done: Den Fehler im Programm finden und beheben
    // Done: Den Spieler nach dem Namen fragen
    // Done: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat


    println("wie ist dein Vorname?")
    var vorname = readln()
    println("dein Name ist $vorname")

    do {
        println("weiter spielen Nein=0, Ja=1")
        var neinJa = readln().toInt()

    val aDie = Random

    val playerScore = aDie.nextInt(1..6)
    val computerScore = aDie.nextInt(1..6)

    println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
    when {
        playerScore > computerScore -> println("Du gewinnst")
        playerScore < computerScore -> println("Der Computer gewinnt")
        else -> println("Unentschieden")
    }

    } while ((neinJa != 0) )

}

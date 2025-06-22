import java.time.LocalTime

class LaBonneHeurePour {
    fun demander(): String {
        val heure = LocalTime.now().hour

        return when (heure) {
            in 5..9 -> "les croissants"
            in 12..13 -> "un Welsch"
            in 17..19 -> "l'apéro"
            in 19..21 -> "le dîner"
            else -> "le café"
        }
    }
}

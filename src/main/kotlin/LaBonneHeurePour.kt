import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

class LaBonneHeurePour {
    fun demander(): String {
        val instantUtc = LocalDateTime.now()
        val timezoneParis = ZoneId.of("Europe/Paris")
        val zonedTimeParis = ZonedDateTime.of(instantUtc, timezoneParis)

        val heure = zonedTimeParis.hour

        return when (heure) {
            in 5..9 -> "les croissants"
            in 12..13 -> "un Welsch"
            in 18..20 -> "l'apéro"
            in 20..22 -> "le dîner"
            else -> "le café"
        }
    }
}

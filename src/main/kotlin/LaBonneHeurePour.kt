import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

class LaBonneHeurePour {
    fun demander(): String {
        val nowUtc = LocalDateTime.now()
        val europeParis = ZoneId.of("Europe/Paris")
        val nowFrance = ZonedDateTime.of(nowUtc, europeParis)

        val heureEnFrance = nowFrance.toLocalTime().hour

        return when {
            heureEstDansLaPlage(heureEnFrance, 5, 10) -> "les croissants"
            heureEstDansLaPlage(heureEnFrance, 12, 14) -> "un welsch"
            heureEstDansLaPlage(heureEnFrance, 18, 20) -> "l'apéro"
            else -> "le café"
        }
    }

    private fun heureEstDansLaPlage(heure: Int, debut: Int, fin: Int): Boolean {
        return heure >= debut && heure < fin
    }
}

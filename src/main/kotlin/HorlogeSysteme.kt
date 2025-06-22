import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

class HorlogeSysteme : Horloge {
    override fun heureActuelleEnFrance(): Int {
        val instantUtc = LocalDateTime.now()
        val timezoneParis = ZoneId.of("Europe/Paris")
        val zonedTimeParis = ZonedDateTime.of(instantUtc, timezoneParis)

        return zonedTimeParis.hour
    }

}
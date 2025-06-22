class LaBonneHeurePour(private val horloge: Horloge) {
    fun demander(): String {
        val heure = horloge.heureActuelleEnFrance()

        return when (heure) {
            in 5..9 -> "les croissants"
            in 12..13 -> "un Welsch"
            in 18..20 -> "l'apéro"
            in 20..22 -> "le dîner"
            else -> "le café"
        }
    }
}

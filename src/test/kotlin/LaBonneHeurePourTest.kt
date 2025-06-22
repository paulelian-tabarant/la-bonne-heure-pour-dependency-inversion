import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class LaBonneHeurePourTest {

    @Test
    fun `doit répondre l'apéro entre 18h et 20h`() {
        val result = LaBonneHeurePour().demander()

        // comment figer la date ?

        assertThat(result).isEqualTo("l'apéro")
    }
}
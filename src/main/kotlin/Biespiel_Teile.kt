abstract class Teil(open val name: String) {
}

data class ElementarTeil(override val name: String, val preis: Int) : Teil(name)

data class ZusammengesetztesTeil(override val name: String, val bestandTeile: List<Teil>) : Teil(name) {
    fun berechnePreis(t: Teil): Int {
        if (t is ElementarTeil) {
            return t.preis
        } else if (t is ZusammengesetztesTeil) {
            var sum = 0
            for (i in t.bestandTeile) {
                sum += berechnePreis(i)
            }
            return sum
        } else {
            return 0
        }
    }
}

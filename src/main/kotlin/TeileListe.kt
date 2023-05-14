/*
fun main() {

}

abstract class Teil (open val name : String){
    abstract val bestandTeile:
}
data class ElementarTeil(override val name : String, val preis : Int) : Teil(name){
}
data class ZusammengesetztesTeil(override val name : String, val bestandTeile : List<Teil>) : Teil(name) {
    fun berechnePreis(t: Teil): Int {
        if (t is ElementarTeil) {
            return t.preis
        } else {
            var sum = 0
            for (i in t.bestandTeile) {
                sum += berechnePreis(i)
            }
            return sum
        }
    }
}*/

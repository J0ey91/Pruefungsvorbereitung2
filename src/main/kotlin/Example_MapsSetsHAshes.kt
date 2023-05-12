
fun main() {

    // Wir gründen ein Unternehmen und fügen 3 Kunden unserem Handelspartnerstamm hinzu
    //Einmaliges erzeugen der Klasse
    val tochtergesellschaft1 = Businesspartner(1, "ACTOP GmbH")
    val tochtergesellschaft2 = Businesspartner(2, "BASAR AG")

    //Hinzufügen von Kunden zur Actop GmbH
    tochtergesellschaft1.addBP(1, mutableListOf("Müller GmbH", "30000"))
    tochtergesellschaft1.addBP(2, mutableListOf("Kunreich AG", "800"))
    tochtergesellschaft1.addBP(3, mutableListOf("Schmidt GmbH", "50500"))

    //Hinzufügen von Kunden zur Basar AG
    tochtergesellschaft2.addBP(1, mutableListOf("Meier KG", "3000"))

    //Ausgabe der Kunden der Actop GmbH
    println("Kunden der Actop GmbH: ${tochtergesellschaft1.returnMapBP()}")

    //Ausgabe der Kunden der Basar AG
    println("Kunden der Basar AG: ${tochtergesellschaft2.returnMapBP()}")

    println("")
    println("")

    addAmount(tochtergesellschaft1, 2, 200)
    println("Kunden der Actop GmbH: ${tochtergesellschaft1.returnMapBP()}")
    println("")

}

fun addAmount(businesspartner: Businesspartner, bpId: Int, amount: Int) {
    businesspartner.updateAmount(bpId, amount)
}

class Businesspartner(val id: Int, val name: String) {
    val mapBP: MutableMap<Int, MutableList<String>> = mutableMapOf()

    fun addBP(id: Int, l: MutableList<String>) {
        mapBP[id] = l
    }

    fun updateAmount(id: Int, amount: Int) {
        val bp = mapBP[id]
        if (bp != null) {
            val updatedAmount = (bp[1].toInt() + amount).toString()
            bp[1] = updatedAmount
        }
    }

    fun returnMapBP(): MutableMap<Int, MutableList<String>> {
        return mapBP
    }
}
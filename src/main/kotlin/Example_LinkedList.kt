// Class Node which contains a value and a pointer to the next node
data class Node2(val value: Int, val next: Node2? = null) {
    override fun toString(): String =
        "value: $value, next: ${next?.toString() ?: ""}" // if next is null, return empty string
}

//Class LinkedList which contains a pointer to the head node
data class LinkedList(var head: Node2? = null) {
    fun prepend(value: Int): Unit {
        head = Node2(value, head)
    }

    // This function returns a new LinkedList containing the same elements as the input LinkedList in reverse order
    fun reverse(): LinkedList {
        var current = head
        val reversedList = LinkedList()

        while (current != null) {
            reversedList.prepend(current.value)
            current = current.next
        }

        return reversedList
    }

    // This function returns a new LinkedList containing the element-wise sum of two or more input LinkedLists
    fun addLists(other: LinkedList): LinkedList {
        // Aktueller Knoten der ersten Liste (this)
        var current1 = this.head
        // Aktueller Knoten der zweiten Liste (other)
        var current2 = other.head
        // Übertrag beim Addieren zweier Ziffern (initial auf 0 gesetzt)
        var carry = 0
        // Summe zweier Ziffern (noch nicht berechnet)
        var sum: Int

        // Neue Liste, in die das Ergebnis gespeichert wird
        val resultList = LinkedList()

        // Solange mindestens einer der beiden Knoten nicht null ist
        while (current1 != null || current2 != null) {
            // Wert der Ziffer im ersten Knoten oder 0, falls Knoten null
            val value1 = current1?.value ?: 0
            // Wert der Ziffer im zweiten Knoten oder 0, falls Knoten null
            val value2 = current2?.value ?: 0

            // Summe der beiden Ziffern und Übertrag addieren
            sum = value1 + value2 + carry
            // Übertrag für nächste Stelle berechnen
            carry = sum / 10
            // Einzelstelle des Ergebnisses berechnen
            sum %= 10

            // Einzelstelle als neuen Kopf der Ergebnisliste hinzufügen
            resultList.prepend(sum)

            // Nächste Knoten der beiden Listen betrachten
            current1 = current1?.next
            current2 = current2?.next
        }

        // Falls am Ende noch ein Übertrag vorhanden ist, diesen als neuen Kopf der Ergebnisliste hinzufügen
        if (carry != 0) {
            resultList.prepend(carry)
        }
        // Ergebnisliste zurückgeben
        return resultList
    }

    fun addListWithReversedFunction(other: LinkedList): LinkedList {
        var current1 = this.head
        var current2 = other.head
        var carry = 0
        var sum: Int

        val resultList = LinkedList()

        while (current1 != null || current2 != null) {
            val value1 = current1?.value ?: 0
            val value2 = current2?.value ?: 0

            sum = value1 + value2 + carry
            carry = sum / 10
            sum %= 10

            resultList.prepend(sum)

            current1 = current1?.next
            current2 = current2?.next
        }

        if (carry != 0) {
            resultList.prepend(carry)
        }
        return resultList.reverse()
    }

    override fun toString(): String = "[${head?.toString() ?: ""}]" // if head is null, return empty string
}

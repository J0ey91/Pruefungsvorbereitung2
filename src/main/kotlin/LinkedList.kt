import java.lang.IndexOutOfBoundsException

fun main() {

}

data class LinkedList2(var head: Node? = null) {
    //Element am Anfang einfügen
    fun prepend(value: Int) {
        head = Node(value, head)
    }

    //Wert hinten anfügen
    tailrec fun append(value: Int, curNode: Node? = head) {
        if (curNode == null) {
            prepend(value)
        } else if (curNode.nextNode == null) {
            curNode.nextNode = Node(value)
        } else {
            append(value, curNode.nextNode)
        }
    }

    //Gibt den Wert an Position index zurück
    fun get(index: Int): Int {
        var curIndex = 0
        var curNode = head ?: throw IndexOutOfBoundsException("Liste ist leer")
        while (curIndex != index) {
            curNode = curNode.nextNode ?: throw IndexOutOfBoundsException("Index nicht in Liste")
            curIndex++
        }
        return curNode.value
    }

    fun isEmpty(): Boolean {
        return head == null
    }

    //Prüft ob Wert in Liste enthalten ist
    fun contains(value: Int): Boolean {
        var curNode = head
        while (curNode != null) {
            if (curNode.value == value) {
                return true
            }
            curNode = curNode.nextNode
        }
        return false
    }


    tailrec fun indexOf(x: Int, curNode: Node? = head, accum: Int = 0): Int {
        if (curNode == null) {
            return -1
        } else if (curNode.value == x) {
            return accum
        } else {
            return indexOf(x, curNode.nextNode, accum + 1)
        }
    }

    fun remove(value: Int) {
        var curNode = head
        var prevNode: Node? = null

        while (curNode != null) {
            if (curNode.value == value) {
                if (prevNode == null) {
                    // Das zu entfernende Element ist das erste Element der Liste
                    head = curNode.nextNode
                } else {
                    // Das zu entfernende Element ist nicht das erste Element
                    prevNode.nextNode = curNode.nextNode
                }
                return
            }

            prevNode = curNode
            curNode = curNode.nextNode
        }
    }
}

data class Node(val value: Int, var nextNode: Node? = null){

}


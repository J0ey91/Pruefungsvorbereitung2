/*
fun main() {

}

data class Queue(val list: LinkedList<Int> = LinkedList()) {
    //Elemente am Ende der Liste anfügen
    fun enqueue(value: Int) {
        list.append(value)
    }

    //Zeigt erstes Element der Warteschlange
    fun front(): Int {
        if (list.isEmpty()) {
            throw NoSuchElementException("Queue ist leer")
        }
        return list.get(0)
    }

    //Entfernt erstes Element der Warteschlange
    fun dequeue(): Int {
        if (list.isEmpty()) {
            throw NoSuchElementException("Queue ist leer")
        }
        return list.removeFirst()
    }

    fun dequeue2(): Int {
        if (list.isEmpty()) {
            throw NoSuchElementException("Queue ist leer")
        }
        return list.remove(0)
    }

    fun reverseQueue(): Queue {
        val newQueue = Queue()
        while (!list.isEmpty()) {
            newQueue.enqueue(list.removeFirst())
        }
        return newQueue
    }

    fun isQueueEquals(queue: Queue): Boolean {
        if (list.size() != queue.list.size()) {
            return false
        }
        val tempList = LinkedList(list)
        val tempQueueList = LinkedList(queue.list)
        while (!tempList.isEmpty()) {
            if (tempList.removeFirst() != tempQueueList.removeFirst()) {
                return false
            }
        }
        return true
    }
}
*/

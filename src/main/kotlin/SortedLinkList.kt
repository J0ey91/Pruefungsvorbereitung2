/*
data class SortedLinkList(var head:SortedNode? = null) {
    //Element am Anfang einfügen
    fun prepend(value: Int) {
        head = SortedNode(value, head)
    }
    fun add(value: Int, curNode: Node? = head) {
        if (curNode == null || head!!.value >= value) {
            prepend(value)
        } else {
            var currentNode = curNode
            while (currentNode!!.nextNode != null && currentNode.nextNode!!.value < value) {
                currentNode = currentNode.nextNode
            }
            currentNode.nextNode = Node(value, currentNode.nextNode)
        }
    }
    //Werte zweier Listen addieren + umgekehrtes Ergebnis l1[123] l2[345] l3[758]
    fun addList(list2 : SortedLinkList) : SortedLinkList {
        val l3 : SortedLinkList = SortedLinkList()
        var curNodeL1 : SortedNode? = this.head
        var curNodeL2 : SortedNode? = list2.head

        while(curNodeL1 != null){
            l3.prepend(curNodeL1.value + curNodeL2!!.value)
            curNodeL1 = curNodeL1.nextNode
            curNodeL2 = curNodeL2.nextNode
    }
        return l3.reverse()
    }
    fun reverse() : SortedLinkList {
        val newList : SortedLinkList = SortedLinkList()
        var curNode : SortedNode? = this.head

            while(curNode != null){
            newList.prepend(curNode.value)
                curNode = curNode.nextNode
        }
        return newList
    }
}

    data class SortedNode(val value: Int, var nextNode: SortedNode? = null){
}*/

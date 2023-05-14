
data class NodeTobi(val value : Int, var nextNode: NodeTobi? = null)
data class LinkedListTobi(var head: NodeTobi? = null){
    fun prepend(prp: Int){
        head = NodeTobi(prp,head)
    }

    fun contains (search: Int): Boolean{
        var curNode = head
        while(curNode != null) {
            if(curNode.value == search) {
                return true
            }

            curNode = curNode.nextNode

        }
        return false
    }

    fun removeFirst() {
        head = head?.nextNode
    }

}

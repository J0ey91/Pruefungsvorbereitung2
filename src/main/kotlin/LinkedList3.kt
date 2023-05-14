fun main () {

}

data class LinkedListNew (var head : NodeNew? = null) {
    fun prepend (inputValue : Int){
        head = NodeNew(inputValue, head)
    }
    fun contains (searchValue : Int) : Boolean {
        var curNode = head
       while (curNode != null){
           if (curNode.value == searchValue){
               return true
           }
           curNode = curNode.nextNode
       }
    return false
    }



}

data class NodeNew (val value : Int, var nextNode : NodeNew? = null) {

}
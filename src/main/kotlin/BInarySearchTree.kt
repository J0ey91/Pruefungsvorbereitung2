fun main() {

}

data class BInarySearchTree(var root : TreeNode? = null){
    tailrec fun add (value : Double, curNode : TreeNode? = root){
        if (curNode == null){
            root = TreeNode(value)
        } else if (curNode.value > value){
            if (curNode.left == null){
                curNode.left = TreeNode(value)
            } else {
                add(value, curNode.left)
            }
        } else {
            if (curNode.right == null){
                curNode.right = TreeNode(value)
            } else {
                add(value, curNode.right)
            }
        }
    }
    tailrec fun contains(value : Double, curNode : TreeNode? = root) : Boolean {
        if (curNode == null){
            return false
        } else if (curNode.value == value){
            return true
        } else if (curNode.value > value){
            return contains(value, curNode.left)
        } else {
            return contains(value, curNode.right)
        }
    }
}
data class TreeNode(val value : Double, var left : TreeNode? = null, var right : TreeNode? = null) {

}
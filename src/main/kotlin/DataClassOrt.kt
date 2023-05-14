
fun main(){

    val hannover= Stadt("Hannover")
    val tankstelle = Tankstelle("Allertal")
    val hildesheim=Stadt("Hildesheim")
    hannover.nextOrt.add(tankstelle)
    tankstelle.nextOrt.add(hildesheim)
    hildesheim.nextOrt.add(tankstelle)
    tankstelle.nextOrt.add(hannover)
}
abstract class Ort(open val name:String,open var nextOrt:MutableList<Ort> = mutableListOf()){
}
data class Stadt(override val name:String,override var nextOrt : MutableList<Ort> = mutableListOf()):Ort(name,nextOrt){
}
data class Tankstelle(override val name:String,override var nextOrt:MutableList<Ort> = mutableListOf()):Ort(name,nextOrt){
}

/*fun check TankStop(ort:Ort) : Boolean{
    TODO()
}*/


/*

data class BinarySearchTree(var root:TreeNode?=null){

}

data class TreeNode(val value:Int,var left:TreeNode?=null,var right:TreeNode?=null){

}
*/

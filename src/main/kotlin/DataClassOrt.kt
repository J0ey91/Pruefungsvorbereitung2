/*

fun main(){

    val hannover= Stadt("Hannover")
    val tankstelle = Tankstelle("Allertal")
    val hildesheim=Stadt("Hildesheim")
    hannover.nextOrt.add(tankstelle)
    tankstelle.nextOrt.add(hildesheim)
    hildesheim.nextOrt.add(tankstelle)
    tankstelle.nextOrt.add(hannover)

    val istTankstelleVerfügbar = checkTankstelleVerfügbar(hannover)
    println("Ist eine Tankstelle verfügbar? $istTankstelleVerfügbar")
}
abstract class Ort(open val name:String,open var nextOrt:MutableList<Ort> = mutableListOf()){
}
data class Stadt(override val name:String,override var nextOrt : MutableList<Ort> = mutableListOf()):Ort(name,nextOrt){
}
data class Tankstelle(override val name:String,override var nextOrt:MutableList<Ort> = mutableListOf()):Ort(name,nextOrt){
}

fun checkTankstelleVerfügbar(startOrt: Ort): Boolean {
    val visited = mutableSetOf<Ort>()
    val stack = ArrayDeque<Ort>()
    stack.push(startOrt)

    while (stack.isNotEmpty()) {
        val curOrt = stack.pop()
        if (curOrt is Tankstelle) {
            return true
        }
        visited.add(curOrt)
        for (nextOrt in curOrt.nextOrt) {
            if (nextOrt !in visited) {
                stack.push(nextOrt)
            }
        }
    }

    return false
}





*/

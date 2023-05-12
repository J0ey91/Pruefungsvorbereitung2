
fun main() {
    println("Hello, World!")

    // create a neu egg
    val egg = Egg()
    val cook = "Hans"

    var size1: Int = cookEgg(egg, cook)

}

fun nothingToDoHere() {
    println("Nothing to do here")
}

fun cookEgg(egg: Egg, cook: String): Int {
    println("$cook is cooking the egg")
    egg.color = "Yellow"
    egg.size = 5
    return egg.size
}


class Egg{
    var name = "Eggy"
    var color = "White"
    var size = 10
}
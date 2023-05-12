fun main () {

    println("task one")
    println(binaryToDecimal(1001))
    println(binaryToDecimal(1010))
    println("")

    println("task one (String)")

    println("")


    println("task two")

}

//task one
fun binaryToDecimal (bin : Long) : Int {
    var result = 0
    var power = 1
    var temp = bin

    while (temp != 0L){
        val lastDigit = temp % 10
        temp /= 10
        result += lastDigit.toInt() * power
        power *= 2
    }
    return result
}

//task one (String)
fun binaryStringToDecimal (bin : String) : Int {
    TODO()
}

//task two

// Testkommentar

fun main (){

    println("task one")
    println(checkConst(50))
    println(checkConst(101))
    println("")

    println("task two")
    println(square2(2))
    println(square2(-2))
    println(square2(0))
    println("")

    println("task three")
    println(max2(2,4))
    println(max2(-4,6))
    println(max2(4,4))
    println("")

    println("task four")
    println(abs2(-10))
    println(abs2(10))
    println(abs2(0))
    println("")

    // task five
    println("task five")
    println(modulo2(12,6))
    println(modulo2(7,4))
    println(modulo2(7,-10))
    println("")

    println("task six")
    println(factorial2(20))
    println(factorial2(1))
    println(factorial2(3))
    println("")

    println("task seven")
    println(intersectionPointsToFunction2(1.0,-2.0,-3.0,4.0,1.0,2.0,3.0,-4.0))
    println("")

}

//task one
fun checkConst (inputValue : Int) : Boolean {
    val checkValue = 100
    if (inputValue <= checkValue) {
        return false
    }else {
        return true
    }
}

//task two
fun square2 (inputValue : Int) : Int {
    var result = inputValue * inputValue
    return result
}

//task three
fun max2 (inputValue1 : Int, inputValue2 : Int) : Int {
    if (inputValue1 <= inputValue2) {
        return inputValue2
    }else {
        return inputValue1
    }
}

//task four
fun abs2 (inputValue: Int) : Int {
    val result : Int

    if (inputValue < 0) {
        result = inputValue * (-1)
    } else {
        result = inputValue
    }
    return result
}

//task five
fun modulo2 (zähler : Int, nenner : Int) : Int {
    val result : Int
    if (nenner <= 0 || zähler < 0) {
        abs2(nenner)    //nenner darf nicht 0 sein
        abs2(zähler)    //zähler darf nicht negativ sein
    }

    result = zähler - (nenner * (zähler / nenner))
    return result
}

//task six
fun factorial2(n : Long) : Long {
    var result : Long = 1
    for (i in 1 .. n) {
        result *= i
    }
    return result
}

//Task seven
fun intersectionPointsToFunction2(
    fx1 : Double, fy1 :Double,
    fx2 : Double, fy2 : Double,
    gx1 : Double, gy1 : Double,
    gx2 : Double, gy2 : Double) : String {

    val a1 : Double = steigung (fx1, fx2, fy1, fy2)
    val b1 : Double = verschiebung(fx1, fy1, a1)
    val a2 : Double = steigung(gx1, gx2, gy1, gy2)
    val b2 : Double = verschiebung(gx1, gy1, a2)
    return intersection(a1,b1,a2,b2)
}


/**
 * Eingabe: Koordinaten von zwei Punkten
 * Ausgabe: Steigung der Gerade durch die beiden Punkte
 */
private fun steigung (x1 : Double, x2 : Double, y1 : Double, y2 : Double ) : Double {
    return (y2 - y1) / (x2 -x1)
}
/**
 * Eingabe: Koordinaten eines Punktes und Steigung der Geraden
 * #Ausgabe: Ordinatenabschnitt
 */
private fun verschiebung(x : Double, y : Double, a : Double) : Double {
    return y - a * x
}
/**

Eingabe: Steigung und Ordinatenabschnitt von zwei Geraden
Ausgabe: Schnittpunkt der beiden Geraden
 */
private fun intersection(a1: Double, b1: Double, a2: Double, b2: Double): String {
// Implementierung des Schnittpunkts
// ...
    return "Schnittpunkt der Geraden: ..."
}
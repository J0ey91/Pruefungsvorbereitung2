
// task one
const val MAX_VALUE = 100

fun isOverMaxValue(number: Int): Boolean {
    return number > MAX_VALUE
}

// task two
fun square(number: Int): Int {
    return number * number
}

// task three
fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

// task four
fun abs(number: Int): Int {
    if (number >= 0) {
        return number
    }
    return -number
}

// task five nr a.
fun moduloFromA(x: Int, y: Int): Int {
    var remainder = x
    while (remainder >= y) {
        remainder -= y
    }
    return remainder
}

// task five nr b.
fun moduloFromB(x: Int, y: Int): Int {
    var remainder = abs(x)
    val absY = abs(y)
    while (remainder >= absY) {
        remainder -= absY
    }
    if (x < 0) {
        remainder = -remainder
    }
    return remainder
}

// task six
fun factorial(n: Int): Long {
    if (n <= 1) {
        return 1
    }
    return n.toLong() * factorial(n - 1)
}

// task seven
fun calculateIntersectionA(a1: Double, b1: Double, a2: Double, b2: Double): String {
    // Überprüfen, ob die Geraden parallel sind
    if (a1 == a2) {
        return "Die Geraden sind parallel."
    }
    // Berechnen des Schnittpunkts
    val x = (b2 - b1) / (a1 - a2)
    val y = a1 * x + b1
    return "($x, $y)"
}

// task eight
fun calculateIntersectionB(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): String {
    // Überprüfen, ob die Geraden parallel sind
    if ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4) == 0.0) {
        return "Die Geraden sind parallel."
    }
    // Berechnen des Schnittpunkts
    val x = ((x1*y2 - y1*x2) * (x3 - x4) - (x1 - x2) * (x3*y4 - y3*x4)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4))
    val y = ((x1*y2 - y1*x2) * (y3 - y4) - (y1 - y2) * (x3*y4 - y3*x4)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4))
    return "($x, $y)"
}




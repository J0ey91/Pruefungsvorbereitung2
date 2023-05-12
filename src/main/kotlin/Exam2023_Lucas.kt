

fun main() {
    //Aufgabe 1: Wall
    val firstWall = intArrayOf(21, 3, 5, 14)
    val secondWall = calculateWall(firstWall) // [24, 8, 19]
    val thirdWall = calculateWall(secondWall) // [32, 27]
    val fourthWall = calculateWall(thirdWall) // [59]
    val fifthWall = calculateWall(fourthWall) // [59]

    println("Next Task is: Aufgabe 1: Wall")

    println(fifthWall.contentToString())
    println(fourthWall.contentToString())
    println(thirdWall.contentToString())
    println(secondWall.contentToString())
    println(firstWall.contentToString())

    println("Next Task is: Aufgabe 2: Transfer")


    //Aufgabe 2: Transfer
    // Erstelle den Ausdruck 2*((3+4)*3) als Instanz der BinaryExpression-Klasse.
    val expression = BinaryExpression(
        ValueExpression(2.0),
        BinaryExpression(
            BinaryExpression(
                ValueExpression(3.0),
                ValueExpression(4.0),
                Operator.PLUS
            ),
            ValueExpression(3.0),
            Operator.MULTIPLY
        ),
        Operator.MULTIPLY
    )

    // Ausgabe des Ergebnisses der Auswertung des Ausdrucks.
    println(expression.evaluate()) // 42.0
}

//Aufgabe 1: Wall
fun calculateWall(wall: IntArray): IntArray {
    // If the Wall has only 1 Element left, return the Wall as it is
    if (wall.size == 1) {
        return wall
    }
    // If the Wall is not the last one, calculate the next Wall
    val newWall = IntArray(wall.size - 1)
    for (i in 0 until wall.size - 1) {
        newWall[i] = wall[i] + wall[i + 1]
    }
    return newWall
}


//Aufgabe 2: Transfer
// Definiere eine Enumeration der möglichen Arten von Ausdrücken.
enum class ExpressionType {
    BINARY,
    VALUE
}

// Definiere eine abstrakte Basisklasse Expression, die die Methoden evaluate() und getType() implementiert.
abstract class Expression {
    abstract fun evaluate(): Double
    abstract fun getType(): ExpressionType
}

// Definiere eine Klasse BinaryExpression, die zwei Ausdrücke und einen Operator enthält.
class BinaryExpression(val left: Expression, val right: Expression, val op: Operator) : Expression() {
    override fun evaluate(): Double {
        return op.apply(left.evaluate(), right.evaluate())
    }
    override fun getType(): ExpressionType {
        return ExpressionType.BINARY
    }
}

// Definiere eine Klasse ValueExpression, die einen einzelnen numerischen Wert enthält.
class ValueExpression(val value: Double) : Expression() {
    override fun evaluate(): Double {
        return value
    }
    override fun getType(): ExpressionType {
        return ExpressionType.VALUE
    }
}

// Definiere eine Enumeration von Operationen.
enum class Operator {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE;

    // Implementiere eine Methode apply(), die den Operator auf die beiden Werte anwendet.
    fun apply(left: Double, right: Double): Double {
        return when (this) {
            PLUS -> left + right
            MINUS -> left - right
            MULTIPLY -> left * right
            DIVIDE -> left / right
        }
    }
}
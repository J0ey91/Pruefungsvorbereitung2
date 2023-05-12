import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler

fun main () {

}

// task four Zahlenmauer

fun calcNumberWall (bottomRow : IntArray) : Array<IntArray> {
    val numberWall = Array<IntArray>(bottomRow.size) { intArrayOf() }
    numberWall[0] = bottomRow

    for (i in 1 until bottomRow.size) {
        val nextRow = IntArray(bottomRow.size - 1)

        for (j in 0 until nextRow.size) {
            nextRow[j] = numberWall[i - 1][j] + numberWall[i - 1][j + 1]
        }
        numberWall[i] = nextRow
    }
    return numberWall
}


/*
// task five Rekursive Datenstruktur

enum class BinOP2 {
    Add, Multiply   // Benutzung z.b. "if(operator == BinOp.Add)..."
}
abstract class Expression2() {
    abstract fun evaluate() : Int
}

data class IntValExpr(val value : Int): Expression2() {
    override fun evaluate(): Int {
        return value
    }
}

data class BinOPExpr(val left: Expression2, val right:Expression2, val operator:BinOP2): Expression2() {
    override fun evaluate() : Int {
        if (operator == BinOP2.Multiply) {
            return left.evaluate() * right.evaluate()
        } else if (operator == BinOP2.Add) {
            return left.evaluate() + right.evaluate()
        }
    }
}
*/

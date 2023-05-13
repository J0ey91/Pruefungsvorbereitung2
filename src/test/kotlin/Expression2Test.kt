import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Expression2Test {

    @Test
    fun evaluateTest() {
        val root = BinOpExpr(BinOp.Multiply,BinOpExpr(BinOp.Add, IntValExpr(3),
            BinOpExpr(BinOp.Multiply,IntValExpr(5),IntValExpr(4))),IntValExpr(2))

    Assertions.assertEquals(46,root.evaluate())
    }
}
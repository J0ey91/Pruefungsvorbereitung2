import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ExpressionTest {

    @Test
    fun evaluate() {
        val root = BinOPExpr(
            BinOP.Multiply,
            IntValExpr(2),
            BinOPExpr(
                BinOP.Add,
                BinOPExpr(BinOP.Multiply, IntValExpr(4), IntValExpr(5)),
                IntValExpr(3)
            )
        )
        val result = root.evaluate()
        assertEquals(42, result) // Adjust the expected result based on your intended calculation
    }
}

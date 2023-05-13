fun main() {

}

enum class BinOp {
    Add, Multiply   //Benutzung z.B. "if(operator == BinOP.Add)...."
}

abstract class Expression2 () {
    abstract fun evaluate(): Int
}

data class IntValExpr (val value : Int) : Expression2(){
    override fun evaluate(): Int {
        return value
    }
}

data class BinOpExpr (val operator : BinOp, val right : Expression2, val left : Expression2) : Expression2() {
    override fun evaluate(): Int {
        return if(operator == BinOp.Add){
            left.evaluate() + right.evaluate()
        } else {
            left.evaluate() * right.evaluate()
        }
    }
}
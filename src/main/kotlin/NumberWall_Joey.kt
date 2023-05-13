fun main() {


}

fun calcNumberWalls (bottomRow : IntArray) : Array<IntArray> {
    val numberWall = Array<IntArray>(bottomRow.size) { intArrayOf() }
    numberWall [0] = bottomRow
    for (i in 1 .. bottomRow.size) {
        val nextRow = IntArray(bottomRow.size -1)
        for (j in 0 until nextRow.size) {
            nextRow[j] = numberWall[i - 1][j] + numberWall[i - 1][j + 1]
        }
        numberWall[i] = nextRow
    }
    return numberWall
}



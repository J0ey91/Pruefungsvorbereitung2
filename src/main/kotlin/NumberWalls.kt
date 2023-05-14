import java.util.*


fun main() {
    println(calcNumberWalls(intArrayOf(2,5,4,1))[3][0])
    println(Arrays.toString(calcNumberWalls(intArrayOf(2,5,4,1))))
}





fun calcNumberWalls(bottomRow : IntArray) :  Array<IntArray> {

    val numberWall =  Array<IntArray>(bottomRow.size) { intArrayOf() }
    numberWall[0] = bottomRow

    for (i in 1 until bottomRow.size) { // oder 1 .. bottomRow.size -1
        val nextRow = IntArray(bottomRow.size - i)
        for(j in 0 until nextRow.size) {
            nextRow[j] = numberWall[i - 1][j] + numberWall[i - 1][j + 1]
        }
        numberWall[i] = nextRow

    }


    return numberWall

}
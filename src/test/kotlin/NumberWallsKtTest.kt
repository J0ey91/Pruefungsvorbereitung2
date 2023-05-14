import org.junit.jupiter.api.Assertions.*

class NumberWallsKtTest {

    @org.junit.jupiter.api.Test
    fun calcNumberWalls() {
        val result = calcNumberWalls(intArrayOf(2,5,4,1))

        assertEquals(2,result[0][0])
        assertEquals(5,result[0][1])
        assertEquals(4,result[0][2])
        assertEquals(1,result[0][3])
        assertEquals(7, result[1][0])
        assertEquals(9, result[1][1])
        assertEquals(5, result[1][2])
        assertEquals(16, result[2][0])
        assertEquals(14, result[2][1])
        assertEquals(30,result[3][0])


    }
}
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Exam2023_JoeyKtTest {

    @Test
    fun calcNumberWall() {
        val result = calcNumberWall(intArrayOf(2,5,4,1))

        assertEquals(2,result[0][0])
        assertEquals(5,result[0][1])
        assertEquals(4,result[0][1])
        assertEquals(1,result[0][1])
        assertEquals(7,result[1][0])
        assertEquals(9,result[1][1])
        assertEquals(5,result[1][2])
        assertEquals(16,result[2][0])
        assertEquals(14,result[2][1])
        assertEquals(30,result[3][0])


    }
}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HomeworkOneKtTest {

    @Test
    fun isOverMaxValue() {
        assertEquals(false, isOverMaxValue(0))
        assertEquals(false, isOverMaxValue(100))
        assertEquals(true, isOverMaxValue(101))
    }

    @Test
    fun square() {
        assertEquals(0, square(0))
        assertEquals(1, square(1))
        assertEquals(4, square(-2))
    }

    @Test
    fun max() {
        assertEquals(5, max(5, -1))
        assertEquals(5, max(0, 5))
        assertEquals(-1, max(-1, -2))
    }

    @Test
    fun abs() {
        assertEquals(0, abs(0))
        assertEquals(5, abs(-5))
        assertEquals(3, abs(3))
        assertEquals(3, abs(-3))
    }

    @Test
    fun moduloFromA() {
        assertEquals(1, moduloFromA(5, 2))
        assertEquals(0, moduloFromA(10, 5))
    }

    @Test
    fun moduloFromB() {
        assertEquals(1, moduloFromB(5, 2))
        assertEquals(0, moduloFromB(10, 5))
    }

    @Test
    fun factorial() {
        assertEquals(1, factorial(0))
        assertEquals(1, factorial(1))
        assertEquals(120, factorial(5))
    }

    @Test
    fun calculateIntersectionA(){
        assertEquals("Die Geraden sind parallel.", calculateIntersectionA(0.0, 0.0, 0.0, 0.0))
        assertEquals("(-0.2857142857142857, -0.2857142857142857)", calculateIntersectionA(1.0, 0.0, 8.0, 2.0))
    }
}
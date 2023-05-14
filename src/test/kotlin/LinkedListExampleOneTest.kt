import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LinkedListExampleOneTest{
    //Test all the different Tests
    @Test
    fun testAll() {
        testToStringWithEmptyList()
        testPrependAndRemove()
        testPrependAndClear()
        testPrependMultipleElements()
        testToStringWithSingleNode()
        testPrependWithSingleNode()
        testPrependWithNullNode()
        testToStringWithManyNodes()
        //Test the addList function
        testAddLists()
        //Test the addListWithReversedFunction function
        testAddListsWithReversedFunction()
        println("All tests passed!")
    }

    //Different Test Methods
    @Test
    fun testToStringWithEmptyList() {
        val list = LinkedList()
        assertEquals("[]", list.toString())
        println("testToStringWithEmptyList passed!")
    }

    @Test
    fun testPrependAndRemove() {
        val list = LinkedList()
        list.prepend(3)
        list.prepend(2)
        list.prepend(1)
        assertEquals("[value: 1, next: value: 2, next: value: 3, next: ]", list.toString())
        list.head = list.head?.next
        assertEquals("[value: 2, next: value: 3, next: ]", list.toString())
        list.head = list.head?.next
        assertEquals("[value: 3, next: ]", list.toString())
        list.head = list.head?.next
        assertEquals("[]", list.toString())
        println("testPrependAndRemove passed!")
    }

    @Test
    fun testPrependAndClear() {
        val list = LinkedList()
        list.prepend(3)
        list.prepend(2)
        list.prepend(1)
        assertEquals("[value: 1, next: value: 2, next: value: 3, next: ]", list.toString())
        list.head = null
        assertEquals("[]", list.toString())
        println("testPrependAndClear passed!")
    }

    @Test
    fun testPrependMultipleElements() {
        val list = LinkedList()
        list.prepend(5)
        list.prepend(4)
        list.prepend(3)
        list.prepend(2)
        list.prepend(1)
        assertEquals("[value: 1, next: value: 2, next: value: 3, next: value: 4, next: value: 5, next: ]", list.toString())
        println("testPrependMultipleElements passed!")
    }

    @Test
    fun testToStringWithSingleNode() {
        val node = Node(1)
        val list = LinkedList(node)
        assertEquals("[value: 1, next: ]", list.toString())
        println("testToStringWithSingleNode passed!")
    }

    @Test
    fun testPrependWithSingleNode() {
        val node = Node(1)
        val list = LinkedList(node)
        list.prepend(2)
        assertEquals("[value: 2, next: value: 1, next: ]", list.toString())
        println("testPrependWithSingleNode passed!")
    }

    @Test
    fun testPrependWithNullNode() {
        val list = LinkedList(null)
        list.prepend(2)
        assertEquals("[value: 2, next: ]", list.toString())
        println("testPrependWithNullNode passed!")
    }

    @Test
    fun testToStringWithManyNodes() {
        val list = LinkedList()
        for (i in 1..12) {
            list.prepend(i)
        }
        assertEquals(
            "[value: 12, next: value: 11, next: value: 10, next: value: 9, next: value: 8, next: " +
                    "value: 7, next: value: 6, next: value: 5, next: value: 4, next: value: 3, next: " +
                    "value: 2, next: value: 1, next: ]",
            list.toString()
        )
        println("testToStringWithManyNodes passed!")
    }

    @Test
    fun testAddLists() {
        val list1 = LinkedList()
        list1.prepend(3)
        list1.prepend(2)
        list1.prepend(1)

        val list2 = LinkedList()
        list2.prepend(4)
        list2.prepend(3)
        list2.prepend(2)

        val expectedList = LinkedList()
        expectedList.prepend(3)
        expectedList.prepend(5)
        expectedList.prepend(7)

        assertEquals(expectedList.toString(), list1.addLists(list2).toString())
        println("expectedList: ${expectedList.toString()}" + " = " + "list1: ${list1.toString()} + list2: ${list2.toString()}")
        println("testAddLists passed!")
    }

    @Test
    fun testAddListsWithReversedFunction() {
        // Test case 1
        val list1 = LinkedList()
        list1.prepend(2)
        list1.prepend(4)
        list1.prepend(3)

        val list2 = LinkedList()
        list2.prepend(5)
        list2.prepend(6)
        list2.prepend(4)

        val result = list1.addListWithReversedFunction(list2)
        assertEquals("[value: 7, next: value: 0, next: value: 8, next: ]", result.toString())

        // Test case 2
        val list3 = LinkedList()
        list3.prepend(9)
        list3.prepend(9)
        list3.prepend(9)

        val list4 = LinkedList()
        list4.prepend(1)

        val result2 = list3.addListWithReversedFunction(list4)
        assertEquals("[value: 0, next: value: 0, next: value: 0, next: value: 1, next: ]", result2.toString())

        // Test case 3
        val list5 = LinkedList()
        list5.prepend(1)

        val list6 = LinkedList()
        list6.prepend(9)
        list6.prepend(9)
        list6.prepend(9)

        val result3 = list5.addListWithReversedFunction(list6)
        assertEquals("[value: 0, next: value: 0, next: value: 0, next: value: 1, next: ]", result3.toString())
    }
}
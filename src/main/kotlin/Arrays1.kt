import java.util.Random
import kotlin.math.pow

//Example for Array usages

public fun main() {

    // Difference between array and list
    // List: dynamic size, can't be changed, can't be accessed by index, but mutable can be changed

    // val = will be set only once, can't be changed
    // var = can be changed

    // Create an array of strings
    val periods = arrayOf("Januar", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "Dezember")
    val jan = periods[0]
    val feb = periods[1]
    val dez = periods[11]

    println("The first month of the year is $jan")
    println("The second month of the year is $feb")
    println("The third month of the year is " + periods[2])
    println("The last month of the year is $dez")

    println("")

    // Change the value of an array element
    periods[1] = "Februar"
    periods[2] = "März"

    // No difference to first println Block because the values are stored in val's
    println("The first month of the year is $jan")
    println("The second month of the year is $feb")
    println("The third month of the year is " + periods[2])
    println("The last month of the year is $dez")

    println("")

    val jan1 = periods[0]
    val feb1 = periods[1]
    val mar1 = periods[2]
    val dez1 = periods[11]

    println("The first month of the year is $jan1")
    println("The second month of the year is $feb1")
    println("The third month of the year is $mar1")
    println("The last month of the year is $dez1")

    println("")

    // Loop through an array
    for (period in periods) {
        println(period)
    }

    println("")

    // Create an array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // "it" is the default name for the current element and is used in the lambda expression
    numbers.forEach { println(it) } // gibt alle Elemente aus

    println("")
    // Filter the array to only contain even numbers and save it in a nue array
    val evenNumbers = numbers.filter { it % 2 == 0 } // gibt ein Array mit allen geraden Zahlen zurück
    for (evenNumber in evenNumbers) {
        println(evenNumber)
    }

    println("")

    // Create an array of integers with a specific size and fill it with a lambda expression
    val size = 11
    val powOfTwo = Array(size) { i -> 2.0.pow(i) }
    powOfTwo.forEach { println(it) }

    println("")

    // Use the Function "ageCategory"
    val ageCategoryResult = ageCategoryMethod(200)
    println("User < 18: ${ageCategoryResult[0]}")
    println("User 19 to 65: ${ageCategoryResult[1]}")
    println("User 65+: ${ageCategoryResult[2]}")

    println("")

}

// function which recive a number of current user, then a array will be createt with a size of 3, in thes arrey there will be 3 kategories, first category is user < 18, second is user 19 to 65, third user 65+
fun ageCategoryMethod(numberUser: Int): Array<Int> {
    val ageCategory = Array(3) { i -> 0 }

    for (i in 1..numberUser) {
        val age = Random().nextInt(100)
        if (age < 18) {
            ageCategory[0]++
        } else if (age in 19..65) {
            ageCategory[1]++
        } else {
            ageCategory[2]++
        }
    }
    return ageCategory
}
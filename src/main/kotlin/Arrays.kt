

fun main() {
    val array1 = intArrayOf(2,5,4,1)
    val array2 = intArrayOf(3,6,2)
    val mainArray = arrayOf(array1, array2)



    
    println("result task one")
    assert(23 == sumOfArray(mainArray))

    println(sumOfArray(mainArray))
}

fun sumOfArray (input : Array<IntArray>) : Int {
    var result = 0
    /*  for (i in input.indices ) {
          println(i)
      }
      for (i in 0 until input.size) {
          println(i)
      }*/

    for (intArray in input) {

        for (i in intArray) {
            result += i
        }
    }
    return result
}
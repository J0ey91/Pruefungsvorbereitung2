

fun main() {

    var hashMap : HashMap<String, List<String>>
            = HashMap<String, List<String>> ()


    //adding elements to the hashMap using
    // put() function
    hashMap.put("IronMan" , listOf("1995", "George Lukas", "Greenyer ist ****"))

    println(hashMap["IronMan"])

    // Arrays müssen gleichlang sein um sie zu Addieren

    val array1 = intArrayOf(2,5,4)
    val array2 = intArrayOf(3,6,2)

    var result = intArrayOf()

    for(i in array1.indices) {
        result += array1[i] + array2[i]
    }

    println(result.joinToString())

    val mainArray = arrayOf(array1, array2)


    sumOfList(listOf(listOf(1,5,73,432), listOf(1,6,8,2)))
    
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

fun sumOfList (input : List<List<Int>>) : Int {
    var result = 0

    for (intList in input) {
        for(i in intList) {

            println(i)

            result += i
        }
    }

    for (intList in input) {
        for(i in intList.indices) {

            println(i)

            result += intList[i]
        }
    }

    return result
}
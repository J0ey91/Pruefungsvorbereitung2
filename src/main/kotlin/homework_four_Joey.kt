import kotlin.random.Random
fun main() {

    println("###Array###")

    println("")
    val tempArr: IntArray = createRandomIntArray(10)
    println(tempArr.contentToString())
    println("")

    val tempArr1 : IntArray = sumThrowWithTwoDice(6)
    println(tempArr1.contentToString())
    println("")

    val a : IntArray = intArrayOf(0,1,2,3,4,5,6)
    shuffle(a, 5)
    println("")

    val resultArray : Int = avgArray(a)
    println(resultArray)
    println("")

    val a1 : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0)
    val a2 : DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)
    println(median(a1).toString())
    println(median(a2).toString())
    println("")

    println("###List###")
    println("")
    val myList = createRandomList(5)
    println(myList)
    val myNewList = myList.hashCode()
    println(myNewList)
    println("Send to Heiko")

    println("")

    val shuffledList : MutableList<Int> = mutableListOf(0,1,2,3,4,5,6)
    shuffleList(shuffledList,5)
    println(shuffledList)
    println("")

    val listAvg : Int = avgList(shuffledList)
    println(resultArray)
    println("")

    val l1 : List<Double> = listOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0)
    val l2 : List<Double> = listOf(1.0,2.0,3.0,4.0,5.0)
    println(medianList(l1).toString())
    println(medianList(l2).toString())
    println("")
}



// 1.Schreiben Sie eine Funktion createRandomIntArray(size : Int) : IntArraydie ein IntArray der Längesizemit zufälligen Int-Werten erzeugt.
//Einen zufälligen Int-Wert können Sie mitRandom.nextInt()erzeugen.

fun createRandomIntArray(size: Int) : IntArray {
    val array = IntArray(size)
    for (i in 0 until size) {
        array[i] = Random.nextInt(101)
    }
    return array
}


fun createRandomList(size: Int) : List<Int> {
    val list = MutableList(size) { 0 }
    for (i in list.indices) {
        list[i] = Random.nextInt(101)
    }
    return list
}


//Schreiben Sie eine Funktion,sumThrowsWithTwoDice(numberOfSides : Int) : IntArraydie ein Array mit allen möglichen Summen der Werte eines
//Wurfs bmit zwei Würfeln füllt, also[2,3,3,...,11,11,12](ergibt sich aus den Würfen[(1,1),(1,2),(2,1),...,(5,6),(6,5),(6,6)]mit einem Würfel mit sechs Seiten).
//Die Funktion soll es ermöglichen, die Anzahl der Seiten der beiden Würfel als Parameter zu übergeben.


fun sumThrowWithTwoDice(numberOfSides : Int) : IntArray {
    val tempArray : IntArray = IntArray(numberOfSides)
    //val diceTupel : IntArray = IntArray(numberOfSides * 2)

    for (i in tempArray.indices){
        val t1 = 1 + Random.nextInt(numberOfSides + 1)
        val t2 = 1 + Random.nextInt(numberOfSides + 1)
        //println(" $t1 , $t2")
        tempArray[i] = t1 + t2
    }

    return tempArray
}


//Implementieren Sie eine Funktion shuffle(a : IntArray, numberOfSwaps : Int) : Unit
//welche den Inhalt eines IntArrays vermischt. Zum Vermischen sollenmehrfach (numberOfSwapsoft) die Werte an zwei zufällig ermittelten Indizes getauscht werden.

fun shuffle (a : IntArray, numberOfSwaps : Int) : Unit {
    println(a.contentToString())
    for(i in 0 until numberOfSwaps) {
        val tempIndice1 : Int = Random.nextInt(a.size)
        val tempIndice2 : Int = Random.nextInt(a.size)
        val tempValue1 : Int = a[tempIndice1]
        val tempValue2 : Int = a[tempIndice2]

        if (tempIndice1 != tempIndice2) {
            a[tempIndice1] = tempValue2
            a[tempIndice2] = tempValue1
        }
        println("" + i + " " + a.contentToString())
    }
}

fun shuffleList (list : MutableList<Int>, numberOfSwaps: Int) : Unit {
    println(list.toString())
    for (i in 0 until numberOfSwaps) {
        val swap1 : Int = Random.nextInt(list.size)
        val swap2 : Int = Random.nextInt(list.size)
        val swapValue1 : Int = list[swap1]
        val swapValue2 : Int = list[swap2]

        if (swap1 != swap2){
            list[swap1] = swapValue2
            list[swap2] = swapValue1
        }
        println("" + i + "" + list.toString())
    }
}

//Schreiben Sie eine Funktion, die den Durchschnitt der Werte in einem IntArray ermittelt.

fun avgArray (array : IntArray) : Int {
    var result : Int = 0

    for (i in array.indices){
        result += array [i]
    }

    return result / array.size
}

fun avgList(list : List<Int>) : Int {
    var result : Int = 0

    for (i in list.indices) {
        result += list[i]
    }
    return result
}



//Implementieren Sie eine Funktion std(a : IntArray) : Doubledie die Standardabweichung der Werte eines IntArrays berechnet.
// (Re-cherchieren Sie online, falls Sie nicht wissen sollten, was die Standard-abweichung ist). Was iststd(sumThrowsWithTwoDice(6))?

fun std(a : IntArray) : Double {
    TODO()
}

//Implementieren Sie den in der Vorlesung vorgestellten Insertionsort-Algorithmus. Kopieren Sie dabei nicht den Code aus den
// Vorlesungsfo-lien, sondern versuchen Sie den Algorithmus anhand der Erklärungenselbst zu implementieren.



//Implementieren Sie analog den Bubblesort-Algorithmus.



// Messen Sie die Ausführungszeiten der beiden Algorithmen für verschiedene zufällig generierte IntArrays.
// Schreiben Sie dazu die FunktionenmeasureExecutionTimesInsertionSort(inputSizes : IntArray): IntArrayundmeasureExecutionTimesBubbleSort(inputSizes : IntArray) :IntArray die
// für eine Array an Input-Größen je Eintrag jeweils einen zufälligesIntArray in der spezifizierten Größe erzeugt und sortiert.
// Die gemessenen Zeiten sollen in ein Array geschrieben und zurückgegeben werden.Die Ausführungszeit eines Code-Blocks können
// Sie mitmeasureTimeMillismessen, z.B. so:val elapsed = measureTimeMillis {insertionSort(createRandomIntArray(100000))}
// Führen Sie die Funktionen mit geeigneten Werten aus und Dokumen-tieren Sie die Ergebnisse.



//Folgern Sie aus Ihren Ergebnissen, wie groß die Laufzeit der Sortieral-gorithmen für IntArrays mit einer Million Einträgen wäre.



//Implementieren Sie eine Funktion, die den Median der Werte einesIntArrays berechnet.

fun median(array : DoubleArray) : Double {
    val temp1 : Double
    val temp2 : Double
    val result : Double

    if (array.size % 2 == 0) {
        temp1 = array[(array.size / 2) - 1]
        temp2 = array[(array.size / 2)]
        result = (temp1 + temp2) / 2.0
    } else {
        result = array[array.size / 2]
    }
    return result
}

fun medianList(list : List<Double>) : Double {
    val temp1 : Double
    val temp2 : Double
    val result : Double

    if (list.size % 2 == 0) {
        temp1 = list[(list.size / 2) -1]
        temp2 = list[(list.size / 2)]
        result = (temp1 + temp2) / 2.0
    } else {
        result = list[list.size / 2]
    }
    return result
}


import kotlin.random.Random as Random

fun main() {

    /* val hund1 = Hund("Bello",HundeRasse.CHIUAWA,3.0,"01.01.2019")

     hund1.bellen()
     println(hund1.bellen2())*/


    val student1 = Student(806060,"Greenyer",150,"divers",Schulklasse.HFI422)

    println(student1.pruefungSchreiben())

    val professor = Professor(114555,"Tobi",95,"m",Schulklasse.HFI422)

    println(professor.damokles())


}

/*
enum class HundeRasse() {
    CHIUAWA, DACKEL, GOLDENRETRIEVER
}
*/

/*abstract class Tier(open var name: String,open var gewicht : Double,open var gebDatum : String){

}*/
/*data class Hund (var rasse: HundeRasse, override var name : String, override var gewicht : Double, override var gebDatum : String) : Tier(name,rasse,gewicht,gebDatum){
    fun bellen() {
        println("Wuff " + name)
    }

    fun bellen2() : String {
        return "Wuff2 " + name
    }
}*/


enum class Schulklasse () {
    HFWI422, HFI422
}

abstract class Person (open val name : String, open val alter : Int, open val geschlecht : String, open val klasse : Schulklasse) {

}

data class Student (val matrikelnummer : Int,
                    override var name : String, override var alter : Int,
                    override var geschlecht : String, override val klasse: Schulklasse)
    : Person(name,alter, geschlecht, klasse) {
    fun pruefungSchreiben() : Double {
        return Random(6).nextDouble()
    }

}

data class Professor (val personalnummer : Int, override var name : String, override var alter : Int,
                      override var geschlecht : String, override val klasse: Schulklasse)
    : Person(name,alter, geschlecht, klasse) {


    fun damokles (): String {
        return "Ich hasse Menschen!"
    }}


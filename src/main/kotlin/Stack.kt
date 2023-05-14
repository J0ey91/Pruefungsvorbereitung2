
fun main() {

}
data class Stack (val list : LinkedListTobi = LinkedListTobi()){
//Elemente am Anfang der Liste anfügen
    fun push(value : Int){
        list.prepend(value)
    }
//Zeigt erste Elemente des Stapels
    fun peek() : Int?{
        return list.head?.value
    }
//Entfernt erstes Element des Stapels
    fun pop () : Int? {
        val value = peek()
        list.removeFirst()
        return value
    }
    //Prüft ob Stapel leer ist
    fun isEmpty() : Boolean{
        return list.head == null
    }
}

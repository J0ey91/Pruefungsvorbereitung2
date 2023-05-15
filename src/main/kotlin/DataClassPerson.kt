abstract class Personen (open var id : Int, open var name : String, open var age : Int) {

}

data class Student2 (override var id : Int, override var name : String, override var age : Int,
                    var grade : Double) : Personen(id,name,age){
    //Funktion, die die Details des übergeordneten Studentenobjekts in der Konsole ausgibt (toString)
    override fun toString() : String {
        return "$name $age $id $grade."
    }
}

data class Professor2 (override var id : Int, override var name : String, override var age : Int,
                      var subject : String) : Personen (id,name,age){

}

data class Course (val name:String, val dozent : Professor2, var studentList : List<Student2>) {
    //Funktion, um den durchschnittlichen Notenwert aller Studenten in der Liste zurückgibt
    fun getAvgGrade () : Double {
        var result : Double = 0.0
        for (i in studentList.indices){
            result += studentList[i].grade
        }
        return result
    }
    //Funktion, um den ältesten Studenten wiederzugeben
    fun getOldestStudent(): Student2? {
        var curOldestStudent : Student2? = null
        for (i in studentList.indices){
            if (curOldestStudent == null){
                curOldestStudent = studentList[i]
            } else if(curOldestStudent!!.age < studentList[i].age){
                curOldestStudent= studentList[i]
            }
        }
        return curOldestStudent
    }
    //Funktion, um eine Liste von Studenten mit der Mindestnote auszugeben
    fun filterStudentByGrade(minGrade : Double) : List<Student2> {
        val resultList : List<Student2> = emptyList()
        for (i in studentList.indices){
            if(studentList[i].grade >= minGrade){
                resultList.plus(studentList[i])
            }
        }
        return resultList
    }
}

package org.example

data class Student(val firstName: String, val lastName: String,
                   val house: String, val year: Int = 1)

// работает
fun main() {
    val s1 = Student("Ron", "Weasley", "Gryffindor")
    val s2 = Student("Draco", "Malfoy", house = "Slytherin")
    val s3 = s1.copy(firstName = "Fred", year = 3)
    val s4 = s3.copy(firstName = "George")
    val array = arrayOf(s1, s2, s3, s4)
    for ((firstName, lastName, house, year) in array) {
        println("$firstName $lastName is in $house year $year")
    }
}



//data class Student(val firstName: String, val lastName: String,
//                   val house: String, val year: Int = 1)
//
//fun main() {
//    val s1 = Student("Ron", "Weasley", "Gryffindor")
//    val s2 = Student(lastName = "Malfoy", firstName = "Draco", year = 1) // не передан аргумент для параметра house
//    val s3 = s1.copy(firstName = "Fred")
//    s3.year = 3 // переменная  s3 не может быть изменена, т.к. val
//    val s4 = s3.copy(firstName = "George")
//    val array = arrayOf(s1, s2, s3, s4)
//    for (s in array) {
//        println("${s.firstName} ${s.lastName} is in ${s.house} year ${s.year}")
//    }
//}
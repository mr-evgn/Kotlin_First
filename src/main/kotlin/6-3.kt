package org.example

val petsLiam = listOf("Cat",  "Fish", "Fish", "Dog")
val petsSophia= listOf("Cat", "Owl")
val petsNoah= listOf("Dog","Dove", "Dog", "Dove")
val petsEmily= listOf("Hedghog")

//fun main(){
//    var pets: MutableList<String> = mutableListOf()
//    pets.addAll(petsLiam)
//    pets.addAll(petsSophia)
//    pets.addAll(petsNoah)
//    pets.addAll(petsEmily)
//    println(petsLiam.size)
//}


//fun main(){
//    println(petsLiam.size)
//}


//fun main(){
//val petSet = petsLiam.toMutableSet()
//println(petSet.size)
//}


fun main() {
    val petList = petsLiam.toMutableList()
    petList.sort()
    println(petList)
}
package org.example

fun main() {
    val index = arrayOf(1,2,3,4)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry","Pomegranete")
    var x = 0
    var y: Int
    while (x < 4) {
        y = index[x]
        println("Fruit =${fruit[y]}")
        x = x + 1


    }
}
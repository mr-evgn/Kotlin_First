package org.example

//  A. Создает с одним элементами
class Duck(val size: Int = 17) {
    override fun equals(other: Any?): Boolean {
        if(this=== other) return true
        if (other is Duck && size == other.size)return true
        return false
    }

    override fun hashCode(): Int {
        return size
    }
}


//  B. Создает с двумя элементами
//class Duck(val size: Int = 17) {
//    override fun equals(other: Any?): Boolean {
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 7
//    }
//}


//  C. Создает с двумя элементами
//data class Duck(val size: Int = 18)


//  D. Создает с двумя элементами
//class Duck(val size: Int = 17) {
//    override fun equals(other: Any?): Boolean {
//        return true
//    }
//
//    override fun hashCode(): Int {
//        return (Math.random()* 100).toInt()
//    }
//}

fun main() {
    val set = setOf(Duck(), Duck(17))
    println(set)
}
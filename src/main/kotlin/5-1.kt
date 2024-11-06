package org.example

// A.  Компилируется и возвращает верный ответ
class Cat(var name: String? = "") {


    fun Meow() {
        println("Meow!")
    }
}

fun main() {
    var myCats = arrayOf(Cat("Misty"), null, Cat("Socks"))
    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}:")
            cat.Meow()
        }
    }
}


// B. Компилится, но возвращает имя кота - null
//class Cat(var name: String? = null) {
//
//
//    fun Meow() {
//        println("Meow!")
//    }
//}
//
//fun main() {
//    var myCats = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))
//    for (cat in myCats) {
//        if (cat != null) {
//            print("${cat.name}:")
//            cat.Meow()
//        }
//    }
//}


//C. Компилируется, но для второго элемента выводит null
//class Cat(var name: String? = null) {
//
//
//    fun Meow() {
//        println("Meow!")
//    }
//}
//
//fun main() {
//    var myCats = arrayOf(Cat("Misty"), null, Cat("Socks"))
//    for (cat in myCats) {
//
//            print("${cat?.name}:")
//            cat?.Meow()
//
//    }
//}


//D.  Null can not be a value of a non-null type String
//class Cat(var name: String = "") {
//
//
//    fun Meow() {
//        println("Meow!")
//    }
//}
//
//fun main() {
//    var myCats = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))
//    for (cat in myCats) {
//        if (cat != null) {
//            print("${cat?.name}:")
//            cat?.Meow()
//        }
//    }
//}


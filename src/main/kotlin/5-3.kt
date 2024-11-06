package org.example


fun main() {
//    val test: String = "Yes"
    val test: String = "No"
    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }
    println("End of main")
}

fun riskyCode(test: String) {
    println("Start risky code")
    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code")
}

class BadException : Exception()
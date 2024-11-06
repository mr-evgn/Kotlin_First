package org.example

class BadException : Exception()

fun myFunction(test: String) {
    try {
        println("t")
        riskyCode(test)
        println("w")
    } catch (e: BadException) {
        println("a")
    } finally {
        println("s")
    }
}

fun riskyCode(test: String) {
    println("h")
    if (test == "Yes") {
        throw BadException()
    }
}
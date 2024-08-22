package org.example

fun main() {
    var x = 0
    var y = 0
    while (x < 5) {
        x = x + 2
        y = y + x
        print("$x$y")
        x = x + 1

    }
}
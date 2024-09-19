package org.example

class TapeDeck {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing")
    }

    fun recordTape() {
        if (hasRecorder) {
            println("Tape recording")
        }
    }
}

class DVDplayer(var hasRecorded: Boolean) {
    // B   Нет объявлене функция playDVD
    fun playDVD() {
        println("DVD playing")
    }

    fun recordDVD() {
        if (hasRecorded) {
            println("DVD recording")
        }
    }
}

fun main() {
//  A    Не был создан объект со ссылкой t на него
    val t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()


    val d = DVDplayer(true)
    d.playDVD()
    d.recordDVD()
}
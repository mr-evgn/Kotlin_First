package org.example
// Вопрос. Этот файл я создавал как Kotlin file. Нужно было создавать как Class? Или различий нет?
class Rectangle(var width: Int, var height: Int){
    val isSquare : Boolean
        get()= (width == height)
    val area: Int = (width * height)
}

fun main(){
    var r = arrayOf(Rectangle(1,1), Rectangle(1,1),
                    Rectangle(1,1),Rectangle(1,1))
    for (x in 0 .. 3){
        r[x].width = (x+1)* 3
        r[x].height = x + 5
        print("Rectangle $x has area ${r[x].area}.")
        println("It is ${if (r[x].isSquare)"" else "not"} a square." )
    }
}
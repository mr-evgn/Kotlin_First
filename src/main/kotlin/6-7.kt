//A. Не компилируется. Находится в in позиции
//interface A<out T> {
//    fun myFunction(t: T)
//}


////B. Норм
//interface B<out T> {
//    val x: T
//    fun myFunction(): T
//}


//C. Type parameter T is declared as 'out' but occurs in 'invariant' position in type T
//Тут что-то с инвариантами. Изменяемый тип
//var нельзя использовать
//
//interface C<out T> {
//    var y: T
//    fun myFunction(str: String): T
//}


//D. Норм
//interface D<out T> {
//    fun myFunction(str: String): T
//}


//E. Неразрешенная ссылка на класс T
//abstract class E<outT>(t: T) {
//    val x = t
//}



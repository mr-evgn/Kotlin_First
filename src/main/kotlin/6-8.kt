//A. Норм
//class A<in T>(t: T) {
//    fun myFunction(t: T) {}
//}
//
//
//B. Не определен Class T
//class B<inT>(t: T) {
//    val x = t
//    fun myFunction(t: T) {}
//}
//
//
//C. Должен быть ковариантным(out )
//abstract class C<in T> {
//    fun myFunction(): T {
//
//    }
//}


//D. Изменяемый тип var нельзя использовать в данной конструкции
//class E<inT>(t: T) {
//    var y = t
//    fun myFunction(t: T) {
//
//    }
//}
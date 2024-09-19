

open class Monster {
//   1A
     open fun frighten(): Boolean{
         println("Aargh!")
         return true
//   2A
//     fun frighten(): Boolean{
//         println("Aargh!")
//         return true
//   3A
//    open fun frighten(): Boolean{
//         println("Aargh!")
//         return false
   }
}

 class Vampire: Monster(){
//     1B
     override fun frighten(): Boolean {
         println("Fancy a bite?")
     return false

//     2B  функция в родительском классе не может быть переопределена
//     override fun frighten(): Boolean {
//         println("Fancy a bite?")
//         return true

//     3B  Компилируется. Но я вообще не понял что здесь к чему. Нужно наверное еще раз перечитать данную тему
//    fun beScary(): Boolean {
//         println("Fancy a bite?")
//         return true
     }

 }

 class Dragon: Monster(){
     override fun frighten(): Boolean {
         println("Fire")
         return true
     }
 }

 fun main (){
     val m = arrayOf(Vampire(),Dragon(),Monster())
     for (item in m)
         item.frighten()
 }
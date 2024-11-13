package org.example

//A. -> [Baseball, Basketball, Football]
//fun main() {
//    val mList = mutableListOf("Football", "Baseball", "Basketball")
//
//    mList.sort()
//    println(mList)
//}


//B. -> [Basketball]
fun main() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)
}


//C.  -> [Basketball, Baseball, Football]
//fun main() {
//    val mList = mutableListOf("Football", "Baseball", "Basketball")
//
//    mList.addAll(mList)
//    mList.reverse()
//    val set = mList.toSet()
//    println(set)
//}


//D. -> [Football, Basketball, Baseball]
//fun main() {
//    val mList = mutableListOf("Football", "Baseball", "Basketball")
//    mList.sort()
//    mList.reverse()
//    println(mList)
//}


package org.example

fun main(){
    val x = arrayOf(0,1,2,3,4)
    x[3] = x[2]
    x[4] = x[0]
    x[2]= x[1]
    x[1]=x[1]
    x[0]=x[1]
    x[4]=x[3]
    x[3]=x[2]
    x[2]=x[4]
    // За работу
}
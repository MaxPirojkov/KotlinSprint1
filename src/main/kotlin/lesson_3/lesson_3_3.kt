package org.example.lesson_3

fun main() {

    val builder = StringBuilder()
    val number = 9
    var sum: Int = 0
    
    for(i in 1 ..9){
        sum = number * i
        builder.append("$number * $i = $sum \n")
    }

    println(builder.toString())
}
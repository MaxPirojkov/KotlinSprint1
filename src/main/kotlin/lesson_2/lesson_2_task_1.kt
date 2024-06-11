package org.example.lesson_2

fun main(){
    val student1 = 3.0
    val student2 = 4.0
    val student3 = 3.0
    val student4 = 5.0


    val sumOfStudent = 4

    val result = ((student1 + student2 + student3 + student4) / sumOfStudent)
    println(result::class) //вывод double
    println(String.format("%02d", result)) // ошибка d != java.lang.Double, не смог понять почему

}

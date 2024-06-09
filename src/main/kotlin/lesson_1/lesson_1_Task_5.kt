package org.example.lesson_1

fun main() {
    val sumOfSecondsInSpace = 6480

    val hour: Float = sumOfSecondsInSpace / 3600F
    val minute = (hour - 1) * 60
    val seconds = "00"

    println("${hour.toInt()}:${minute.toInt()}:$seconds")
}
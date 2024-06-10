package org.example.lesson_1

const val sumOfSecondsInSpace = 6480
const val oneHourInSeconds = 3600

fun main() {

    val hours = sumOfSecondsInSpace / oneHourInSeconds
    val minute = (sumOfSecondsInSpace % oneHourInSeconds) / 60
    val seconds = sumOfSecondsInSpace % 60

    println(String.format("%02d:%02d:%02d", hours, minute, seconds))
}
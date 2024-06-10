package org.example.lesson_1

const val ONE_HOUR_IN_SECONDS = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val sumOfSecondsInSpace = 6480

    val hours = sumOfSecondsInSpace / ONE_HOUR_IN_SECONDS
    val minute = (sumOfSecondsInSpace % ONE_HOUR_IN_SECONDS) / SECONDS_IN_MINUTE
    val seconds = sumOfSecondsInSpace % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minute, seconds))
}
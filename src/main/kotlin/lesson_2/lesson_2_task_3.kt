package org.example.lesson_2

fun main(){
    val hourToStart = 9
    val minuteToStart = 39
    val timeInWayMinutes = 457
    val minuteInHour = 60

    val timeToStartInMinute = hourToStart * minuteInHour + minuteToStart
    val timeToFinishInMinute = timeToStartInMinute + timeInWayMinutes
    val hourToFinish = timeToFinishInMinute / minuteInHour
    val minuteToFinish = timeToFinishInMinute % minuteInHour

    println(String.format("%02d:%02d", hourToFinish, minuteToFinish )) //вывод 17:16
}
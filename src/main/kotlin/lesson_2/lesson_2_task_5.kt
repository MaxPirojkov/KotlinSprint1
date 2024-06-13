package org.example.lesson_2

import kotlin.math.pow

fun main(){
    val sumOfMoney = 70_000
    val percent = 16.7
    val year = 20
    val fullPercent = 100
    val defaultValue = 1.0

    val depositInTheEnd = (sumOfMoney * (defaultValue + (defaultValue/ fullPercent * percent)).pow(year))
    println(String.format("%.3f", depositInTheEnd)) // 1536438,428
}
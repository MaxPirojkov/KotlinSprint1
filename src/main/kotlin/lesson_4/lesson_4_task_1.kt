package org.example.lesson_4

fun main(){
    val todayReserve = 13
    val tomorrowReserve = 9

    println("[Доступность столиков на сегодня: ${todayReserve != SUM_OF_TABLES}] \n" +
            "[Доступность столиков на завтра: ${tomorrowReserve != SUM_OF_TABLES}]")
}

const val SUM_OF_TABLES = 13
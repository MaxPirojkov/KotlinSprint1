package org.example.lesson_4

fun main(){
    val currentWeatherIsSunny = true
    val currentTentIsOpen = true
    val currentHumidity = 20
    val currentSeason = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        currentWeatherIsSunny == SUNNY_WEATHER && currentTentIsOpen == OPEN_TENT && currentHumidity == HUMIDITY && currentSeason != WORSE_SEASON
    }")
}

const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val HUMIDITY = 20
val WORSE_SEASON = "winter"

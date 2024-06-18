package org.example.lesson_4

fun main() {
    val cargoOneWeight = 20
    val cargoOneVolume = 80
    val cargoTwoWeight = 50
    val cargoTwoVolume = 100

    println("Груз с весом $cargoOneWeight кг и объемом $cargoOneVolume л " +
            "соответствует категории 'Average': ${MIN_WEIGHT < cargoOneWeight && cargoOneWeight <= MAX_WEIGHT && cargoOneVolume < VOLUME}")

    println("Груз с весом $cargoTwoWeight кг и объемом $cargoTwoVolume л " +
            "соответствует категории 'Average': ${MIN_WEIGHT < cargoTwoWeight && cargoTwoWeight <= MAX_WEIGHT && cargoTwoVolume < VOLUME}")
}

const val MIN_WEIGHT = 35      //вес от 35 кг (не включительно) <
const val MAX_WEIGHT = 100     //до 100 кг (включительно) <=
const val VOLUME = 100         //объем меньше 100 литров (не включительно) <

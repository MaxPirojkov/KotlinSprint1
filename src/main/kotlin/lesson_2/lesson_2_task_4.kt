package org.example.lesson_2

fun main() {
    val crystal = 7.0
    val iron = 11.0
    val buff  = 20
    val maxBuff = 100

    val buffForCrystal = crystal / maxBuff * buff
    val buffForIron = iron / maxBuff * buff

    println("Бафф от кристаллической руды: ${buffForCrystal.toInt()}")
    println("Бафф от желехной руды: ${buffForIron.toInt()}")
}
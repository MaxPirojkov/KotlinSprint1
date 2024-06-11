package org.example.lesson_3

fun main() {
    val greetingDay = "Добрый день"
    val greetingEvening = "Добрый вечер"
    val name = "Гомер"
    val partOfDay = "день"

        when(partOfDay) {
            "день" -> println("$greetingDay, $name!")
            "вечер" -> println("$greetingEvening, $name!")
        }
}

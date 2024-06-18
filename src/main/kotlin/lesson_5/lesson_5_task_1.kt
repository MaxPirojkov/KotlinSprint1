package org.example.lesson_5

fun main() {
    println("для входа в приложение пользователь должен доказать, что он не бот\" +\n" +
            "ввердите ответ 5 + 5")
    val console = readLine()!!.toInt()

    when(console){
        10 -> println("Добро пожаловать!")
        else -> println("Доступ запрещен")
    }
}
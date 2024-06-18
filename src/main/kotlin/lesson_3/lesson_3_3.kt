package org.example.lesson_3

fun main() {

    val numb = 9

    val multipleTable = """
        |$numb * 1 = ${numb * 1}
        |$numb * 2 = ${numb * 2}
        |$numb * 3 = ${numb * 3}
        |$numb * 4 = ${numb * 4}
        |$numb * 5 = ${numb * 5}
        |$numb * 6 = ${numb * 6}
        |$numb * 7 = ${numb * 7}
        |$numb * 8 = ${numb * 8}
        |$numb * 9 = ${numb * 9}
        """.trimMargin()

    println(multipleTable)
}
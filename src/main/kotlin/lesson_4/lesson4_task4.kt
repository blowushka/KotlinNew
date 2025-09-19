package org.example.lesson_4

fun main() {

    val dayOfTraining = 5
    val isArmsAndAbsDay = dayOfTraining % 2 != 0
    val isLegsAndBackDay = dayOfTraining % 2 == 0

    println(
        """
        Упражнения для рук: $isArmsAndAbsDay
        Упражнения для ног: $isLegsAndBackDay
        Упражнения для спины: $isLegsAndBackDay
        Упражнения для пресса: $isArmsAndAbsDay
    """.trimIndent()
    )

}
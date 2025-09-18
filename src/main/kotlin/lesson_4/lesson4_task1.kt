package org.example.lesson_4

const val RESTAURANT_TABLES = 13

fun main() {

    val todayTablesReservation = 13
    val yesterdayTablesReservation = 9

    println("[Доступность столиков на сегодня: ${todayTablesReservation < RESTAURANT_TABLES}] \n[Доступность столиков на завтра: ${yesterdayTablesReservation < RESTAURANT_TABLES}]")

}
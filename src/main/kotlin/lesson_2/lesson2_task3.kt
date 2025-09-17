package org.example.lesson_2

const val MINUTES_AND_HOURS_CONVERTER = 60
const val DAY_TIME_CONVERTER = 24

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    val totalMinutes = departureHour * MINUTES_AND_HOURS_CONVERTER + departureMinute + travelTime
    val arrivalHour = (totalMinutes / MINUTES_AND_HOURS_CONVERTER) % DAY_TIME_CONVERTER
    val arrivalMinute = totalMinutes % MINUTES_AND_HOURS_CONVERTER

    println("Arrival time: %02d:%02d".format(arrivalHour, arrivalMinute))

}
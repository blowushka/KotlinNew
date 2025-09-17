package org.example.lesson_1

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOURS = 3600

fun main() {

    val flightSeconds = 6480
    val flightHours = flightSeconds / SECONDS_IN_HOURS
    val remainingAfterHours = flightSeconds % SECONDS_IN_HOURS
    val flightMinutes = remainingAfterHours / MINUTES_IN_HOUR
    val secondsLeft = remainingAfterHours % MINUTES_IN_HOUR

    println("%02d:%02d:%02d".format(flightHours, flightMinutes, secondsLeft))

}
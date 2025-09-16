package org.example.lesson_1

const val flightSeconds = 6480
const val minutesInHour = 60
const val secondsInHour = 3600

fun main() {

    val flightHours = flightSeconds / secondsInHour
    val remainingAfterHours = flightSeconds % secondsInHour
    val flightMinutes = remainingAfterHours / minutesInHour
    val secondsLeft = remainingAfterHours % minutesInHour

    println("%02d:%02d:%02d".format(flightHours, flightMinutes, secondsLeft))

}
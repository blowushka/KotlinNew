package org.example.lesson_2

const val departureHour = 9
const val departureMinute = 39
const val travelTime = 457
const val minutesAndHoursConverter = 60
const val dayTimeConverter = 24

fun main() {

    val totalMinutes = departureHour * minutesAndHoursConverter + departureMinute + travelTime
    val arrivalHour = (totalMinutes / minutesAndHoursConverter) % dayTimeConverter
    val arrivalMinute = totalMinutes % minutesAndHoursConverter

    println("Arrival time: %02d:%02d".format(arrivalHour, arrivalMinute))

}
package org.example.lesson_4

const val IS_DAMAGED = true
const val CREW_COUNT_MIN = 55
const val CREW_COUNT_MAX = 70
const val PROVISION_COUNT_MIN = 50
const val IS_FAVORABLE_WEATHER = true
const val MIN_AMOUNT_OF_CREW_WHEN_SHIP_IS_DAMAGED = 70

fun main() {

    print("Is there any damage to the ship?(true/false): ")
    val isDamaged = readln().toBoolean()

    print("How many crew members are on board?: ")
    val crewCount = readln().toInt()

    print("How much provisions are on the board?: ")
    val amountOfProvisions = readln().toInt()

    print("Weather is favorable?(true/false): ")
    val isFavorableWeather = readln().toBoolean()

    val shipIsReady =
        (isDamaged != IS_DAMAGED && (crewCount >= CREW_COUNT_MIN && crewCount <= CREW_COUNT_MAX) && amountOfProvisions > PROVISION_COUNT_MIN && isFavorableWeather == IS_FAVORABLE_WEATHER) || (isDamaged == IS_DAMAGED && crewCount == MIN_AMOUNT_OF_CREW_WHEN_SHIP_IS_DAMAGED && amountOfProvisions >= PROVISION_COUNT_MIN && isFavorableWeather == IS_FAVORABLE_WEATHER)

    println("Is the ship ready to sail?: $shipIsReady")

}
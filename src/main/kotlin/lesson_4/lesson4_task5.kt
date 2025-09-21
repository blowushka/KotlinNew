package org.example.lesson_4

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
        (isDamaged == false && (crewCount >= 55 && crewCount <= 70) && amountOfProvisions > 50 && isFavorableWeather == true) || (isDamaged == true && crewCount == 70 && amountOfProvisions >= 50 && isFavorableWeather == true)

    println("Is the ship ready to sail?: $shipIsReady")

}
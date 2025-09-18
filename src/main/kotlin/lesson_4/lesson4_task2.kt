package org.example.lesson_4

fun main() {

    val categoryOfCargo = "Average"
    val averageCargoMinWeight = 35
    val averageCargoMaxWeight = 100
    val averageCargoCapacity = 100

    val firstCargoWeight = 20
    val firstCargoCapacity = 80

    val secondCargoWeight = 50
    val secondCargoCapacity = 100

    println("Груз с весом $firstCargoWeight кг и объёмом $firstCargoCapacity л соответствует категории '$categoryOfCargo': ${(firstCargoWeight > averageCargoMinWeight && firstCargoWeight <= averageCargoMaxWeight) && firstCargoCapacity < averageCargoCapacity}")
    println("Груз с весом $secondCargoWeight кг и объёмом $secondCargoCapacity л соответствует категории '$categoryOfCargo': ${(secondCargoWeight > averageCargoMinWeight && secondCargoWeight <= averageCargoMaxWeight) && secondCargoCapacity < averageCargoCapacity}")

}
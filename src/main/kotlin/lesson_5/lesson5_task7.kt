package org.example.lesson_5

import java.util.Locale

const val OVERALL_FUEL_CONSUMPTION_DIVIDER = 100

fun main() {

    print("Введите расстояние поездки: ")
    val distance = readln().toDouble()

    print("Введите расход топлива на 100км: ")
    val fuelConsumption = readln().toDouble()

    print("Введите текущую цену за литр топлива: ")
    val currentFuelPrice = readln().toDouble()

    val overallFuelConsumption = (distance * fuelConsumption) / OVERALL_FUEL_CONSUMPTION_DIVIDER
    val overallFuelPrice = overallFuelConsumption * currentFuelPrice

    println(
        "Общее количество топлива необходимое для поездки: $overallFuelConsumption, общая цена топлива за поездку: ${
            String.format(
                Locale.ENGLISH, "%.2f", overallFuelPrice
            )
        }"
    )

}
package org.example.lesson_4

const val IS_SUN: Boolean = true
const val IS_AWNING_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON_OF_YEAR: String = "Зима"

fun main() {

    val favorableConditions = IS_SUN == true && IS_AWNING_OPEN == true && AIR_HUMIDITY == 20 && SEASON_OF_YEAR != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}
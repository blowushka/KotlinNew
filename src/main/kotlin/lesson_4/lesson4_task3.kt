package org.example.lesson_4

const val IS_SUN: Boolean = true
const val IS_AWNING_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON_OF_YEAR: String = "Зима"

fun main() {

    val isSun: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val seasonOfYear = "Зима"

    val favorableConditions =
        isSun == IS_SUN && isAwningOpen == IS_AWNING_OPEN && AIR_HUMIDITY == airHumidity && seasonOfYear != SEASON_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}
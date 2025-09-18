package org.example.lesson_4

fun main() {

    val isSun: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val seasonOfYear: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSun && isAwningOpen && airHumidity == 20 && seasonOfYear != "Зима"}")

}
package org.example.lesson_5

import kotlin.math.pow

const val BMI_LOW = "Недостаточная масса тела"
const val BMI_LOW_MAX = 18.5
const val BMI_NORMAL = "Нормальная масса тела"
const val BMI_NORMAL_MAX = 25.0
const val BMI_OVERWEIGHT = "Избыточная масса тела"
const val BMI_OVERWEIGHT_MAX = 30.0
const val BMI_OBESITY = "Ожирение"
const val HEIGHT_DIVIDER = 100
const val HEIGHT_POWER = 2

fun main() {

    print("Введите ваш вес: ")
    val weight = readln().toDouble()

    print("Введите ваш рост: ")
    val height = readln().toDouble()

    val heightInMeters = height / HEIGHT_DIVIDER
    val bmiRating = weight / heightInMeters.pow(HEIGHT_POWER)

    if (bmiRating < BMI_LOW_MAX) {
        println("Ваш ИМТ: ${String.format("%.2f", bmiRating)}, Ваша категория: $BMI_LOW")
    } else if (bmiRating >= BMI_LOW_MAX && bmiRating < BMI_NORMAL_MAX) {
        println("Ваш ИМТ: ${String.format("%.2f", bmiRating)}, Ваша категория: $BMI_NORMAL")
    } else if (bmiRating >= BMI_NORMAL_MAX && bmiRating < BMI_OVERWEIGHT_MAX) {
        println("Ваш ИМТ: ${String.format("%.2f", bmiRating)}, Ваша категория: $BMI_OVERWEIGHT")
    } else println("Ваш ИМТ: ${String.format("%.2f", bmiRating)}, Ваша категория: $BMI_OBESITY")

}
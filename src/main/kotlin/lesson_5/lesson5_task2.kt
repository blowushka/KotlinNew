package org.example.lesson_5

import java.util.Calendar

const val AGE_OF_MAJORITY = 18

fun main() {

    print("Enter your year of born: ")

    val yearOfBorn = readln().toInt()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    if (currentYear - yearOfBorn >= AGE_OF_MAJORITY) {
        println("Show hidden content")
    }

}
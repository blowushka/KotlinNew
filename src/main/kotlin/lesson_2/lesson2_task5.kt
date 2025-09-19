package org.example.lesson_2

import kotlin.math.pow

const val deposit = 70_000
const val percentPerYear = 16.7
const val depositLength = 20

fun main() {

    val totalDeposit = deposit * (1 + (percentPerYear / 100.0)).pow(depositLength)

    println("%.3f".format(totalDeposit))

}
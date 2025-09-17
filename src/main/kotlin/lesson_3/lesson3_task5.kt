package org.example.lesson_3

fun main() {

    val playersTurn = "D2-D4;0"

    val splitString = playersTurn.split("-", ";")

    val fromTurn = splitString[0]
    val whereTurn = splitString[1]
    val turnsCount = splitString[2]

    println(fromTurn)
    println(whereTurn)
    println(turnsCount)

}
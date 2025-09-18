package org.example.lesson_3

fun main() {

    var fromTurn = "E2"
    var whereTurn = "E4"
    var turnsCount = 1

    println("[$fromTurn-$whereTurn;$turnsCount]")

    fromTurn = "D2"
    whereTurn = "D3"
    turnsCount++

    println("[$fromTurn-$whereTurn;$turnsCount]")

}
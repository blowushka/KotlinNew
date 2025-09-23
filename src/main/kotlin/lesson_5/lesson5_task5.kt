package org.example.lesson_5

fun main() {

    val min = 0
    val max = 42
    val listOfLuckyNumbers = mutableListOf<Int>()

    listOfLuckyNumbers.add((min..max).random())
    listOfLuckyNumbers.add((min..max).random())
    listOfLuckyNumbers.add((min..max).random())

    val listOfEnteredNumbers = mutableListOf<Int>()

    print("Enter first number: ")
    listOfEnteredNumbers.add(readln().toInt())

    print("Enter second number: ")
    listOfEnteredNumbers.add(readln().toInt())

    print("Enter third number: ")
    listOfEnteredNumbers.add(readln().toInt())

    val countOfIntersection = listOfLuckyNumbers.intersect(listOfEnteredNumbers).size

    if (countOfIntersection == 3) {
        println("You won jackpot!")
    } else if (countOfIntersection == 2) {
        println("You won grand prize")
    } else if (countOfIntersection == 1) {
        println("You won consolation prize!")
    } else println("You are not guess any numbers!")

    println("Lucky numbers was: ${listOfLuckyNumbers[0]}, ${listOfLuckyNumbers[1]}, ${listOfLuckyNumbers[2]}")

}
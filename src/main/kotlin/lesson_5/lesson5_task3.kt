package org.example.lesson_5

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main() {

    val firstLuckyNumber = 5
    val secondLuckyNumber = 10

    print("Enter the first number from $MIN_NUMBER to $MAX_NUMBER: ")
    val firstNumber = readln().toInt()

    print("Enter the second number from $MIN_NUMBER to $MAX_NUMBER: ")
    val secondNumber = readln().toInt()

    println("Lucky numbers was: $firstLuckyNumber, $secondLuckyNumber")

    if ((firstNumber == firstLuckyNumber && secondNumber == secondLuckyNumber) || (firstNumber == secondLuckyNumber && secondNumber == firstLuckyNumber)) {
        print("Congratulations! You won grand prize!")
    } else if (firstNumber == firstLuckyNumber || firstNumber == secondLuckyNumber || secondNumber == firstLuckyNumber || secondNumber == secondLuckyNumber) {
        print("You won the consolation prize!")
    } else println("Bad luck :(")

}
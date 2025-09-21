package org.example.lesson_5

fun main() {

    val firstLuckyNumber = 5
    val secondLuckyNumber = 10

    print("Enter the first number from 0 to 42: ")
    val firstNumber = readln().toInt()

    print("Enter the second number from 0 to 42: ")
    val secondNumber = readln().toInt()

    if ((firstNumber == firstLuckyNumber && secondNumber == secondLuckyNumber) || (firstNumber == secondLuckyNumber && secondNumber == firstLuckyNumber)) {
        print("Congratulations! You won grand prize!")
    } else if (firstNumber == firstLuckyNumber || firstNumber == secondLuckyNumber || secondNumber == firstLuckyNumber || secondNumber == secondLuckyNumber) {
        print("You won the consolation prize!")
    } else println("Bad luck :(")

}
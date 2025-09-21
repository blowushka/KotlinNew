package org.example.lesson_5

fun main() {

    val min = 1
    val max = 25
    val firstRandomNumber = (min..max).random()
    val secondRandomNumber = (min..max).random()

    print("Add two numbers to prove you are not a bot\nResult of sum $firstRandomNumber+" + "$secondRandomNumber is: ")

    val result = readln().toInt()

    if (result == firstRandomNumber + secondRandomNumber) {
        println("Welcome!")
    } else println("Access denied")

}

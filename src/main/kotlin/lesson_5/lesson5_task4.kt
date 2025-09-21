package org.example.lesson_5

fun main() {

    val zaphodUsername = "Zaphod"
    val zaphodPassword = "PanGalactic"

    print("Enter your login: ")
    val username = readln()

    if (username == zaphodUsername) {
        print("Enter your password: ")
        val password = readln()

        if (password == zaphodPassword) {
            print("Welcome aboard!")
        } else print("Incorrect password!")
    } else print("You are not registered! Please, register.")

}
package org.example.lesson_2

fun main() {

    val studentsCount = 4

    val firstStudentGrade = 3.0
    val secondStudentGrade = 4.0
    val thirdStudentGrade = 3.0
    val fourthStudentGrade = 5.0

    val arithmeticMean = (firstStudentGrade + secondStudentGrade + thirdStudentGrade + fourthStudentGrade) / studentsCount

    println("%.2f".format(arithmeticMean))

}
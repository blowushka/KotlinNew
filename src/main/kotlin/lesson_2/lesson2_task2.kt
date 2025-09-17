package org.example.lesson_2

fun main() {

    val employeesCount = 50
    val employeesSalary = 30000
    val traineesCount = 30
    val traineesSalary = 20000

    val employeesMonthSalary = employeesCount * employeesSalary
    val overallMonthSalary = employeesMonthSalary + (traineesCount * traineesSalary)
    val averageMonthSalary = overallMonthSalary / (employeesCount + traineesCount)

    println(employeesMonthSalary)
    println(overallMonthSalary)
    println(averageMonthSalary)

}
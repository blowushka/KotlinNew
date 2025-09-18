package org.example.lesson_2

const val PERCENT_CONVERTER = 100.0

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val materialsBuff = 20

    val bonusCrystalOre = (crystalOre * (materialsBuff / PERCENT_CONVERTER)).toInt()
    val bonusIronOre = (ironOre * (materialsBuff / PERCENT_CONVERTER)).toInt()

    println("You received $bonusCrystalOre bonus crystal ore(s) by buff")
    println("You received $bonusIronOre bonus iron ore(s) by buff")

}
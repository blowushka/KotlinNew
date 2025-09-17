package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val materialsBuff = 20

    val bonusCrystalOre = (crystalOre * (materialsBuff / 100.0)).toInt()
    val bonusIronOre = (ironOre * (materialsBuff / 100.0)).toInt()

    println("You received $bonusCrystalOre bonus crystal ore(s) by buff")
    println("You received $bonusIronOre bonus iron ore(s) by buff")

}
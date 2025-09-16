package org.example.lesson_2

const val crystalOre = 7
const val ironOre = 11
const val materialsBuff = 0.2

fun main() {

    val bonusCrystalOre = (crystalOre * materialsBuff).toInt()
    val bonusIronOre = (ironOre * materialsBuff).toInt()

    println("You received $bonusCrystalOre bonus crystal ore(s) by buff")
    println("You received $bonusIronOre bonus iron ore(s) by buff")

}
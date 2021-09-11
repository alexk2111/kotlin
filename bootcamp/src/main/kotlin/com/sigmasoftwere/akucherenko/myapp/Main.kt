package com.sigmasoftwere.akucherenko.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
    println(myAquarium.volume())

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    println(aquarium2.volume())

    println("---------------------")
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println(aquarium6.volume())

}

fun main() {
    buildAquarium()
}
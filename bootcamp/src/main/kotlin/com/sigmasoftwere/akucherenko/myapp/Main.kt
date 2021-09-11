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

    println("--------------------- add secondary constructors")
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println(aquarium6.volume())

    println("--------------------- add new property getter")
    val aquarium7 = Aquarium(numberOfFish = 50)
    aquarium7.printSize()
    println("Volume: ${aquarium7.volume} l")

    println("--------------------- Add a property setter")
    val aquarium8 = Aquarium(numberOfFish = 35)
    aquarium8.printSize()
    println("Volume: ${aquarium8.volume} l")
    aquarium8.volume = 90
    aquarium8.printSize()
    println("Volume: ${aquarium8.volume} l")


}

fun main() {
    buildAquarium()
}
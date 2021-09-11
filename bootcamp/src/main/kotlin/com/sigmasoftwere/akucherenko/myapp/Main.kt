package com.sigmasoftwere.akucherenko.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
    println(myAquarium.volume())
}

fun main() {
    buildAquarium()
}
package com.sigmasoftwere.akucherenko.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    init {
        println("Volume: ${volume() / 1000} l")
    }

    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
    }

    fun volume() = width * height * length
}
package com.sigmasoftwere.akucherenko.myapp

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    init {
        println("Volume: ${volume() / 1000} l")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }

    fun volume() = width * height * length

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9
}
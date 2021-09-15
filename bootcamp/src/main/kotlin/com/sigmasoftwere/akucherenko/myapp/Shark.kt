package com.sigmasoftwere.akucherenko.myapp

class Shark : AquariumFishAbstract(), FishActionInterface {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

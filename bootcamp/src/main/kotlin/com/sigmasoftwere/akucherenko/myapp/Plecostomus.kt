package com.sigmasoftwere.akucherenko.myapp

class Plecostomus : AquariumFishAbstract(), FishActionInterface {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}
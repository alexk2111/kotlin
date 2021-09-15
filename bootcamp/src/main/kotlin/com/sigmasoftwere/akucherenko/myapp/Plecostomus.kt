package com.sigmasoftwere.akucherenko.myapp

class Plecostomus : AquariumFishAbstract(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}
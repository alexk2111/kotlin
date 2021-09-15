package com.sigmasoftwere.akucherenko.myapp

class Shark : AquariumFishAbstract(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

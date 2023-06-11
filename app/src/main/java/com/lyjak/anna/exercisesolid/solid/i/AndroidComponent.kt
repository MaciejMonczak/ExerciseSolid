package com.lyjak.anna.exercisesolid.solid.i

class AndroidComponent : Touchable, Swipable, Validatable {

    override fun touch(event: String) {
        println("Touch Event Fired")
    }

    override fun swipe(event: String) {
        println("Swipe Event Fired")
    }

    override fun validate() {
        println("All UI is valid")
    }

}

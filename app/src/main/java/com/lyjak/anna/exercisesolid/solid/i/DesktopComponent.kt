package com.lyjak.anna.exercisesolid.solid.i

class DesktopComponent : MouseOverable, Validatable {

    override fun mouseover(event: String) {
        println("Mouse click Event Fired")
    }

    override fun validate() {
        println("All UI is valid")
    }

}
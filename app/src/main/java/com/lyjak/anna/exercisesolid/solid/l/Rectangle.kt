package com.lyjak.anna.exercisesolid.solid.l

class Rectangle(var width: Double = 0.0, var height: Double = 0.00) : Shape{

    override val area: Double
        get() {
            return width * height
        }

}
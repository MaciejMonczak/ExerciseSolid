package com.lyjak.anna.exercisesolid.solid.l

class Square(var sideLength: Double = 0.0) : Shape {
    override val area: Double
        get() = sideLength * sideLength

    // Or better stay with Rectangle inheritance and set sideLength to height and width in constructor?
}
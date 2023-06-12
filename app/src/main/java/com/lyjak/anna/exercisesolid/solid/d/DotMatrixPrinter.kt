package com.lyjak.anna.exercisesolid.solid.d

class DotMatrixPrinter : Printer {
    // Should it be moved to Printer interface?
    var inc: String? = null

    override fun print(text: String) {
        println(text)
    }

}
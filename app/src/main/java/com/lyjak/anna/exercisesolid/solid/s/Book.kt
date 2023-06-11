package com.lyjak.anna.exercisesolid.solid.s

class Book {
    // Or maybe add Printer in constructor?
    var author: String? = null
    var text: String? = null
    var name: String? = null
    private var printer = ConsolePrinter()

    fun print() = printer.print(text)
}




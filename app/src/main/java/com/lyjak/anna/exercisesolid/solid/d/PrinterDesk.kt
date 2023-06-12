package com.lyjak.anna.exercisesolid.solid.d

class PrinterDesk(private val printer: Printer) {

    fun printFile() {
        printer.print("File Content")
    }

}
package com.lyjak.anna.exercisesolid.solid.o

class ElectronicsPriceCalculator : PriceCalculator {
    override fun calculatePrice(product: Product): Double {
        return product.price * 1.18
    }
}
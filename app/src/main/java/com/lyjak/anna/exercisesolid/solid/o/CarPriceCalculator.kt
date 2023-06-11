package com.lyjak.anna.exercisesolid.solid.o

class CarPriceCalculator : PriceCalculator {
    override fun calculatePrice(product: Product): Double {
        return product.price * 1.60 * 1.18
    }
}
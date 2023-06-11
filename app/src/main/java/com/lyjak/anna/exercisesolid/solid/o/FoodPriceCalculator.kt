package com.lyjak.anna.exercisesolid.solid.o

class FoodPriceCalculator : PriceCalculator {
    override fun calculatePrice(product: Product): Double {
        return product.price + product.price * 0.08
    }
}
package com.lyjak.anna.exercisesolid.solid.o

class ShoppingCartService {
    // Is there a better idea than a factory?
    private val priceCalculatorFactory = PriceCalculatorFactory()
    fun calculateTotalOrder(products: List<Product>): Double {
        var orderTotal = 0.0

        for (product in products) {
            val priceCalculator = priceCalculatorFactory.createPriceCalculator(product.type!!)
            orderTotal += priceCalculator.calculatePrice(product)
        }

        return orderTotal
    }

}
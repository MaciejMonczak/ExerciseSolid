package com.lyjak.anna.exercisesolid.solid.o

class PriceCalculatorFactory {
    fun createPriceCalculator(type: ProductType) : PriceCalculator {
        return when (type) {
            ProductType.FOOD -> FoodPriceCalculator()
            ProductType.CAR -> CarPriceCalculator()
            ProductType.ELECTRONICS -> ElectronicsPriceCalculator()
        }
    }
}
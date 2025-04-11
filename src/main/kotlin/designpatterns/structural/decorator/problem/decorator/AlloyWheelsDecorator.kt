package system.design.designpatterns.structural.decorator.problem.decorator

import system.design.designpatterns.structural.decorator.problem.Car

class AlloyWheelsDecorator(private val car: Car) : BaseDecorator {
    private val alloyWheelsPrice: Number = 50;

    override fun getPrice(): Number {
        return alloyWheelsPrice.toInt() + car.getPrice().toInt();
    }

    override fun getFeaturesList(): List<String> {
        return car.getFeaturesList() + "Alloy Wheels"
    }
}

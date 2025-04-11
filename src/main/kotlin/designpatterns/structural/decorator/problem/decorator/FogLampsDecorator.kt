package system.design.designpatterns.structural.decorator.problem.decorator

import system.design.designpatterns.structural.decorator.problem.Car

class FogLampsDecorator(private val car: Car) : BaseDecorator {
    private val fogLampsPrice: Number = 50;

    override fun getPrice(): Number {
        return car.getPrice().toInt() + fogLampsPrice.toInt();
    }

    override fun getFeaturesList(): List<String> {
        return car.getFeaturesList() + "Fog Lamps";
    }
}

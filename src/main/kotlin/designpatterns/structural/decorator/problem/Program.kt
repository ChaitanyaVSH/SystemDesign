package system.design.designpatterns.structural.decorator.problem

import system.design.designpatterns.structural.decorator.problem.decorator.AlloyWheelsDecorator
import system.design.designpatterns.structural.decorator.problem.decorator.FogLampsDecorator

fun main() {
    val firstModelCar = BaseCar();
    println("Price of Base Car with no features is ${firstModelCar.getPrice()}.");
    println("#############################################################")

    val carWithAlloyWheels = AlloyWheelsDecorator(firstModelCar)
    println("Price of Car with alloy wheels is ${carWithAlloyWheels.getPrice()}.");
    println(carWithAlloyWheels.getFeaturesList())
    println("#############################################################")

    val carWithAlloyWheelsAndFogLamps = FogLampsDecorator(carWithAlloyWheels)
    println("Price of Car with alloy wheels and Fog lamps is ${carWithAlloyWheelsAndFogLamps.getPrice()}.");
    println(carWithAlloyWheelsAndFogLamps.getFeaturesList())
}

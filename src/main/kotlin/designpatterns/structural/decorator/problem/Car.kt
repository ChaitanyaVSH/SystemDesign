package system.design.designpatterns.structural.decorator.problem

/**
 * Interface for the car.
 */
interface Car {
    fun getPrice(): Number
    fun getFeaturesList(): List<String>
}

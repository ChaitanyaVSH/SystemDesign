package system.design.designpatterns.structural.decorator.problem

class BaseCar : Car {
    private var featuresList: List<String> = listOf();
    private var price: Number = 100;

    override fun getPrice(): Number {
        return price;
    }

    override fun getFeaturesList(): List<String> {
        return featuresList;
    }
}

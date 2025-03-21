package system.design.designpatterns.behavioural.strategy.withoutStrategy

class SportsVehicle : Vehicle() {
    override fun drive() {
        println("Special drive capability, that is duplicate b/w Sports and OffRoad vehicle.")
    }
}

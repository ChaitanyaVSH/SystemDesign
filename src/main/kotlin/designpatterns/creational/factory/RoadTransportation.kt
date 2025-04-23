package system.design.designpatterns.creational.factory

class RoadTransportation : Transportation {
    override fun shipInventory() {
        println("Shipping inventory using road.")
    }
}

package system.design.designpatterns.creational.factory

class RailTransportation : Transportation {
    override fun shipInventory() {
        println("Shipping inventory using railways.")
    }
}

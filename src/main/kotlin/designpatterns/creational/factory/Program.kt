package system.design.designpatterns.creational.factory

fun main() {
    val transportationFactory: TransportationFactory = TransportationFactory()
    println("Which transportation mode do you want ?")
    val option = readln().toString()

    val transportation: Transportation =
        transportationFactory.provideTransportation(TransportationMode.valueOf(option.toUpperCase()))
    println(transportation.shipInventory())
}

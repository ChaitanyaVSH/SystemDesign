package system.design.designpatterns.creational.factory

class TransportationFactory {

    // This is a parameterised factory method.
    fun provideTransportation(transportationMode: TransportationMode): Transportation {
        return when(transportationMode) {
            TransportationMode.ROAD -> RoadTransportation()
            TransportationMode.RAIL -> RailTransportation()
        }
    }
}

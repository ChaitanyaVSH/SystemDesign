package system.design.designpatterns.creational.factory

class TransportationFactory {
    fun provideTransportation(transportationMode: TransportationMode): Transportation {
        return when(transportationMode) {
            TransportationMode.ROAD -> RoadTransportation()
            TransportationMode.RAIL -> RailTransportation()
        }
    }
}

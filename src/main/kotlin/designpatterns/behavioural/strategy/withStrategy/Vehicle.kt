package system.design.designpatterns.behavioural.strategy.withStrategy

class Vehicle(private val driveStrategy: DriveStrategy){

    fun drive() {
        driveStrategy.drive()
    }
}

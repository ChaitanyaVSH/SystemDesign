package system.design.designpatterns.behavioural.strategy.withStrategy

class SportsDriveStrategy : DriveStrategy {
    override fun drive() {
        println("Sports drive strategy.")
    }
}

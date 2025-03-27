package system.design.designpatterns.behavioural.strategy.withStrategy

class NormalDriveStrategy : DriveStrategy {
    override fun drive() {
        println("Normal drive strategy.")
    }
}

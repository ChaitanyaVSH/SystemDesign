package system.design.solid.l

class MotorCycle : Vehicle() {
    override fun startEngine() {
        println("Starting engine.")
    }

    override fun stopEngine() {
        println("Stopping engine.")
    }
}
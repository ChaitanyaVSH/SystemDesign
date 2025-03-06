package system.design.solid.l

class BullockCart : Vehicle() {
    override fun startEngine() {
        throw Error("No engine found")
    }

    override fun stopEngine() {
        throw Error("No engine found")
    }
}
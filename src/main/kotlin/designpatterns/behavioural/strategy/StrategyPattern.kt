package system.design.designpatterns.behavioural.strategy

import system.design.designpatterns.behavioural.strategy.withoutStrategy.NormalVehicle
import system.design.designpatterns.behavioural.strategy.withoutStrategy.OffroadVehicle
import system.design.designpatterns.behavioural.strategy.withoutStrategy.SportsVehicle


fun main() {
    // Without strategy pattern
    /**
     * OffRoad vehicle uses sports drive functionality.
     * This functionality is not present in base case, hence offRoad vehicle should have it's override.
     *
     * But this functionality is ALREADY present in SportsVehicle, but we cannot use it.
     * This is called as "Code duplication"
     */
    val offRoadVehicle = OffroadVehicle()
    offRoadVehicle.drive()

    val sportsVehicle = SportsVehicle()
    sportsVehicle.drive()

    val normalVehicle = NormalVehicle()
    normalVehicle.drive()
}

package system.design.designpatterns.behavioural.observer.problem

interface InventoryUpdatesListener {
    fun sendInventoryUpdates(item: Item)
}

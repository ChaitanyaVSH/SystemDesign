package system.design.designpatterns.behavioural.observer.problem

interface InventoryUpdatesPublisher {
    fun subscribeForInventoryUpdate(item: Item, listener: InventoryUpdatesListener)
    fun notifyAboutInventoryUpdate(item: Item)
}

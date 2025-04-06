package system.design.designpatterns.behavioural.observer.problem

class AmazonInventoryUpdatesPublisher : InventoryUpdatesPublisher {
    private var itemToListenersMap: MutableMap<String, InventoryUpdatesListener> = mutableMapOf()

    @Override
    override fun subscribeForInventoryUpdate(item: Item, listener: InventoryUpdatesListener) {
        itemToListenersMap[item.id] = listener
    }

    @Override
    override fun notifyAboutInventoryUpdate(item: Item) {
        itemToListenersMap[item.id]?.sendInventoryUpdates(item)
    }
}

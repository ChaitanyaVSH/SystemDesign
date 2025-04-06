package system.design.designpatterns.behavioural.observer.problem

class AmazonInventoryUpdatesListener : InventoryUpdatesListener {

    @Override
    override fun sendInventoryUpdates(item: Item) {
        println("${item.id} with ${item.name} is added to inventory.")
        println("Sending notification to SMS.")
        println("Sending notification to Email.")
    }
}

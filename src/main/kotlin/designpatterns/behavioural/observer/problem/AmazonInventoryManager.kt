package system.design.designpatterns.behavioural.observer.problem

class AmazonInventoryManager : InventoryManager {
    private var inventory = mutableListOf<Item>()
    private val inventoryUpdatesPublisher: InventoryUpdatesPublisher = AmazonInventoryUpdatesPublisher()
    private val inventoryUpdatesListener: InventoryUpdatesListener = AmazonInventoryUpdatesListener()

    /**
     * Add item to inventory.
     */
    @Override
    override fun addItem(item: Item) {
        inventory.add(item)
        inventoryUpdatesPublisher.notifyAboutInventoryUpdate(item)
    }

    /**
     * Delete item from inventory.
     */
    @Override
    override fun deleteItem(item: Item) {
        val updated = inventory.filter { it.id != item.id }
        inventory = updated.toMutableList()
    }

    /**
     * Display the list of items in inventory.
     */
    @Override
    override fun displayInventory() {
        println("Amazon Inventory")
        inventory.stream().forEach { item ->
            println(item)
        }
    }

    @Override
    override fun notifyMe(item: Item) {
        println("Adding customer subscription for item ${item.id}.")
        inventoryUpdatesPublisher.subscribeForInventoryUpdate(item, inventoryUpdatesListener)
    }
}

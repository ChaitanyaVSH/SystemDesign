package system.design.designpatterns.behavioural.observer.problem

// Generic inventory manager to handle inventory.
interface InventoryManager {

    /**
     * Add item to inventory.
     */
    fun addItem(item: Item)

    /**
     * Delete item from inventory.
     */
    fun deleteItem(item: Item)

    /**
     * Display the current inventory.
     */
    fun displayInventory()

    fun notifyMe(item: Item)
}

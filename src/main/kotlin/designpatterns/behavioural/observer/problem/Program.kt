package system.design.designpatterns.behavioural.observer.problem

fun displayOptions() {
    println("#################")
    println("Choose an option:")
    println("#################")
    println("1. Add a product")
    println("2. Remove a product")
    println("3. Notify me for an item")
    println("4. Display the existing inventory")
}

fun main() {
    val inventoryManager: InventoryManager = AmazonInventoryManager()

    while (true) {

        // Take an input for a number from user.
        displayOptions()
        val option = readln().toInt()

        when(option) {
            1 -> {
                println("Enter item id.")
                val itemId = readln()
                println("Enter item name.")
                val itemName = readln()
                inventoryManager.addItem(Item(itemId, itemName))
            }
            2 -> {
                println("Enter item id to remove from the inventory.")
                inventoryManager.displayInventory()
                val itemId = readln()
                inventoryManager.deleteItem(Item(itemId))
                println("Item $itemId is successfully deleted.")
                inventoryManager.displayInventory()
            }
            3 -> {
                println("Enter item id to notify me for.")
                val itemId = readln()
                inventoryManager.notifyMe(Item(itemId))
            }
            4 -> inventoryManager.displayInventory()
            else -> {
                println("Invalid option.")
                break;
            }
        }
    }
}

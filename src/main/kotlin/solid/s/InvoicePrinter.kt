package system.design.solid.s

import system.design.solid.common.Item

class InvoicePrinter {
    fun printInvoice(item: Item) {
        println("Printing invoice.")
        println(item)
    }
}

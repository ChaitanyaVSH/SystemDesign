package system.design.solid.s

import system.design.solid.common.Item

class InvoiceUploader {
    fun uploadInvoice(item: Item) {
        println("Saving invoice to database.")
        println(item)
    }
}

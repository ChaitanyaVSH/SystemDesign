package system.design.solid.s

class InvoiceUploader {
    fun uploadInvoice(item: Item) {
        println("Saving invoice to database.")
        println(item)
    }
}

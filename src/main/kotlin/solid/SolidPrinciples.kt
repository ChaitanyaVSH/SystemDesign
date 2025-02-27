package system.design.solid

import system.design.solid.s.Invoice
import system.design.solid.s.InvoicePrinter
import system.design.solid.s.InvoiceUploader


fun main() {
    val invoice: Invoice = Invoice()
    val printer: InvoicePrinter = InvoicePrinter()
    val uploader: InvoiceUploader = InvoiceUploader()

    printer.printInvoice(invoice.item)
    uploader.uploadInvoice(invoice.item)

    /**
     * Here the classes like Invoice, InvoicePrinter, InvoiceSaver has only one responsibility for each class.
     */
}

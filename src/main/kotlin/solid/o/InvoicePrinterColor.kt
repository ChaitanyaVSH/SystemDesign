package system.design.solid.o

import system.design.solid.s.Invoice

class InvoicePrinterColor : InvoicePrinter {
    override fun printInvoice(invoice: Invoice) {
        println("COLOR PRINTER :: ")
        println("Printing invoice ${invoice.item}")
    }
}

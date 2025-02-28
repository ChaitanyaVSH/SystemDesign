package system.design.solid.o

import system.design.solid.s.Invoice

interface InvoicePrinter {
    fun printInvoice(invoice: Invoice)
}

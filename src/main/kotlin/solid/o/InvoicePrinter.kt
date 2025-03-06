package system.design.solid.o

import system.design.solid.common.Invoice

interface InvoicePrinter {
    fun printInvoice(invoice: Invoice)
}

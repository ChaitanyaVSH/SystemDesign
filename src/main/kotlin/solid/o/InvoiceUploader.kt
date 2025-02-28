package system.design.solid.o

import system.design.solid.s.Invoice

interface InvoiceUploader {
    fun uploadInvoice(invoice: Invoice)
}

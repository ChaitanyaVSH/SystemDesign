package system.design.solid.o

import system.design.solid.common.Invoice

interface InvoiceUploader {
    fun uploadInvoice(invoice: Invoice)
}

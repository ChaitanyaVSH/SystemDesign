package system.design.solid.o

import system.design.solid.common.Invoice

class InvoiceUploaderDDB : InvoiceUploader {
    override fun uploadInvoice(invoice: Invoice) {
        println("UPLOADING TO DDB")
        println("Uploaded to DDB ${invoice.item}")
    }
}

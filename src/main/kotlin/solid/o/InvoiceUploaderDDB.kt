package system.design.solid.o

import system.design.solid.s.Invoice

class InvoiceUploaderDDB : InvoiceUploader {
    override fun uploadInvoice(invoice: Invoice) {
        println("UPLOADING TO DDB")
        println("Uploaded to DDB ${invoice.item}")
    }
}

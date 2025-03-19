package system.design.solid.d

import system.design.solid.common.Invoice

class InvoiceService(val dataBase: DataBase) {
    fun saveInvoice(invoice: Invoice) {
        dataBase.save("Saving invoice. $invoice")
    }
}

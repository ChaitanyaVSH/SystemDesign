package system.design.solid.d

import system.design.solid.common.Invoice

class InvoiceService {
    private val dataBase: DataBase;
    init {
        dataBase = DDBDataBase()
    }

    fun saveInvoice(invoice: Invoice) {
        dataBase.save("Saving invoice. $invoice")
    }
}

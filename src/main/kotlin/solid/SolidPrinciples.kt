package system.design.solid

import system.design.solid.I.Correct.DataBaseEngineer
import system.design.solid.I.Correct.WebDeveloper
import system.design.solid.I.Incorrect.BackendEngineer
import system.design.solid.I.Incorrect.FrontendEngineer
import system.design.solid.o.InvoicePrinterColor
import system.design.solid.o.InvoiceUploaderDDB
import system.design.solid.common.Invoice
import system.design.solid.s.InvoicePrinter
import system.design.solid.s.InvoiceUploader
import system.design.solid.common.Item
import system.design.solid.d.CassandraDataBase
import system.design.solid.d.DDBDataBase
import system.design.solid.d.InvoiceService
import system.design.solid.l.BullockCart
import system.design.solid.l.MotorCycle
import system.design.solid.l.Vehicle

// Helper functions
fun log(message: String? = null) = println(message ?: "##############################################")


fun main() {
    /**
     * S: Single responsibility principle
     *
     * Each class should have only 1 reason to change
     * Here, InvoicePrinter has only one responsibility, which is printing.
     * Similarly, InvoiceUploader also has only one responsibility, which is uploading.
     */
    log()
    val apple = Item("Apple", 50)
    val invoice: Invoice = Invoice(item = apple)
    val printer: InvoicePrinter = InvoicePrinter()
    val uploader: InvoiceUploader = InvoiceUploader()

    printer.printInvoice(invoice.item)
    uploader.uploadInvoice(invoice.item)
    log()

    /**
     *
     * O: Open for extension and closed for modification
     *
     * We should use interfaces, so that existing functionality will be extended instead of modification.
     */
    log()
    val banana = Item("Banana", 20)
    val invoiceTwo = Invoice(item = banana)
    val printerColor: system.design.solid.o.InvoicePrinter = InvoicePrinterColor()
    val ddbUploader: system.design.solid.o.InvoiceUploader = InvoiceUploaderDDB()

    printerColor.printInvoice(invoiceTwo)
    ddbUploader.uploadInvoice(invoiceTwo)
    log()


    /**
     * L: Liskov Substitute principle
     *
     * Subclasses should not break the existing functionality of super classes.
     */
    log()
    val listOfVehicles: List<Vehicle> = listOf(MotorCycle(), BullockCart())
    log("Below code throws error because BullockCart is reducing the functionality of Vehicle.")
    try {
        listOfVehicles.forEach { vehicle: Vehicle ->
            with(vehicle){
                startEngine()
                stopEngine()
            }
        }
    } catch (e: Error) {
        log(e.message)
    }
    log()


    /**
     * I: Interface Segregation principle.
     *
     * Interfaces should be defined at a granular level, so that implementations do not need to override
     * unnecessary behaviour of the interfaces.
     */
    log()
    val frontendEngineer = FrontendEngineer()
    try {
        frontendEngineer.designDataBase()
    } catch (e: Error) {
        log(e.message)
    }

    val backendEngineer = BackendEngineer()
    try {
        backendEngineer.writeFrontendCode()
    } catch (e: Error) {
        log(e.message)
    }

    val webDeveloper = WebDeveloper()
    webDeveloper.writeFrontendCode()
    webDeveloper.writeHTMLAndCSS()

    val dataBaseEngineer = DataBaseEngineer()
    dataBaseEngineer.designDataBase()

    /**
     * D: Dependency inversion principle
     *
     * High level modules should not depend on low level modules, instead they should depend on abstraction.
     * Abstraction should not depend on details, instead details should depend on abstraction.
     */
    log()
    val dataBase = DDBDataBase();
    var invoiceService = InvoiceService(dataBase)
    invoiceService.saveInvoice(invoice)

    val cassandraDataBase = CassandraDataBase();
    invoiceService = InvoiceService(cassandraDataBase)
    invoiceService.saveInvoice(invoice)
}

package system.design.solid.I.Incorrect

class BackendEngineer : Engineer {
    override fun writeFrontendCode() {
        throw Error("Backend engineer does not own the responsibility :: writeFrontendCode")
    }

    override fun writeHTMLAndCSS() {
        throw Error("Backend engineer does not own the responsibility :: writeHTMLAndCSS")
    }

    override fun designDataBase() {
        println("Designing databases")
    }

    override fun designMicroServices() {
        println("Designing microservices")
    }
}

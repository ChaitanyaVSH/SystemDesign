package system.design.solid.I.Incorrect

class FrontendEngineer : Engineer {
    override fun writeFrontendCode() {
        println("Writing vanilla JavaScript")
    }

    override fun writeHTMLAndCSS() {
        println("Writing HTML and CSS")
    }

    override fun designDataBase() {
        throw Error("Frontend engineer does not own the responsibility :: designDataBase")
    }

    override fun designMicroServices() {
        throw Error("Frontend engineer does not own the responsibility :: designMicroServices")
    }
}

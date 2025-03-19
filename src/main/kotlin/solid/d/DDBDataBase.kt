package system.design.solid.d

class DDBDataBase : DataBase {
    override fun save(data: String) {
        println("Saving data to Dynamo DB. $data")
    }
}

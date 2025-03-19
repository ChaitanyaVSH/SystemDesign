package system.design.solid.d

class CassandraDataBase : DataBase {
    override fun save(data: String) {
        println("Saving data to Cassandra DB. $data")
    }
}

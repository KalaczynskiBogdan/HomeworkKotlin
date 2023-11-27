package hw14.exercise1

class DatabaseConnection {
    companion object{
        var url: String = ""
        fun connect(){
            println("Connecting to the database using URL: $url")
        }
    }
}
fun main(){
    val databaseConnection = DatabaseConnection()
    DatabaseConnection.url = "https://kotlin.com"
    DatabaseConnection.connect()
}
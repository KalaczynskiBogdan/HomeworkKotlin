package classswork1.cl3

class Person() {
    var name: String = "Bohdan"
    var age: Int = 22

}
fun main(){
    val alice = Person().run {
        name = "Alice"
        age = 25
    }

    val array = listOf<String>("apple", "banana", "blackberry")
    val max = array.run {
        this.maxByOrNull { it.length }
    }
    max?.run {
        println(this)
    }
}
package hw13.exercise3

class Person(private val name: String) : Possibilities {
    override fun work() {
        println("$name can work")
    }

    override fun earnMoney() {
        println("$name can earnMoney")
    }

    override fun sleep() {
        println("$name can sleep")
    }
}
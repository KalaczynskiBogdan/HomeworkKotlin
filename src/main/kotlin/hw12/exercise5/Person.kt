package hw12.exercise5

class Person(
    private val name: String,
    private var age: Int = 0
) : Displayable {
    override fun display() {
        println("Person name: $name, person age: $age")
    }
}
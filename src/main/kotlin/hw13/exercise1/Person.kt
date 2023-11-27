package hw13.exercise1

class Person {
    private var name: String? = null

    fun sayHello(person: Person){
        if (person.name != null){
        println("Hello, ${person.name}")
        }
        else println("Hello, anonym")
    }
}

fun main(){
    val bohdan = Person()
    bohdan.sayHello(bohdan)
}
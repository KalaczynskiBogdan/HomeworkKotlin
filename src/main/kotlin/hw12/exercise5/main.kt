package hw12.exercise5

fun main(args: Array<String>) {
    val bohdan = Person("Bohdan", 22)
    val anya = Person("Anya", 21)
    val people = mapOf("Bohdan" to bohdan, "Anya" to anya)
    for (person in people) {
        person.value.display()
    }
}
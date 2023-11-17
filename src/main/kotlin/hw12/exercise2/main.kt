package hw12.exercise2

fun main(args: Array<String>) {
    val numbers: MutableList<Int> = mutableListOf(1, 3, 2, 0, 5)
    for (i in numbers) {
        println(i)
    }
    numbers.add(0, 10)
    for (i in numbers) {
        println(i)
    }
}
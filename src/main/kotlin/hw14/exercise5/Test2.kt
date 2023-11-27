package hw14.exercise5

fun main() {
    val listOfNums = listOf<Int>(1, 2, 3, 4, 5)
    val listOfNumsByWords = listOfNums.map {
        when (it) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            else -> "error"
        }
    }
    println(listOfNumsByWords)
}
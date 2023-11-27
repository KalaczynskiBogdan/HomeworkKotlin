package classswork1

fun String.reverseText(): String {
    return this.reversed()
}

fun Int.multiplyBy(a: Int, b: Int): Int {
    return this * a * b
}

fun String.countOfVowels():Int{
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return this.count{it in vowels}
}

fun MutableList<String>.clearList(vararg elements: String){
    this.clear()
    this.addAll(elements)


}
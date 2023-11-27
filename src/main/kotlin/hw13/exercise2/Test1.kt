package hw13.exercise1

import java.util.*

fun String.textToUpperCase(): String{
    return this.uppercase(Locale.getDefault()).trim()
}
fun main(){
    val text = "   Hello, Dmitriy   "
    val result = text.textToUpperCase()
    println(result)
}
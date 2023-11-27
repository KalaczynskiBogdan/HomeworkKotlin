package classswork1.cl3

import java.util.*

fun main(){
    val text: String = "Kotlin is awesome!"
    text.let {
        it.uppercase(Locale.getDefault())
    }.let { println(it) }

    val array = listOf<Int>(1,2,3,4,5)
    array.let { list ->
        val sum = list.sum()
        println(sum)
    }

}
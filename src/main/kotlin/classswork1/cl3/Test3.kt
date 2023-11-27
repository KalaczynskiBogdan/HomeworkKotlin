package classswork1.cl3

fun main(){
    val array = mutableListOf<Int>()
    array.also {
        for (i in 1..5) {
            it.add(i)
        }
    }.also { println(it) }

    val text: StringBuilder = StringBuilder("world")
    text.also {
        it.insert(0, "Hello ")
    }.also { println(it) }

}
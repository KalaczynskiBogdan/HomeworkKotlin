package hw14.exercise4

fun main(){
    val list = listOf<String>("cat", "dog", "elephant", "lion")
    val listLessThan5 = list.filter {
        it.length<5
    }
    println(listLessThan5)
}
package classswork1.cl3

class Book {
     var title: String = "Title"
     var author: String = "Author"
}
fun main(){
    val book1 = Book().apply {
        title = "The Kotlin Book"
        author = "John Doe"
    }

    val array = mutableListOf<String>()
    array.apply {
        this.add("Hi")
        this.add("Hello")
    }.apply { println(this) }
}
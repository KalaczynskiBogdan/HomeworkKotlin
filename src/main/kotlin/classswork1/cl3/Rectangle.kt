package classswork1.cl3

class Rectangle {
    var length = 6
    var width = 4
}
fun main(){
    val rectangle = with(Rectangle()) {
        println("Area of rectangle is ${6 * 4}")
    }
}
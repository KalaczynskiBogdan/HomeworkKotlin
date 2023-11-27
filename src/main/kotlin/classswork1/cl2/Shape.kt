package classswork1.cl2

interface Shape {
    fun area()
}
fun main(){
    val a = 5
    val b = 10
    val rectangle = object : Shape{
        override fun area() {
            val areaOfRectangle = a+b
        }
    }
}
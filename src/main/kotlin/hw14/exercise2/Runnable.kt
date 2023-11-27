package hw14.exercise2

interface Runnable {
    fun run()
}
fun runTask(runnable: Runnable) {
    runnable.run()
}
fun main(){
    val test = object : Runnable {
        override fun run() {
            println("this test is running")
        }
    }
    runTask(test)
}
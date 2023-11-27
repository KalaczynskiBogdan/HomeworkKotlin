package hw14.exercise3

class Logger(private val name: String) {
    fun log(message: String) {
        println("[$name], $message")
    }
}
object LoggerManager {
    fun getLogger(logger: Logger): Logger {
        return logger
    }
}

fun main() {
    val logger = Logger("MainLogger")
    val loggerTest = LoggerManager.getLogger(logger)
    logger.log("this is the message")
}
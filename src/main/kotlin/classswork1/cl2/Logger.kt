package classswork1.cl2

class Logger {
    companion object {
        var logLevel: String = "logLevel"
        fun log(message: String, level: String = logLevel){
            if (isLogLevelEnabled(level)) {
                println("[$level] $message")
            }
        }

        private fun isLogLevelEnabled(level: String): Boolean {
            val enabledLevels = listOf<String>("First", "Second", "Third")
            return enabledLevels.contains(level)
        }
    }
}
fun main(args: Array<String>){
    Logger.log("This message will not display", "Error")
    Logger.log("This message has warning", "Warning")
}
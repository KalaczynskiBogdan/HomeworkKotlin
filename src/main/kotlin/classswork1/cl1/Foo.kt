package classswork1.cl1

interface Foo {
    fun print()
    fun getInfo()
}
class PrinterClass():Foo{
    override fun print() {
        println("I am printer")
    }

    override fun getInfo() {
    }
}

class OtherPrinterClass(printerClass: PrinterClass):Foo by printerClass{
    override fun print() {
        TODO("Not yet implemented")
    }
}




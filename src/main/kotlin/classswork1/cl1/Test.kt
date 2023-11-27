package classswork1.cl1

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class TextDelegate : ReadWriteProperty<Any, String>{
    var text: String = ""
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return text.uppercase()
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        text = value.lowercase()
    }
}
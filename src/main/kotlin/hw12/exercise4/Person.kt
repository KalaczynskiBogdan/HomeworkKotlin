package hw12.exercise4

class Person {
    private var _age = 1
    var age: Int
        set(value) {
            if ((value > 0) and (value < 110))
                _age = value

        }
        get() = _age

    private var _name = ""
    var name: String
        set(value) {
            _name = value
        }
        get() = _name
}
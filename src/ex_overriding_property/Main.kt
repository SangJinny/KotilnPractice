package ex_overriding_property

open class AAA {
    open var number = 10
    get(){
        println("AAA getter")
        return field
    }
    set(value) {
        println("AAA setter")
        field = value
    }
}

class BBB:AAA() {
    override var number:Int
        get() {
            println("BBB getter")
            return super.number
        }
        set(value) {
            println("BBB setter")
            super.number = value
        }
}

fun main(args:Array<String>) {
    val test = BBB()
    test.number = 5
    test.number
}

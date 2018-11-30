package ex_starter

fun main(args:Array<String>) {
    println(getAverage(89, 96, true))
}

fun getAverage(a:Int=0, b:Int = 0, print:Boolean = false):Double {
    val result = (a+b) / 2.0
    if(print) {
        println(result)
    }
    return result
}
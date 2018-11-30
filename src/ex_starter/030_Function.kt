package ex_starter

fun main(args:Array<String>):Unit {
    println(myFunction())
    println(myFunction2(2, 8) +10)
}

fun myFunction():Int {
    val a = 3
    val b = 6
    println("a:$a b:$b")
    return a+b
}

fun myFunction2(a:Int, b:Int) = a+b
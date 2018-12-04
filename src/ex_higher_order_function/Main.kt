package ex_higher_order_function

fun decorate(task:()->Unit) {
    println("=== start ===")
    task()
    println("=== end ===")
}

fun main(args:Array<String>) {
    decorate ({
        val a = 10
        val b= 5
        println("$a+$b = ${a+b}")
    })
    decorate {
        println("some")
        println("tasks")
    } // 이렇게 소괄호 생략도 가능.
}
package ex_starter

fun main(args:Array<String>):Unit {
    val value:Int = if(10>5) {
        println("10 is larger than 5")
        10 // 이 마지막 라인이 return된다.
    } else {
        println("10 is smaller than 5")
        5
    }

    println(value)
}
/* 삼항연산자처럼 사용 가능할듯 */

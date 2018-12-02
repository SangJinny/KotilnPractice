package ex_exception_handling

import java.lang.NumberFormatException

fun main(args:Array<String>) {
    try{
        val str = "abcd"
        val num = str.toInt()

        println(num)
    } catch(e:NumberFormatException) {
        println("exception occurred")
    } finally {
        println("end")
    }
}
/* 코틀린에서는 throws 키워드가 없다. 즉 함수 호출자에게 익셉션을 던지는 것이 불가능.*/

fun validate(num:Int) {
    val result:Int = if(num > 0) num
                        else throw Exception("exception")

    /*throw는 Nothing type이다. 만약 nothing type이 아니라면
    * else 블록의 리턴이 Unit 타입이 되어, 위와 같이 코딩할 수 없다.
    * 근데 nothing이니까 if...else블록의 리턴값은 Int로 정상 인식(if는 Int, else는 nothing이므로..)된다.*/
}
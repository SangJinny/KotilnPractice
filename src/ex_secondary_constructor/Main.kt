package ex_secondary_constructor

class Time(val second:Int) {
    init {
        println("init블록 실행중")
    }
    constructor(minute:Int, second: Int):this(minute * 60+second){
        println("보조생성자1 실행")
    }

    constructor(hour:Int, minute:Int, second: Int):this(hour * 60+minute,second){
        println("보조생성자2 실행")
    }

    init {
        println("init블록2 실행중")
    }

}

fun main(args:Array<String>) {
    println("${Time(15,6).second}")
    println("${Time(6,3,17).second}")
}
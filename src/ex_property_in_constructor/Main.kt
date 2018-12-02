package ex_property_in_constructor

/* 프로퍼티와 생성자를 한번에 작성하기*/
class MyCar(val name:String, val speed:Int = 0)

fun main(args:Array<String>) {
    val car = MyCar("sonata")
    println(car.name)
    println(car.speed)
}
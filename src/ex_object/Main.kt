package ex_object

class Person { // kotlin의 기본 접근지정자는 default가 아닌 public임.
    var name:String=""
    var age:Int = 0
}
fun main(arg:Array<String>) {

    val person:Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    println(person.name)
    println(person.age)
}
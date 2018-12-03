package ex_companion_object

class Person private constructor() {

    companion object {
        fun create():Person {
            countCreated += 1
            return Person()
        }

        var countCreated = 0
        private set
    } /*클래스 안에서만 생성가능. java의 static과 비슷한 효과.*/
}

fun main(args:Array<String>) {
    val a = Person.create()
    val b = Person.create()
    println(Person.countCreated)
}
package ex_object_declaration

object Person {
    var name:String=""
    var age:Int = 0
    fun print() {
        println(name)
        println(age)
    }
} /* Java의 singleton과 같은 효과 */

fun main(args:Array<String>) {
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}
package ex_range

fun main (args:Array<String>) {
    val oneToTen:IntRange = 1..10
    println(5 in oneToTen)

    val upperAtoZ:CharRange = 'A'..'Z'

    if('C' in upperAtoZ) println("대문자")

    if('p' in 'a'..'z') println("소문자")
}
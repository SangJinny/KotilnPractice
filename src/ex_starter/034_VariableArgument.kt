package ex_starter

fun main(args:Array<String>) {
    println(getSumOf(1, 2, 3, 4, 5, 6, 7))
    println(getSumOf(32, 57, 12))
    println(getSumOf())

}

fun getSumOf(vararg numbers:Int):Int {
    var i = 0; var sum = 0
    while(i < numbers.size) {
        sum += numbers[i]
        i++
    }

    return sum
}
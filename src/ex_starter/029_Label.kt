package ex_starter

fun main(args:Array<String>):Unit {
    var x = 0
    var y = 0

    outer@while(x<=20) {
        y = 0
        while(y <= 20) {
            if(x+y == 15 && x-y == 5) {
                break@outer // @outer에 해당하는 반복문을 탈출함..
            }
            y += 1
        }
        x += 1
    }

    println("x:$x, y:$y")
}
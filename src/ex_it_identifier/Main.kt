package ex_it_identifier

/* lambda에서 parameter가 1개면 생략 가능 */
fun main(args:Array<String>) {
    val instantFunc:(Int) -> Unit = {
        println("Hello $it")
    }

    instantFunc(33)
}
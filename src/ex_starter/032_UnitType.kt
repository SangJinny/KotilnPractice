package ex_starter

fun main(args:Array<String>) {
    celsiusToFah(27)
}

fun celsiusToFah(celsius:Int) {
    println(celsius * 1.8 + 32)
}

// function의 return type을 생략하면 자동으로 Unit이 된다.
// Unit은 JAVA의 void와 비슷한 개념이고, Unit타입을 리턴하는 함수는 return 구문을 생략할 수 있다.
// Unit 객체는 싱글톤 인스턴스이다.
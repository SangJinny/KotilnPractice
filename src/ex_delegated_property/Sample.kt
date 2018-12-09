package ex_delegated_property

class Sample {
    var number: Int by OnlyPositive() // 변수에 by구문을 써서 위임!!
}
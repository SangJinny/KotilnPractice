package ex_property_getter_setter

class Person {
    var age:Int = 0
    get() {
        return field
    }
    set(value) {
        field = if(value >= 0) value else 0
    }

    /* 우리가 getter setter를 정의하지 않으면 아래와 같이 default로 정의된다.*/
    /*
    get() {

        return field
    }
    set(value) {
        field = value
    }
    */
}
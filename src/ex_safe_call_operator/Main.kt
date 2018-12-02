package ex_safe_call_operator

class Building(var name:String , var date:String, var area:String) {
    fun print(){
        println("name: $name date: $date area: $area")
    }
}
fun main(args:Array<String>) {
    var obj:Building? = null
    obj?.print()
    // obj.name -> compile error
    // obj!!.name -> exception occurred
    obj?.name="건물"

    obj = Building("seoul", "2000-01-12", "11")
    obj?.print()
}
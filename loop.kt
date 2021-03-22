import java.util.Random
fun funIfElse(a: Int, b: Int, c: Int) : Int{
    // Kotlin does't have triple condition operator
    var max : Int = -100 // val variable can not be reassigned 
    if (max < a){
        max = a
    }
    if (max < b){
        max = b
    }
    if (max < c) {
        max = c
    }
    return max
}

fun fonFor(list : Array<Int>) : String {
    for (  i in list.indices){
        println(list[i])
    }
    var max : Int = -100 // val variable can not be reassigned
    for ((index, value) in list.withIndex()){
        if (max < value){
            max = value
        }
    }
    return "Max of list is " + max
}
fun whenFun(day : String) : String {
    when (day){
        "First" -> return "Today is monday"
        "Second" -> return "Today is tuesday"
        "Third" -> return "Today is wednesday"
        else -> {
            return "not exist"
        }
    }
}

fun quickSort(list : Array<Int>) : Array<Int> {
    var size = list.size
    if (size <= 1 ) return list
    var prevot = size/2
    var 

}

fun main () {
    val a : Int = 1
    val b : Int = 2
    val c : Int = 3
    println("max is " + funIfElse(a, b, c))
    // declare and assign values for Array of Integer
    // this Array of Integer is not primitive datatype , it equals to Int[10] in Java
    // var arr = IntArray(10) {i-> i*i} : this kind of arr is primitive datatype. It equals to int[10] in java
    val arr = Array<Int>(10) { index -> index- index*index - 100}  // full, verbose syntax
    println(fonFor(arr))
    var today = "First"
    print(whenFun(today))
}
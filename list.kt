data class Person(var name : String, var age : Int)
fun main() {
    val numbers = listOf("One", "Two", "Three", "Four")
    println("Number of elements : ${numbers.size}")
    println("Third elemen: ${numbers.get(2)}")
    println("Fourth elemen: ${numbers.get(3)}")
    println("Index of element \"two\" ${numbers.indexOf("Two")}")

    // -----Two lists are considered equal if they have the same sizes and 
    // -----structurally equal elements at the same positions.
    val bob = Person("Bob", 31)
    var b = Person("Bob",31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)
    /*
    compare every element in the corresponding position 
    */

    /*
    MutableList<T> is a List with list-specific write operations, for example,
     to add or remove an element at a specific position.
    */
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

    /*    
    iterate list 
    */
    val list = listOf("One", "Two", "Three")
 
    for (i in list.indices) {
        println(list[i])
    }
}
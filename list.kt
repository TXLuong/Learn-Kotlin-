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
    /**
     * specific methods of list in Kotlin : binarySearch() 
     * return index of element 
     * if data type of element is primitive then dont have to define comparator 
     * else define comparator : compareBy< data_type_of_element > (it.field_name_of_element) 
     */
    val productList = listOf(
        Product("WebStorm", 49.0),
        Product("AppCode", 99.0),
        Product("DotTrace", 129.0),
        Product("ReSharper", 149.0))

    println(productList.binarySearch(Product("AppCode", 99.0), compareBy<Product> { it.price }.thenBy { it.name }))

    //************************************************************************************************ */
    /**
     * find index 
     */
    val numbers = mutableListOf(1, 2, 3, 4)
    println(numbers.indexOfFirst { it > 2})
    println(numbers.indexOfLast{ it % 2 == 1})

    /** 
    * remove at index
    * MutableList: A generic ordered collection of elements that supports adding and removing elements.
    * You can modify a MutableList: change, remove, add... its elements. In a List you can only read them
    */
    val numbers = mutableListOf(1, 2, 3, 4, 3)    
    numbers.removeAt(1)
    println(numbers)

    /* 
    * 
    */
    val numbers = mutableListOf("one", "two", "three", "four")

    numbers.sort()
    println("Sort into ascending: $numbers")
    numbers.sortDescending()
    println("Sort into descending: $numbers")

    numbers.sortBy { it.length }
    println("Sort into ascending by length: $numbers")
    numbers.sortByDescending { it.last() }
    println("Sort into descending by the last letter: $numbers")

    numbers.sortWith(compareBy<String> { it.length }.thenBy { it })
    println("Sort by Comparator: $numbers")

    numbers.shuffle()
    println("Shuffle: $numbers")

    numbers.reverse()
    println("Reverse: $numbers")

    /** 
    * declare mutable list 
    */
    val mutabaleList = mutableListOf<String>()
    

}
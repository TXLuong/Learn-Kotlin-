fun main() {

    /**
     * Set<T> stores unique elements; their order is generally undefined.
     *  null elements are unique as well: a Set can contain only one null. 
     * Two sets are equal if they have the same size
     * , and for each element of a set there is an equal element in the other set
     */
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4,11,4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")


    /****************************************************************
     * 
     * iterate a set 
     */
    val words = setOf("pen", "cup", "dog", "person",
    "cement", "coal", "spectacles")

    words.forEach { e -> print("$e ") }
    println()

    for (word in words) {

    print("$word ")
    }

    println()

    for (i in 0 until words.size) {

    print("${words.elementAt(i)} ")
    }

    println()

    words.forEachIndexed({i, e -> println("$i - $e")})

    val it: Iterator<String> = words.asIterable().iterator()

    while (it.hasNext()) {

    val e = it.next()
    print("$e ")
    }

    println()

    /******
     * union, intersect and substract
     */
    val numbers = setOf("one", "two", "three")
    println(numbers union setOf("four", "five"))
    println(setOf("four", "five") union numbers)

    println(numbers intersect setOf("two", "one"))
    println(numbers subtract setOf("three", "four"))
    println(numbers subtract setOf("four", "three")) // same output

    
}
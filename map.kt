fun main() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    var list = setnumbersMap.keys 
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")    
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    /**
     * Two maps containing the equal pairs are equal regardless of the pair order.
     */
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)    
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numbersMap == anotherMap}")

    /**
     * MutableMap is a Map with map write operations, for example, you can add
     *  a new key-value pair or update the value associated with the given key.
    */
    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
    numbersMap.put("three", 3)
    numbersMap["one"] = 11
    println(numbersMap)


    /** 
     * Retrieve keys and values﻿
     */
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(numbersMap.get("one"))
    println(numbersMap["one"])
    println(numbersMap.getOrDefault("four", 10))
    println(numbersMap["five"])  
    println(numbersMap.keys)
    println(numbersMap.values)

    /*****
     * Plus and minus operators﻿
     */
    println(numbersMap + Pair("four", 4))
    println(numbersMap + Pair("one", 10))
    numbersMap -= "two"
    println(numbersMap)
    numbersMap -= "five"             //doesn't remove anything
    println(numbersMap)
    println(numbersMap - setOf("two", "four","one")) // substract a set of keys 


    /** **
     * filter by key and value
     */
    val filteredKeysMap = numbersMap.filterKeys { it.endsWith("1") }
    val filteredValuesMap = numbersMap.filterValues { it < 10 }

    println(filteredKeysMap)
    println(filteredValuesMap)

    /**
     * Remove entries
     */
    numbersMap.keys.remove("one")
    println(numbersMap)
    numbersMap.values.remove(3) // just remove the first entry with value 3
    println(numbersMap)
    
}
package org.example

fun main() {
    val array: IntArray = IntArray(10) { it * 2 } // O(N)
    array[0] = 1

    val list: List<String>  = listOf("a", "b", "c", "c") // O(N)
    list[1]

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c", "c") // O(N)
    mutableList.add("d")
    mutableList[1] = "e"
    mutableList.remove("c")

    val set = setOf("a", "b", "c", "c") // a, b, c O(1)
    set.contains("E")

    val mutableSet = mutableSetOf("a", "b", "c", "c") // a, b, c O(1)
    mutableSet.add("d")
    mutableSet.remove("d")

    val map: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3) // Dictionary O(1)
    val mutableMap: MutableMap<String, Int> = mutableMapOf("a" to 1, "b" to 2, "c" to 3)

    mutableMap["a"] = 2
    println(mutableMap["d"])

    val hashMap = HashMap<String, Int>() // Java implementation

    // Functional programming
    val myList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9,10)
    // Map returns a list of the same size
    val squareList = myList.map { it * it }

    val myMap = mapOf("a" to 1, "b" to 2, "c" to 3)
    // Map returns a list of pairs
    val myProcessedMap = myMap.map {
        it.key.uppercase() to it.value * it.value
    }.toMap() // Need to call toMap() to convert the list of pairs to a map

    val sumOfOddNumbers = myList.filter { it % 2 == 0 }.sum()

    val groupedByMod5: Map<Int, List<Int>> = myList
        .map { it * (it - 1)}
        .filter { it > 5 }
        .groupBy { it % 5 }


}
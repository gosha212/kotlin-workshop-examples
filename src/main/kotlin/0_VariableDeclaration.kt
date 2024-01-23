package org.example

fun main() {
    // How to declare variables
    val name = "World"  // String
    val name2: String = "World2"

    val age = 42    // Int
    val age2: Int = 42

    val c: Int
    c = 42  // Deferring initialization

    // age = 43 is not allowed

    var x = 5
    x = 6

    // Primitive types are Numbers (Int, Long ...), Booleans, Characters, Strings, Arrays
    val primitiveIntArray = IntArray(5, { 0 })  // === new int[5]
    val boxedIntArray = Array<Int>(5, { 0 })  //  === new Integer[5]

    primitiveIntArray[1] = 42
    boxedIntArray[1] = 42

    // Null safety
    val notNullString: String = "Hello" // notNullString = null is an error
    val nullableString: String? = null // nullableString.length is an error

    if (nullableString != null) {
        println(nullableString.length)
    } else {
        println(0)
    }

    println(nullableString?.length ?: 0)  //  ?: Elvis operator

    if (nullableString != null) {
        println(nullableString.length)
    }

    nullableString?.let { println(it.length) }

    println(nullableString!!.length) // Don't do this
}


package org.example

fun main() {
    val a = 10
    val b = 20

    var max = a
    if (a < b) max = b

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // As expression (if can "return" a value)
    max = if (a > b) a else b

    max = if (a > b) {
        a
    } else {
        b
    }

    when (a) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    val w = when(a) {
        1 -> "x == 1"
        2 -> "x == 2"
        else -> {
            "x is neither 1 nor 2"
        }
    }

    val collection = IntArray(10) { it * 2}
    for (item in collection) println(item)

    for (item in collection)  {
        println(item)
    }

    for (i in 1..3) {   // i in [1, 3]
        println(i)
    }
    for (i in 6 downTo 0 step 2) { // i in [6, 0], step 2
        println(i)
    }

    for (i in 1 until 10) { // i in [1, 10), 10 is excluded
        println(i)
    }

    for (i in collection.indices) {
        println(collection[i])
    }

    var x =0
    while (x < 10) {
        println(x)
        x++
    }

}
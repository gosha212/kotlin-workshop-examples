package org.example

fun main() {
    println(sum1(b = 2, a = 1))
    println(sum2(1, 2))
    println(sum3(1))
    printSum1(1, 2)
    printSum2(1, 2)

    val myInt = 1
    println(myInt.myExtensionFunction(2))

    println(1 myPlus 2)
    println(1.myPlus(2))

    val (a, b, c) = returnMultipleParameters3()
    println("$a $b $c")
}

/**
 * Function with two Int parameters and Int return type
 */
fun sum1(a: Int, b: Int): Int {
    return a + b
}

/**
 * Single expression function
 */
fun sum2(a: Int, b: Int) = a + b

/**
 * Default values
 */
fun sum3(a: Int, b: Int = 0) {
    println("sum of $a and $b is ${a + b}")
}

/**
 * Unit return type
 */
fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

/**
 * Unit return type can be omitted
 */
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun Int.myExtensionFunction(b: Int): Int {
    return this + b
}

/**
 * Infix extension function
 */
infix fun Int.myPlus(b: Int): Int {
    return this + b
}

fun returnMultipleParameters(): Pair<Int, String> {
    return Pair(1, "Hello")
}

fun returnMultipleParameters2(): Pair<Int, String> {
    return 1 to "Hello"
}

fun returnMultipleParameters3(): IntArray {
    return intArrayOf(1, 2, 3)
}
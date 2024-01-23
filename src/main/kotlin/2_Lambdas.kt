package org.example

fun main() {
    printMathOperation(1, 2, { a, b -> a + b })
    printMathOperation(1, 2, { a: Int, b: Int -> a + b })
    printMathOperation(1, 2, fun(a: Int, b: Int): Int {
        return a + b
    })
    printMathOperation(1, 2, fun(a: Int, b: Int): Int  = a + b)

    // Pay attention to the last parameter!
    printMathOperation(1, 2) { a, b -> a + b }
}

private fun printMathOperation(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int
) {
    println(operation(a, b))
}

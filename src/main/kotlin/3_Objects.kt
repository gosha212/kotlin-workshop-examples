package org.example

fun main() {
    val helloWorld = HelloWorld()
    helloWorld.sayHello()
    println(helloWorld.name)
    helloWorld.printNameAndAge()

    val helloConstructors = HelloConstructors("1", "3")
    println(helloConstructors.s)


    // Equals
    val user1a = User1("Alice", 42)
    val user1b = User1("Alice", 42)

    val user2a = User2("Alice", 42)
    val user2b = User2("Alice", 42)

    println(user1a == user1b) // True
    println(user2a == user2b) // False
    println(user1a === user1b) // False the objects are equal but are different instances

    val arr1 = IntArray(5) { 0 }
    val arr2 = IntArray(5) { 0 }

    arr1.contentEquals(arr2) // True
}


class HelloWorld {
    // Init block
    init {
        println("Hello World Constructor")
    }

    // Method
    fun sayHello() {
        println("Hello World Method")
    }

    // Property
    val name = "World"  // String

    // Private property
    private val age = 42    // Int

    // Method
    fun printNameAndAge() {
        println("Hello $name, Age: $age")
    }
}


class HelloConstructors(
    var s: String,   // Public property
) {    // Primary constructor

    // Init block executed after primary constructor
    init {
        s += "2"
    }

    // Secondary constructor
    constructor(s: String, u: String) : this(s) {
        this.s += u
    }
}

class MustInit() {
    lateinit var s: String

    // Bad practice
    fun setS(s: String) {
        this.s = s
    }
}

class Encapsulation {
    private var s: String = "Hello"

    fun getS(): String {
        return s
    }

    fun setS(s: String) {
        this.s = s
    }
}

class Encapsulation2 {
    var s: String
        get() = "Hello"
        set(value) {
            println(value)
        }

}

class Encapsulation3 {
    var s: String = "Hello"
        private set
}

class Encapsulation4 {
    private var _s: String = "Hello"
    var s: String
        private set(value) {
            println(value)
            _s = value
        }
        get() = _s
}

data class User1(val name: String, val age: Int)
class User2(val name: String, val age: Int)
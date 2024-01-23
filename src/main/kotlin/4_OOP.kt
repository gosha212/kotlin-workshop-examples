package org.example

interface MyInterface {
    fun myFunction()
}

open class MyClass : MyInterface {

    protected open val myProtectedProperty: String = "Protected"

    override fun myFunction() {
        println("Hello $myProtectedProperty World")
    }
}

class ExtendMyClass : MyClass() {

    override val myProtectedProperty
        get() = "Protected 2"

    override fun myFunction() {
        super.myFunction()
        println("Hello $myProtectedProperty World 2")
    }
}

abstract class MyAbstractClass() {
    abstract fun myAbstractFunction()

    fun myFunction2() {
        println("Hello World 3")
    }
}

class ExtendMyAbstractClass : MyAbstractClass() {
    override fun myAbstractFunction() {
        println("Hello World 4")
    }
}


interface MyInterfaceWithDefaultImplementation {
    fun myFunction()
    fun myFunction2() {
        println("Hello World 5")
    }
}

interface MySecondInterfaceWithDefaultImplementation {
    fun secondFunction()
    fun secondFunction2() {
        println("Hello World 6")
    }
}

class MyClassWithDefaultImplementation : MyInterfaceWithDefaultImplementation, MySecondInterfaceWithDefaultImplementation {
    override fun myFunction() {
        println("Hello World 7")
    }

    override fun secondFunction() {
        println("Hello World 8")
    }

    init {
        secondFunction2()
        myFunction2()
    }
}
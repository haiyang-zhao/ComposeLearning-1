package com.zhy.kotlinlearming.classes

import com.zhy.kotlinlearming.User


// companion object
// https://kotlinlang.org/docs/object-declarations.html#companion-objects

class MyClass {
    companion object {
        fun create() {

        }
    }
}

class MyClass1 {
    companion object Factory {
        fun create() {

        }
    }
}

interface Factory<T> {
    fun create(): T
}

class MyClass2 {
    companion object : Factory<MyClass2> {
        override fun create(): MyClass2 = MyClass2()
    }
}

interface Modifier {
    fun create()

    companion object : Modifier {
        override fun create() {
        }
    }
}

fun main() {
    MyClass.create()
    MyClass.Companion.create()
    MyClass1.create()
    MyClass1.Factory.create()
    MyClass2.create()

    val x = MyClass
    val y = MyClass1
    val z: Factory<MyClass2> = MyClass2

    Modifier.create()

    val arrays = arrayOf(1, 2, 3, 4)
    val foldResult = arrays.fold(0) { a, b ->
        println("$a,$b")
        a + b
    }
    println(foldResult)
}


fun getFullName(user: User?): String {
    return user?.let { "${it.firstName} ${it.lastName}" } ?: "Unknown"
}
package com.zhy.kotlinlearming.functions

//@LayoutScopeMarker
class AScope {
    fun visitA() {
        println("Hello A")
    }
}

//@LayoutScopeMarker
class BScope {
    fun visitB() {
        println("Hello B")
    }
}

fun funA(scope: AScope.(Int) -> Unit) {
    val aScope = AScope()
    aScope.scope(100)


}

fun funB(scope: BScope.() -> Unit) {
    scope(BScope())
}

fun main() {
    funA {
        println(it)
        funB {
            visitA() // 跨级访问
            visitB()
        }
    }
}

@DslMarker
annotation class LayoutScopeMarker
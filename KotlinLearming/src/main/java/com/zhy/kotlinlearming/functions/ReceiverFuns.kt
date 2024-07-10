package com.zhy.kotlinlearming.functions

class HTML {
    fun body() {

    }
}

fun html(init: HTML.(Int, String) -> Unit): HTML {
    val html = HTML()
    html.init(10, "Hello")
    return html
}

fun main() {
    html { p1, p2 ->
        println("$p1: $p2")
        body()
    }
}

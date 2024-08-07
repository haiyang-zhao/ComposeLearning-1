package com.zhy.compose.chapter04.app

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class CounterState {
    val counter: State<Int> get() = _counter
    private val _counter = mutableStateOf(0)

    fun increment() {
        _counter.value += 1
    }

    fun decrement() {
        if (_counter.value > 1) {
            _counter.value -= 1
        }
    }
}
package com.zhy.compose.chapter04.app

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel1 : ViewModel() {


    private val _counter = mutableIntStateOf(0)
    val counter: State<Int> = _counter


    fun increment() {
        _counter.intValue += 1
    }

    fun decrement() {
        if (_counter.intValue > 1) {
            _counter.intValue -= 1
        }
    }
}
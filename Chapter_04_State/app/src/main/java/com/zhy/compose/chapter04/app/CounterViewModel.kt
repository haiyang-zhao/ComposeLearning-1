package com.zhy.compose.chapter04.app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _counter: MutableLiveData<Int> = MutableLiveData(0)
    val counter: LiveData<Int> = _counter

    fun increment() {
        _counter.value = _counter.value!! + 1
    }

    fun decrement() {
        _counter.value = _counter.value!! - 1
    }
}
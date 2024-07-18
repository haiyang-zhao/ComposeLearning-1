package com.zhy.compose.chapter04.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.zhy.compose.chapter04.app.databinding.ActivityCounterBinding

class CounterActivity : ComponentActivity() {

    private lateinit var binding: ActivityCounterBinding
    private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_counter)

        binding.incrementBtn.setOnClickListener {
            counter++
            updateCounter()
        }

        binding.decrementionBtn.setOnClickListener {
            counter--
            updateCounter()
        }
    }

    private fun updateCounter() {
        binding.counter.text = " $counter "
    }
}
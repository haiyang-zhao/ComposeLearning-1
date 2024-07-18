package com.zhy.compose.chapter04.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.zhy.compose.chapter04.app.databinding.ActivityCounterBinding

class CounterActivity : ComponentActivity() {

    private lateinit var binding: ActivityCounterBinding
    private val viewModel by viewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_counter)

        binding.incrementBtn.setOnClickListener {
            viewModel.increment()
        }

        binding.decrementionBtn.setOnClickListener {
            viewModel.decrement()
        }
        viewModel.counter.observe(this) { counter ->
            binding.counter.text = " $counter "
        }
    }

}
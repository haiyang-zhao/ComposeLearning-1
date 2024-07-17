package com.zhy.compose.chapter04.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.zhy.compose.chapter04.app.databinding.ActivityCounterBinding

class CounterActivity : ComponentActivity() {

    private lateinit var binding: ActivityCounterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_counter)

        binding.incrementBtn.setOnClickListener{
            binding.counter.text = "${Integer.valueOf(binding.counter.text.toString())+1}"
        }

        binding.decrementionBtn.setOnClickListener{
            binding.counter.text = "${Integer.valueOf(binding.counter.text.toString())-1}"
        }
    }
}
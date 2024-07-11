package com.zhy.compose.chapter02.app

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zhy.compose.chapter02.app.ui.theme.ComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLearningTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxSize()) {
        val m1 = Modifier
            .size(300.dp)
            .background(Color.Red)
            .padding(10.dp)
            .pointerInput(Unit) {
            }
        m1.foldIn(0) { index, element ->
            Log.d(
                "composeLearning",
                "foldIn->index: $index , element :${element.javaClass.simpleName}"
            )
            index + 1
        }

        m1.foldOut(0) { element, index ->
            Log.d(
                "composeLearning",
                "foldOut->index: $index , element :${element.javaClass.simpleName}"
            )
            index + 1
        }

        Box(
            modifier = m1
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .matchParentSize()
                    .background(Color.Blue)
            ) {
                Text(
                    text = "Hello $name!",
                    modifier = modifier
                )
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeLearningTheme {
        Greeting("Android")
    }
}

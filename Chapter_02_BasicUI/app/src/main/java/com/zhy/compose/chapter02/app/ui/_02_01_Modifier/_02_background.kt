package com.zhy.compose.chapter02.app.ui._02_01_Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun ModifierBackground() {
    Row {
        Box(
            modifier = Modifier
                .align(Alignment.Bottom)
                .size(300.dp)
                .background(color = Color.Red)//设置纯色背景
        ) {
            Text(text = "纯色", Modifier.align(Alignment.Center))
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(
            Modifier
                .size(450.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Red, Color.Green, Color.Blue
                        )
                    )
                )
        ) {
            Text(text = "渐变色", Modifier.align(Alignment.Center))
        }
    }
}